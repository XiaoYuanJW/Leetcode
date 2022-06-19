package com;

/**
 * 181. 超过经理收入的员工
 * Created by YuanJW on 2022/6/14.
 */
public class Solution0181 {
    // 方法一：内连接-INNER JOIN
    //SELECT e1.name as Employee FROM Employee e1 INNER JOIN Employee e2 ON e1.managerId = e2.id AND e1.salary > e2.salary
    // 方法二：子查询
    //SELECT e1.name as Employee FROM Employee e1, (SELECT id, salary FROM Employee) as e2 WHERE e1.managerId = e2.id and e1.salary > e2.salary
    // 方法三：WHERE
    //SELECT e1.name as Employee FROM Employee e1, Employee e2 WHERE e1.managerId = e2.id and e1.salary > e2.salary
}
