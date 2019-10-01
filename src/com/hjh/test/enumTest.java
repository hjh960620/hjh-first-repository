package com.hjh.test;

/**
 * Author Hu junhao
 * Create 2019/9/28
 */
public enum enumTest {
    AddUser("新增用户"),
    DeleteUser("删除用户"),
    ;

    private String type;

    enumTest(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }}
