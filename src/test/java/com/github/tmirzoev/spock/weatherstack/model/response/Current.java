package com.github.tmirzoev.spock.weatherstack.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Current {

    @JsonProperty("observation_time")
    public String observationTime;
    @JsonProperty("temperature")
    public Integer temperature;
    @JsonProperty("weather_code")
    public Integer weatherCode;
    @JsonProperty("weather_icons")
    public List<String> weatherIcons;
    @JsonProperty("weather_descriptions")
    public List<String> weatherDescriptions;
    @JsonProperty("wind_speed")
    public Integer windSpeed;
    @JsonProperty("wind_degree")
    public Integer windDegree;
    @JsonProperty("wind_dir")
    public String windDir;
    @JsonProperty("pressure")
    public Integer pressure;
    @JsonProperty("precip")
    public Integer precip;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("cloudcover")
    public Integer cloudcover;
    @JsonProperty("feelslike")
    public Integer feelslike;
    @JsonProperty("uv_index")
    public Integer uvIndex;
    @JsonProperty("visibility")
    public Integer visibility;
    @JsonProperty("is_day")
    public String isDay;

}
