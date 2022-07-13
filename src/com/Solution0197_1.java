package com;

/**
 * 197. 上升的温度
 * Created by YuanJW on 2022/7/11.
 */
public class Solution0197_1 {
    // 方法一：cross join + datediff
    // SELECT w1.id AS id FROM Weather AS w1 CROSS JOIN Weather AS w2 ON datediff(w1.recordDate, w2.recordDate) = 1 WHERE w1.Temperature > w2.Temperature
    // 方法二：left join
    // SELECT w1.id AS id FROM Weather AS w1 LEFT JOIN Weather AS w2 ON datediff(w1.recordDate, w2.recordDate) = 1 WHERE w1.Temperature > w2.Temperature
    // 方法三：
    // SELECT w1.id FROM Weather AS w1, Weather AS w2 WHERE datediff(w1.recordDate, w2.recordDate) = 1 AND w1.Temperature > w2.Temperature
}
