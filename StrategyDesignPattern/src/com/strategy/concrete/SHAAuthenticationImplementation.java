package com.strategy.concrete;

import com.strategy.abstractions.AuthStrategy;
import com.strategy.request.AuthenticationRequest;

public class SHAAuthenticationImplementation implements AuthStrategy	 {

	@Override
	public boolean authenticate(AuthenticationRequest authRequest) {
		System.out.println("SHA authentication with reqID as: " + authRequest.getAuthReqId() + " and authType as: " + authRequest.getAuthType().value());
		return true;
	}

}
