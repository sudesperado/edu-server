package com.zhitong.servicehi.util;


import com.zhitong.servicehi.service.IntervalTimerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TimerTask;

public class myTimer extends TimerTask {
	private Logger logger = LoggerFactory.getLogger(IntervalTimerService.class);

	@Override
	public void run() {

				logger.info("开启线程、定时执行了");

	}

}

