package com.jitao;

import com.jitao.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService bean = context.getBean(IndexService.class);
		bean.query();
	}
}
