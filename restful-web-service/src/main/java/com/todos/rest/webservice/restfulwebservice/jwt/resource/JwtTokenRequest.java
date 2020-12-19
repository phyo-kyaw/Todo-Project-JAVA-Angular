package com.todos.rest.webservice.restfulwebservice.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
//    {
//    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYwODY0MDYxNCwiaWF0IjoxNjA4MDM1ODE0fQ.0Eii1REYg6n7MXsaSQvYMfxTIJDrmfgf0fNTdaCtgmupJeQj8pQv2ouPnKgZjnfxtO9BHaiOeD2AInktmGm7CQ"
//    	}

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

