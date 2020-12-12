package com.tianquan.jupiter.entity;

import com.fasterxml.jackson.annotation.*;

public class LoginRequestBody {
    private final String userId;
    private final String password;

    //  Note that @JasonCreator is needed only when jason to java object, @JsonProperty is need to mark the related field.
    @JsonCreator
    public LoginRequestBody(@JsonProperty("user_id") String userId, @JsonProperty("password") String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
