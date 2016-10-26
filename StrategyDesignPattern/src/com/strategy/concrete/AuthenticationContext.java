package com.strategy.concrete;

import com.strategy.abstractions.AuthStrategy;
import com.strategy.request.AuthenticationRequest;

public class AuthenticationContext {

	private AuthStrategy authStrategy;
	
	public AuthenticationContext(AuthStrategy authStrategy) {
		this.authStrategy = authStrategy;
	}
	
	public boolean executeStrategy(AuthenticationRequest authReq) {
		return authStrategy.authenticate(authReq);
	}
}
