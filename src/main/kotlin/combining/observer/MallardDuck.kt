package combining.observer

class MallardDuck : Quackable {

  private val observable: Observable = Observable(this)

  override fun quack() {
    println("MallardDuck: Quacked")
    notifyObservers()
  }

  override fun registerObserver(observer: Observer) {
    observable.registerObserver(observer)
  }

  override fun notifyObservers() {
    observable.notifyObservers()
  }

  override fun toString(): String {
    return "MallardDuck(observable=$observable)"
  }
}
