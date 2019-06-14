package com.session.scope.controller;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionScope {

	private Date date = new Date();
	
	public SessionScope() {
		System.out.println("SessionScope Constructor Called at "+ LocalDateTime.now());
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getDate() {
		return date.toString();
	}
	
}
