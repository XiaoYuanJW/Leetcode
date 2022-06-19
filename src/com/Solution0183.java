package com;

/**
 * 183. 从不订购的客户
 * Created by YuanJW on 2022/6/14.
 */
public class Solution0183 {
    // 方法一：左连接+子查询
    //SELECT Name as Customers FROM (SELECT c.Id, c.Name, O.CustomerId FROM Customers c LEFT JOIN Orders o ON c.id = o.CustomerId ) as t WHERE CustomerId IS NULL
    // 方法二：NOT IN
    // SELECT Name as Customers FROM Customers WHERE id NOT IN (SELECT CustomerId FROM Orders)
}
