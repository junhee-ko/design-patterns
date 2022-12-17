package observer

interface Subject {

  fun registerObserver(o: Observer)
  fun removeObserver(o: Observer)
  fun notifyObservers()
}

class WeatherData : Subject {
  private val observers: MutableList<Observer> = mutableListOf()
  private var temperature: Float = 0F
  private var humidity: Float = 0F
  private var pressure: Float = 0F

  override fun registerObserver(o: Observer) {
    observers.add(o)
  }

  override fun removeObserver(o: Observer) {
    observers.remove(o)
  }

  override fun notifyObservers() {
    observers.forEach {
      it.update(temperature, humidity, pressure)
    }
  }

  fun setMeasurements(temp: Float, humidity: Float, pressure: Float) {
    this.temperature = temp
    this.humidity = humidity
    this.pressure = pressure

    measurementsChanged()
  }

  private fun measurementsChanged() {
    notifyObservers()
  }
}
