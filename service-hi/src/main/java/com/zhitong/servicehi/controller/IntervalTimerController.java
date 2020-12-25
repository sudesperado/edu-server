package com.zhitong.servicehi.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhitong.servicehi.service.IntervalTimerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntervalTimerController {

	@Autowired
	public IntervalTimerService intervalTimerService;

	@RequestMapping("/intervalTimer")
	public String getIntervalTimer(@RequestParam(value = "name") String name) {
		return intervalTimerService.getIntervalTimer(name);
	}
}

