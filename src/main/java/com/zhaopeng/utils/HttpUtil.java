package com.zhaopeng.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpUtil {

    static HttpUtil httpUtil;

    OkHttpClient okHttpClient;

    private HttpUtil(){

        okHttpClient=new OkHttpClient();

    }

    public static HttpUtil getInstance(){

        if (httpUtil==null) {
            synchronized (HttpUtil.class)
            {
                if (httpUtil==null)
                {
                    httpUtil=new HttpUtil();
                }
            }
        }
        return httpUtil;

    }

    public <T> T getData(String url, Class<T> tClass) throws IOException {
        Request request =new Request.Builder().url(url).build();
        Response response = okHttpClient.newCall(request). execute();
        String jsonResult = response.body().string();
        System.out.println(jsonResult);
        return JsonUtil.json2Bean(jsonResult, tClass);
    }

}
