package com;

/**
 * 577.员工奖金
 * Created by YuanJW on 2022/7/11.
 */
public class Solution0577_1 {
    // 方法一：LEFT JOIN
    // SELECT e.name, b.bonus FROM Employee e LEFT JOIN Bonus b ON e.empId = b.empId WHERE bonus < 1000 or bonus IS NULL
    // TODO: UNION
    // SELECT e.name, b.bonus FROM Employee e LEFT JOIN Bonus b ON e.empId = b.empId WHERE bonus IS NULL UNION SELECT e.name, b.bonus FROM Employee e LEFT JOIN Bonus b ON e.empId = b.empId WHERE bonus < 1000
    // 方法二：LEFT JOIN + IFNULL函数
    // SELECT e.name, b.bonus FROM Employee e LEFT JOIN Bonus b ON e.empId = b.empId WHERE IFNULL(bonus, 0) < 1000
}
