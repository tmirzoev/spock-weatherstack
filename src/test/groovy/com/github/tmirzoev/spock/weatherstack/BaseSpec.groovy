package com.github.tmirzoev.spock.weatherstack

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tmirzoev.spock.weatherstack.tool.WeatherstackClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import spock.lang.Shared
import spock.lang.Specification

class BaseSpec extends Specification {
    @Shared
    protected String apiKey;

    @Shared
    protected ObjectMapper mapper;

    @Shared
    protected WeatherstackClient weatherstackClient;

    def setupSpec() {
        apiKey = System.getenv("API_KEY")
        mapper = new ObjectMapper()
        def retrofit = new Retrofit.Builder()
                .baseUrl("http://api.weatherstack.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
        weatherstackClient = retrofit.create(WeatherstackClient)
    }
}
