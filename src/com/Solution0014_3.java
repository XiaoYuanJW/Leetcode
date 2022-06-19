package com;

/**
 * 14. 最长公共前缀-方法三：分治法
 */
public class Solution0014_3 {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0) { //字符串为空
            return "";
        }else{
            return longestCommonPrefix(strs,0,strs.length - 1);
        }
    }

    public String longestCommonPrefix(String[] strs, int low, int high) {
        if(low == high){
            return strs[low];
        }else{
            int mid = (high+low)/2;
            String lcpLeft = longestCommonPrefix(strs,low,mid); //递归
            String lcpRight = longestCommonPrefix(strs,mid+1,high);
            return CommonPrefix(lcpLeft,lcpRight);
        }
    }

    public String CommonPrefix(String lcpLeft, String lcpRight) {
        int minLength = Math.min(lcpLeft.length(),lcpRight.length());
        for(int i = 0 ; i < minLength ; i++ ){
            if(lcpLeft.charAt(i)!= lcpRight.charAt(i)){
                return lcpLeft.substring(0,i);
            }
        }
        return lcpLeft.substring(0,minLength);
    }
}
