package com;

/**
 * 619. 只出现一次的最大数字
 * Created by YuanJW on 2022/7/13.
 */
public class Solution0619_1 {
    // 方法一：子查询
    // SELECT MAX(num) as num FROM (SELECT COUNT(*) as count,num FROM MyNumbers GROUP BY num) t WHERE count = 1
    // SELECT MAX(num) as num FROM (SELECT num FROM MyNumbers GROUP BY num HAVING count(num) = 1) t
    // todo
}
