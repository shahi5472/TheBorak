package com.s.m.shahi.theborak.Model;

import java.util.List;

public class Auth {
    private String type;
    private List<Bearer> bearer;

    public Auth() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Bearer> getBearer() {
        return bearer;
    }

    public void setBearer(List<Bearer> bearer) {
        this.bearer = bearer;
    }
}
