package com.tianquan.jupiter.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponseBody {

//  Note that @JasonCreator is needed only when jason to java object, @JsonProperty is need to mark the related field.
//  So here we don't need @JasonCreator
    @JsonProperty("user_id")
    private final String userId;

    @JsonProperty("name")
    private final String name;

    public LoginResponseBody(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
