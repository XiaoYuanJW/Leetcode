package com.object;

/**
 * 季节枚举类
 * Created by YuanJW on 2022/6/17.
 */
public enum SeasonEnum {
    SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);
    private int seq;
    SeasonEnum(int seq) {
        this.seq = seq;
    }
}
