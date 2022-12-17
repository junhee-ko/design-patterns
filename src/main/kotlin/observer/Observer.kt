package observer

interface Observer {

  fun update(temp: Float, humidity: Float, pressure: Float)
}

interface DisplayElement {
  fun display()
}

class CurrentConditionsDisplay(
  private val weatherData: WeatherData
) : DisplayElement, Observer {

  private var temperature: Float = 0F
  private var humidity: Float = 0F

  init {
    weatherData.registerObserver(this)
  }

  override fun update(temp: Float, humidity: Float, pressure: Float) {
    this.temperature = temp
    this.humidity = humidity

    display()
  }

  override fun display() {
    println("현재 상태, 온도: ${temperature}, 습도: ${humidity}}")
  }
}

class ForecastDisplay(
  private val weatherData: WeatherData
) : DisplayElement, Observer {

  private var currentPressure = 29.92f
  private var lastPressure = 0f

  init {
    weatherData.registerObserver(this)
  }

  override fun update(temp: Float, humidity: Float, pressure: Float) {
    this.lastPressure = currentPressure
    this.currentPressure = pressure

    display()
  }

  override fun display() {
    print("Forecast: ")
    if (currentPressure > lastPressure) {
      println("Improving weather on the way!")
    } else if (currentPressure == lastPressure) {
      println("More of the same")
    } else if (currentPressure < lastPressure) {
      println("Watch out for cooler, rainy weather")
    }
  }
}
