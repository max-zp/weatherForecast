package com.zhaopeng.controller;

import com.zhaopeng.config.QueryConstants;
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

    @RequestMapping(value = "/city/current", method = RequestMethod.GET)
    public ModelAndView getWeatherForecastsByCity(@RequestParam(name = "city") String city) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("currentWeather");
        modelAndView.addObject("cityList", queryConditionService.getCityList());
        if(null != city && !"".equals(city)) {
            modelAndView.addObject("currentWeather", weatherForecastService.getCurrentWeather(QueryConstants.TYPE_CITY,city));
            modelAndView.addObject("queryCity", city);
        }
        return modelAndView;
    }

    @RequestMapping(value = "/id/current", method = RequestMethod.GET)
    public ModelAndView getWeatherForecastsById(@RequestParam(name = "id") Integer id) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("currentWeather");
        modelAndView.addObject("cityList", queryConditionService.getCityList());
        if(null != id) {
            modelAndView.addObject("currentWeather", weatherForecastService.getCurrentWeather(QueryConstants.TYPE_ID,id.toString()));
            modelAndView.addObject("queryId", id);
        }
        return modelAndView;
    }

    @RequestMapping(value = "/zip/current", method = RequestMethod.GET)
    public ModelAndView getWeatherForecastsByZip(@RequestParam(name = "zip") Integer zip) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("currentWeather");
        modelAndView.addObject("cityList", queryConditionService.getCityList());
        if(null != zip) {
            modelAndView.addObject("currentWeather", weatherForecastService.getCurrentWeather(QueryConstants.TYPE_ZIP,zip.toString()));
            modelAndView.addObject("queryZip", zip);
        }
        return modelAndView;
    }
}
