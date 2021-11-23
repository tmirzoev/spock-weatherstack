package com.github.tmirzoev.spock.weatherstack.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
@ToString
public class WeatherStackError {

    @JsonProperty("success")
    public Boolean success;
    @JsonProperty("error")
    public ErrorInfo errorInfo;

}
