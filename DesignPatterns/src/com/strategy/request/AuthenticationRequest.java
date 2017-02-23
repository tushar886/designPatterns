package com.strategy.request;

import com.strategy.abstractions.AuthenticationType;

public class AuthenticationRequest {
	
	private String authReqId;
	private AuthenticationType authType;
	
	public AuthenticationRequest (String authReqId, AuthenticationType authType) {
		this.authReqId = authReqId;
		this.authType = authType;
	}
	
	public String getAuthReqId() {
		return authReqId;
	}
	public AuthenticationType getAuthType() {
		return authType;
	}
}

