package com.jitao.service;

import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
	@Override
	public void query() {
		System.out.println("query");
	}
}
