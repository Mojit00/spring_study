package com.jitao.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService, ApplicationContextAware {

	private ApplicationContext context;

	@Override
	public void query() {
		System.out.println("query");
		System.out.println(context);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
}
