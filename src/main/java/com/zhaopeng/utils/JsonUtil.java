package com.zhaopeng.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {

    private JsonUtil() {

    }

    public static <T> T json2Bean(String json, Class<T> tClass) {
        Gson gson = new Gson();
        return gson.fromJson(json, tClass);
    }

    public static <T> List<T> json2List(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<List<T>>(){}.getType();
        return gson.fromJson(json, type);
    }

    public static String list2Json(String json) {
        Gson gson = new Gson();
        return gson.toJson(json);
    }

    public static String Obj2Json(String json) {
        Gson gson = new Gson();
        return gson.toJson(json);
    }
}
