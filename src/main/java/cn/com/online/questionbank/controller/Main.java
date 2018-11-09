package cn.com.online.questionbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.online.questionbank.mapper.MyBatisMapper;

@RestController
public class Main {
	
    @Autowired
    private MyBatisMapper myBatisMapper;
	@RequestMapping("/")
	public String home() {
//		logger.info("进入处理debug");
		return "Hello World!"+myBatisMapper.getList();
	}
}
