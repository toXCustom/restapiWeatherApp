package pl.toXCustom.restapiWeatherApp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.toXCustom.restapiWeatherApp.model.WeatherDto;
import pl.toXCustom.restapiWeatherApp.webclient.weather.WeatherClient;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;

    public WeatherDto getWeather() {
        return weatherClient.getWeatherForCity("Warszawa");
    }
}
