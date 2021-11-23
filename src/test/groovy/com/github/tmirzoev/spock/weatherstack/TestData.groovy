package com.github.tmirzoev.spock.weatherstack

import com.github.tmirzoev.spock.weatherstack.model.error.ErrorInfo
import com.github.tmirzoev.spock.weatherstack.model.response.Location

class TestData {

    public static final LONDON_LOCATION = Location.builder()
            .name("London")
            .country("United Kingdom")
            .region("City of London, Greater London")
            .lat("51.517")
            .lon("-0.106")
            .timezoneId("Europe/London")
            .utcOffset("0.0")
            .build()

    public static final MOSCOW_LOCATION = Location.builder()
            .name("Moscow")
            .country("Russia")
            .region("Moscow City")
            .lat("55.752")
            .lon("37.616")
            .timezoneId("Europe/Moscow")
            .utcOffset("3.0")
            .build()

    public static final SPB_LOCATION = Location.builder()
            .name("Saint Petersburg")
            .country("Russia")
            .region("Saint Petersburg City")
            .lat("59.894")
            .lon("30.264")
            .timezoneId("Europe/Moscow")
            .utcOffset("3.0")
            .build()

    //This test data contains intentional errors
    public static final PUSHKIN_LOCATION = Location.builder()
            .name("Pushkin")
            .country("Russia")
            .region("Saint Petersburg City")
            .lat("59.894")
            .lon("30.264")
            .timezoneId("Europe/Moscow")
            .utcOffset("3.0")
            .build()

    public static final INVALID_KEY_ERROR_INFO = new ErrorInfo(101, "invalid_access_key",
            "You have not supplied a valid API Access Key. [Technical Support: support@apilayer.com]")
    public static final MISSING_QUERY_ERROR_INFO = new ErrorInfo(601, "missing_query",
            "Please specify a valid location identifier using the query parameter.")
    public static final REQUEST_FAILED_ERROR_INFO = new ErrorInfo(615, "request_failed",
            "Your API request failed. Please try again or contact support.")
    public static final HISTORICAL_NOT_SUPPORTED_ERROR_INFO = new ErrorInfo(603,
            "historical_queries_not_supported_on_plan",
            "Your current subscription plan does not support historical weather data. Please upgrade your account to use this feature.")

}
