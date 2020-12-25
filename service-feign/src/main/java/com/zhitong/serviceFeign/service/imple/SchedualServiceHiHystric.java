package com.zhitong.serviceFeign.service.imple;

import com.zhitong.serviceFeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}
}

