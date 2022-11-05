package com.pikachu.bookmanger.utils;

import java.util.UUID;

/**
 * @Author: 橙子
 * @Date: 2022/11/5 23:50
 */
public class UuidUtils {
    public static String next(){
    return UUID.randomUUID().toString().replace("-","a");
  }
}
