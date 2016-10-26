package com.strategy.abstractions;

public enum AuthenticationType {
	MD5 ,
	SHA ;

	public String value() {
		return name();
	}

	public static AuthenticationType fromValue(String v) {
		return valueOf(v);
	}
}
