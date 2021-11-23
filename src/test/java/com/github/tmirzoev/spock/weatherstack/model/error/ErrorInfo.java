package com.github.tmirzoev.spock.weatherstack.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class ErrorInfo {

    @JsonProperty("code")
    public Integer code;
    @JsonProperty("type")
    public String type;
    @JsonProperty("info")
    public String info;

}
