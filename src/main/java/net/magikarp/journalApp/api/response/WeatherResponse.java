package net.magikarp.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {
    @JsonProperty("temp")
    private int temp;

    @JsonProperty("min_temp")
    private int minTemp;

    @JsonProperty("feels_like")
    private int feelsLike;

    @JsonProperty("max_temp")
    private int maxTemp;

    @JsonProperty("wind_speed")
    private double windSpeed;

    @JsonProperty("wind_degrees")
    private int windDegrees;
    
    @JsonProperty("humidity")
    private int humidity;

    @JsonProperty("sunset")
    private int sunset;
    
    @JsonProperty("cloud_pct")
    private int cloudPct;
    
    @JsonProperty("sunrise")
    private int sunrise;
    
}
