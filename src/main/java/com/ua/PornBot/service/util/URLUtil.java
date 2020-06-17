package com.ua.PornBot.service.util;

public class URLUtil {

    public static String replaceWhiteSpaces(String url){

        return url.replaceAll("\\s+", "%20");

    }

}
