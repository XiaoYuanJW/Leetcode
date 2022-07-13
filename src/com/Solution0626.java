package com;

/**
 * 626. 换座位
 * Created by YuanJW on 2022/7/12.
 */
public class Solution0626 {
    // 方法一：CASE函数
    // SELECT (CASE WHEN MOD(id, 2) = 1 and id = (SELECT COUNT(*) FROM seat) THEN id WHEN MOD(id, 2) = 1 THEN id + 1 ELSE id - 1 END) as id, student FROM Seat ORDER BY id
}
