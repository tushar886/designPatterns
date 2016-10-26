package com.strategy.concrete;

import com.strategy.abstractions.AuthStrategy;
import com.strategy.request.AuthenticationRequest;

public class MD5AuthenticationImplementation implements AuthStrategy {

	@Override
	public boolean authenticate(AuthenticationRequest authRequest) {
		System.out.println("MD5 authentication with reqID as: " + authRequest.getAuthReqId() + " and authType as: " + authRequest.getAuthType().value());
		return true;
	}

}
