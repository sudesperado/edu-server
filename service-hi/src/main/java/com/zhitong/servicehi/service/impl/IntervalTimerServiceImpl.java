package com.zhitong.servicehi.service.impl;

import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.zhitong.servicehi.service.IntervalTimerService;
import com.zhitong.servicehi.util.myTimer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Timer;

@Service
public class IntervalTimerServiceImpl implements IntervalTimerService {
	private Logger logger = LoggerFactory.getLogger(IntervalTimerService.class);

	@Override
	public String getIntervalTimer(String name) {
		logger.info("开始执行定时任务");

		new Timer().schedule(new myTimer(),5000);

		logger.info("结束");
		return "1";
	}

}

