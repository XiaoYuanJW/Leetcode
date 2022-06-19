package com;

/**
 * 292. Nim 游戏-方法：数学推理（避免石头推中石子数为4的情况->如果堆里的石头数目为4的倍数时输掉游戏）
 */
public class Solution0292 {
    public boolean canWinNim(int n) {
        return n%4 != 0;
    }
}
