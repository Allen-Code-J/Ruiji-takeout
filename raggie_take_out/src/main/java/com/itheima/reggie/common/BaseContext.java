package com.itheima.reggie.common;

/**
 * 基于ThreadLocal封装工具类，用户保存和获取用户当前登录id
 */
public class BaseContext {//某一个线程内
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */

    public static Long getCurrentId() {
        return threadLocal.get();
    }
}
