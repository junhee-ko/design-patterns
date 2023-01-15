package combining.observer

class RedHeadDuck : Quackable {

  private val observable: Observable = Observable(this)

  override fun quack() {
    println("Quack")
    notifyObservers()
  }

  override fun registerObserver(observer: Observer) {
    observable.registerObserver(observer)
  }

  override fun notifyObservers() {
    observable.notifyObservers()
  }
}
