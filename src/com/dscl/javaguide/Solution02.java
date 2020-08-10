package com.dscl.javaguide;

import java.util.HashSet;
/*构造最长回文串*/
public class Solution02 {

    public int longestPalindrome(String s){
        int count = 0;
        HashSet<Character> set = new HashSet<Character>();
        char[] charList = s.toCharArray();
        for(int i=0;i<charList.length;i++){
            if(!set.contains(charList[i])){
                set.add(charList[i]);
            }else if(set.contains(charList[i])){
                count++;
                set.remove(charList[i]);
            }
        }
        if(set.isEmpty()){
            count = count*2;
        }else if(!set.isEmpty()){
            count = count*2 + 1;
        }
        return count;
    }

}
