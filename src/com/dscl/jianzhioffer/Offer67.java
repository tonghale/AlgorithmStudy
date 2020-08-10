package com.dscl.jianzhioffer;
/*字符串转整数*/
public class Offer67 {

    public static void main(String[] args){
        String test = " -1a23";
        int result = strToInt(test);
        System.out.println(result);
    }
    public static int strToInt(String str) {
        int length = str.length();
        if(length == 0){return 0;}
        char[] charList = str.trim().toCharArray();
        if(charList.length == 0){return 0;}
        //+ - 标识
        int sign = 1;
        int i=0; //数字开始的标识


        if(charList[0] == '-'){sign = -1; i = 1;}
        else if(charList[0] == '+'){sign = 1; i = 1;}
        else if(charList[0] != '-' && charList[0] != '+' && !Character.isDigit(charList[0])){return 0;}

        int res = 0; // 存放结果
        for(int j=i;j<charList.length;j++){
            if(charList[j] < '0' || charList[j] > '9'){
                break;
            }
            int tmp = charList[j]-'0';
            if(res > Integer.MAX_VALUE /10 || (res == Integer.MAX_VALUE / 10 && tmp >7)){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res = res*10 +tmp;
        }
        return sign*res;
    }
}
