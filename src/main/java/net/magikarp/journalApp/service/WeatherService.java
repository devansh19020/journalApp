package net.magikarp.journalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.magikarp.journalApp.api_response.WeatherResponse;

@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String API_KEY;

    @Autowired
    RestTemplate restTemplate;

    public WeatherResponse getWeather(double latitude, double longitude) {
        String url = String.format("https://api.api-ninjas.com/v1/weather?lat=%.4f&lon=%.4f", latitude, longitude);
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
