package com.zhaopeng.controller;

import com.zhaopeng.service.QueryConditionService;
import com.zhaopeng.service.WeatherForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/weather")
public class WeatherForecastController {

    @Autowired
    private WeatherForecastService weatherForecastService;

    @Autowired
    private QueryConditionService queryConditionService;

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public ModelAndView getWeatherForecasts(@RequestParam(name = "city") String city) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("currentWeather");
        modelAndView.addObject("cityList", queryConditionService.getCityList());
        if(null != city && !"".equals(city)) {
            modelAndView.addObject("currentWeather", weatherForecastService.getCurrentWeather(city));
            modelAndView.addObject("queryCity", city);
        }


        return modelAndView;
    }
}
