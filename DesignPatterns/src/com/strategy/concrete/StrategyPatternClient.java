package com.strategy.concrete;

import com.strategy.abstractions.AuthenticationType;
import com.strategy.request.AuthenticationRequest;

public class StrategyPatternClient {

	public static void main(String[] args) {

		final AuthenticationRequest authReqMD5 = new AuthenticationRequest("AXB7632", AuthenticationType.MD5);
		final AuthenticationRequest authReqSHA = new AuthenticationRequest("ABC7213", AuthenticationType.SHA);
		
		final AuthenticationContext shaAuthCtx = new AuthenticationContext(new SHAAuthenticationImplementation());
		final AuthenticationContext md5AuthCtx = new AuthenticationContext(new SHAAuthenticationImplementation());
		
		System.out.println("Executing result of MD5Auth Strategy is " + md5AuthCtx.executeStrategy(authReqMD5));
		System.out.println("Executing result of SHAAuth Strategy is " + shaAuthCtx.executeStrategy(authReqSHA));

	}

}
