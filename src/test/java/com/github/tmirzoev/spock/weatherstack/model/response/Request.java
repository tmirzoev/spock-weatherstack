package com.github.tmirzoev.spock.weatherstack.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Request {

    @JsonProperty("type")
    public String type;
    @JsonProperty("query")
    public String query;
    @JsonProperty("language")
    public String language;
    @JsonProperty("unit")
    public String unit;

}
