package com.zhaopeng.service.impl;

import com.zhaopeng.bean.WeatherForecastBean;
import com.zhaopeng.config.ConfigBean;
import com.zhaopeng.config.QueryConstants;
import com.zhaopeng.service.WeatherForecastService;
import com.zhaopeng.utils.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class WeatherForecastServiceImpl implements WeatherForecastService {

    private static Logger log = LoggerFactory.getLogger(WeatherForecastService.class);

    @Autowired
    private ConfigBean configBean;

    private HttpUtil httpUtil = HttpUtil.getInstance();

    @Override
    public WeatherForecastBean getCurrentWeather(String queryType, String paramValue) throws IOException {
        WeatherForecastBean weatherInfo = processRequest(queryType, paramValue);
        return weatherInfo;
    }

    @Override
    public List<WeatherForecastBean> getFutureWeatherInfo(String queryParam) {
        return null;
    }

    private WeatherForecastBean processRequest(String queryType, String paramValue) throws IOException {
        String queryParam = "?";

        switch (queryType){
            case QueryConstants.TYPE_CITY:
                queryParam = queryParam + "q=" + paramValue;
                break;
            case QueryConstants.TYPE_ID:
            case QueryConstants.TYPE_ZIP:
                queryParam = queryParam + queryType + "=" + paramValue;
                break;
            default:
                break;
        }

        String requestUrl = buildRequestUrl(queryParam, configBean);
        log.info("request url : {}", requestUrl);
        return httpUtil.getData(requestUrl, WeatherForecastBean.class);

    }

    private String buildRequestUrl(String query, ConfigBean configBean){
        String url = configBean.getUrl();
        String celsiusUnit = configBean.getCelsius();
        String appId = configBean.getAppId();
        StringBuilder builder = new StringBuilder();

        builder.append(url);
        builder.append(query);
        builder.append("&");
        builder.append("units=").append(celsiusUnit);
        builder.append("&");
        builder.append("appId=").append(appId);
        return builder.toString();
    }


}
