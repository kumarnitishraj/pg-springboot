package com.springboot.pg.security.service;

import java.io.Serializable;

import com.springboot.pg.model.security.User;
import com.springboot.pg.security.JwtUser;

/**
 * Created by stephan on 20.03.16.
 */
public class JwtAuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;
    private final JwtUser data;

    public JwtAuthenticationResponse(String token, JwtUser user) {
        this.token = token;
        this.data = user;
    }

    public JwtUser getData() {
		return data;
	}

	public String getToken() {
        return this.token;
    }
}
