package com;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 20.有效的括号-方法一：栈
 */
public class Solution0020 {
    public boolean isValid(String s) {
        int len = s.length();
        if (len%2 != 0){
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>(){{/*键值对进行模式匹配*/
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();/*栈*/
        char[] chars = s.toCharArray();
        for (int i = 0; i < len ; i++) {
            if (pairs.containsKey(chars[i])) {/*匹配到右框号-模式识别*/
                if (stack.isEmpty()||stack.peek() != pairs.get(chars[i])){
                    return false;
                }
                stack.pop();
            } else {/*左括号入栈*/
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }
}
