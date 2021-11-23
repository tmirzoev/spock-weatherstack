package com.github.tmirzoev.spock.weatherstack.tool;

import com.fasterxml.jackson.databind.JsonNode;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface WeatherstackClient {

    @GET("current")
    Call<JsonNode> getCurrentWeather(@QueryMap Map<String, String> query);

    @GET("historical")
    Call<JsonNode> getHistoricalWeather(@QueryMap Map<String, String> query);

}
