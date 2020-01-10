package com.s.m.shahi.theborak.Model;

public class QueryParams {
    private String key;
    private String value;
    private boolean equals;
    private boolean enabled;

    public QueryParams() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isEquals() {
        return equals;
    }

    public void setEquals(boolean equals) {
        this.equals = equals;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
