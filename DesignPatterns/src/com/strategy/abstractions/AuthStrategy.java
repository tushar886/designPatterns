package com.strategy.abstractions;

import com.strategy.request.AuthenticationRequest;

public interface AuthStrategy {

	public boolean authenticate(AuthenticationRequest authRequest);
}
