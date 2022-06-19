package com;

/**
 * 14. 最长公共前缀-方法一：横向扫描
 */
public class Solution0014_1 {
    public String longestCommonPrefix(String[] strs) {
    if(strs==null||strs.length==0){ //字符串为空
            return "";
        }
        String prefix = strs[0];    //初始前缀为字符串数组的第一个字符串
        int count = strs.length;    //获取字符串的长度
        for(int i = 1;i < count;i++){
            prefix = longestCommonPrefix(prefix,strs[i]);   //两个参数，依次比较
            if(prefix.length()==0){
                break;  //没有公共前缀直接跳出
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {  //构造方法
        int length = Math.min(str1.length(),str2.length());     //两个字符串最小长度--扫描长度
        int index = 0;  //公共前缀的最后下标
        while(index<length&&str1.charAt(index)==str2.charAt(index)){    //相同，index指针向后移动
            index++;
        }
        return str1.substring(0,index);
    }
}
