package com.zhaopeng.controller;

import com.zhaopeng.service.QueryConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/city")
public class QueryConditionController {

    @Autowired
    private QueryConditionService queryConditionService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView getWeatherForecasts() throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("currentWeather");
        modelAndView.addObject("cityList", queryConditionService.getCityList());
        modelAndView.addObject("queryCity", "");

        return modelAndView;
    }
}
