package observer

fun main() {

  val weatherData = WeatherData()

  val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
  val forecastDisplay = ForecastDisplay(weatherData)

  weatherData.setMeasurements(80F, 65F, 30.4F)
  weatherData.setMeasurements(82F, 70F, 29.2F)
}
