package combining.observer

class RubberDuck : Quackable {

  private val observable: Observable = Observable(this)

  override fun quack() {
    println("Squeak")
    notifyObservers()
  }

  override fun registerObserver(observer: Observer) {
    observable.registerObserver(observer)
  }

  override fun notifyObservers() {
    observable.notifyObservers()
  }
}
