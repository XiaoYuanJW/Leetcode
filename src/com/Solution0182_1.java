package com;

/**
 * 182. 查找重复的电子邮箱-方法一：使用临时表和GROUP BY
 */
public class Solution0182_1 {
    /*子表查询语句：SELECT Email,count(Email) as num FROM Person GROUP BY Email*/
    /*SELECT Email FROM (SELECT Email,count(Email) as num FROM Person GROUP BY Email) AS statistic WHERE num > 1*/
}
