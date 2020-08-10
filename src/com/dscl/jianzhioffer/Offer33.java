package com.dscl.jianzhioffer;

/*输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
*
示例 1：
输入: [1,6,3,2,5]
输出: false

* 示例 2：
输入: [1,3,2,6,5]
输出: true
*
* */

import java.util.Stack;

public class Offer33 {

    public static void main(String[] args){
        int[] a = {1,6,3,2,5};
        int[] b = {1,3,2,6,5};
//        System.out.println(verifyPostorder(a));
//        System.out.println(verifyPostorder(b));
        Stack<Integer> test = new Stack<>();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        System.out.println(test.peek());
        System.out.println(test.pop());

    }

    public static boolean verifyPostorder(int[] postorder) {
        if(postorder == null) return false;
        if(postorder.length == 1 )  return true;
        return recur(postorder,0,postorder.length-1);
    }
    static boolean recur(int[] postorder,int i,int j){
        /*递归出口，当i==j时 证明所有子树都已经执行完（符合条件）*/
        if(i>=j) return true;

        /*j的位置肯定是根节点（子树），小于j的都是左子树，大于j的都是右子树*/
        int p = i;
        while (postorder[p] < postorder[j]){
            p++;
        }
        int m = p;  //记录下左子树最后一个下标（的下一个）
        while (postorder[p] > postorder[j]){
            p++;
        }
        // 此时p移动到了右子树的最后一个下标（的下一个）

        /*以此递归左子树和右子树
        * 其中 p==j 是判断本次扫描是否符合条件，若符合条件，则p会最终移动到j位置，若不符合条件，则会直接返回false*/
        return p==j && recur(postorder,0,m-1) && recur(postorder,m,j-1);
    }




}
