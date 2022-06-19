package com;

/**
 * 176. 第二高的薪水
 * Created by YuanJW on 2022/6/14.
 */
public class Solution0176 {
    // 方法一：LIMIT函数+子查询
    // SELECT (SELECT DISTINCT salary FROM employee ORDER BY salary DESC LIMIT 1, 1) as SecondHighestSalary
    // 方法二：LIMIT函数+IFNULL
    // SELECT IFNULL ((SELECT DISTINCT salary FROM employee ORDER BY salary DESC LIMIT 1, 1), null) as SecondHighestSalary
}
