package com.request.scope.controller;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScope {

	private Date date = new Date();
	
	public RequestScope() {
		System.out.println("RequestScope Constructor Called at "+ LocalDateTime.now());
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getDate() {
		return date.toString();
	}
	
}
