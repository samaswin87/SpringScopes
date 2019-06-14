package com.session.scope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionBean {
	
	@Autowired
	private SessionScope scope;

	public SessionScope getScope() {
		return scope;
	}

	public void setScope(SessionScope scope) {
		this.scope = scope;
	}
	
}
