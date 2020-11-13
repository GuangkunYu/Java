package com.utils;

/*
    查找指定名称cookie的工具类
 */

import javax.servlet.http.Cookie;

public class CookieUtils {
    public static Cookie findCookie(Cookie[] cookies, String name){
        if (cookies == null){
            // 浏览器没有携带任何的cookie
            return null;
        }else {
            for (Cookie cookie:cookies){
                // 判断数组中的每个cookie的名称与给定的名称是否一致
                if (name.equals(cookie.getName())){
                    // 直接返回
                    return cookie;
                }
            }
            // 浏览器带有cookie过来，但是没有指定名称的那个cookie
            return null;
        }

    }
}
