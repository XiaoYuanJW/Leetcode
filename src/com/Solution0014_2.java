package com;

/**
 * 14. 最长公共前缀-方法二：纵向扫描
 */
public class Solution0014_2 {
    public String longestCommonPrefix(String[] strs) {
    if(strs==null||strs.length==0){ //字符串为空
            return "";
        }
        int length = strs[0].length();  //纵向扫描的最大次数
        int count = strs.length;    //每次纵向扫描需要比较的字符串个数
        for(int i = 0 ; i < length ; i++ ){
            char c = strs[0].charAt(i);
            for (int j = 0 ; j < count ; j++ ){
                if(i==strs[j].length()||strs[j].charAt(i)!=c){  //纵向扫描的最长公共前缀
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
