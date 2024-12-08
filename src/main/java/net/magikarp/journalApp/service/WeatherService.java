package net.magikarp.journalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.magikarp.journalApp.api.response.WeatherResponse;
import net.magikarp.journalApp.cache.AppCache;

@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String API_KEY;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private AppCache appCache;

    public WeatherResponse getWeather(double latitude, double longitude) {
        String url = String.format(appCache.appCache.get(AppCache.keys.WEATHER_API.toString()), latitude, longitude);
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Api-Key", API_KEY);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        try {
            ResponseEntity<WeatherResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, WeatherResponse.class);
            return response.getBody();
        } catch (Exception e) {
            System.err.println("Error calling Weather API: " + e.getMessage());
            return null;
        }
    }
}
