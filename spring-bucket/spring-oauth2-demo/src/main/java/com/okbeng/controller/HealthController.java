package com.okbeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/v1")
public class HealthController {

    @RequestMapping("health")
    @ResponseBody
    public String access() {
        return "success";
    }

}
