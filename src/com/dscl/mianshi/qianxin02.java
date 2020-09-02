package com.dscl.mianshi;

public class qianxin02 {

    public static void main(String[] args){
        int[] s = {1,2,3,4,5,6,1,2,3,4,9,8,7,6};
        System.out.println(house(s));
    }
    /**
     *
     * @param person int整型一维数组
     * @return int整型
     */
    public static int house (int[] person) {
        // write code here
        int len = person.length;
        int[] tag = new int[len];
        int[] res = new int[len];

        if(person[0] > person[1]){
            tag[0] = 1;
        }else {
            tag[0] = -1;
        }
        if(person[len-1] > person[len-2]){
            tag[len-1] = 1;
        }else {
            tag[len-1] = -1;
        }

        for(int i=1;i<len-1;i++){
            if(person[i] > person[i-1] && person[i] > person[i+1]){
                tag[i] = 1;
            }else if(person[i] <= person[i-1] && person[i] <= person[i+1]){
                tag[i] = -1;
            }else {
                tag[i] = 0;
            }
        }
        /*填充1*/
        for(int i=0;i<len;i++){
            if(tag[i] == -1){
                res[i] = 1;
            }
        }
        for(int i=0;i<len;i++){
            if(res[i] == 1){
                for(int j=i-1;j>=0;j--){
                    if(res[j] == 1){
                        break;
                    }
                    if(person[j] > person[j+1]){
                        if(tag[j] == 1){
                            res[j] = Math.max(res[j],res[j+1]+1);
                            break;
                        }else {
                            res[j] = res[j+1] + 1;

                        }
                        continue;
                    }
                    if(person[j] < person[j+1]){
                        break;
                    }
                }
                for(int j=i+1;j<len;j++){
                    if(res[j] == 1){
                        break;
                    }
                    if(person[j] > person[j-1]){
                        if(tag[j] == 1){
                            res[j] = Math.max(res[j-1]+1,res[j]);
                            break;
                        }else {
                            res[j] = res[j-1] + 1;
                        }
                        continue;
                    }
                    if(person[j] < person[j-1]){
                        break;
                    }
                }
            }
        }

        int result = 0;
        for(int x : res){
            result+=x;
        }
        return result;
    }
}
