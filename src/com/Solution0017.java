package com;

import java.util.List;

/**
 * 17. 电话号码的字母组合
 */
public class Solution0017 {
    private String getStr(char c){
        switch (c){
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "qprs";
            case '8': return "tuv";
            case '9': return "wxyz";
            default: return null;
        }
    }
//    public List<String> letterCombinations(String digits) {
//
//    }
}
