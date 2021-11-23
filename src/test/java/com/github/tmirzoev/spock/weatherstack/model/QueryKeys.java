package com.github.tmirzoev.spock.weatherstack.model;

public enum QueryKeys {
    ACCESS_KEY("access_key"),
    QUERY("query");

    private final String value;

    private QueryKeys(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
