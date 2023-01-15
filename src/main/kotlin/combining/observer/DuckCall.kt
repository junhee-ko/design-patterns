package combining.observer

class DuckCall : Quackable {
  private val observable: Observable = Observable(this)

  override fun quack() {
    println("Kwak")
    notifyObservers()
  }

  override fun registerObserver(observer: Observer) = observable.registerObserver(observer)

  override fun notifyObservers() = observable.notifyObservers()
}
