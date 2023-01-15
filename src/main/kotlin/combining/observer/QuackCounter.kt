package combining.observer

class QuackCounter(
  private val duck: Quackable
): Quackable {

  override fun quack() {
    duck.quack()
    numberOfQuacks += 1
  }

  override fun registerObserver(observer: Observer) {
    duck.registerObserver(observer)
  }

  override fun notifyObservers() {
    duck.notifyObservers()
  }

  companion object{
    var numberOfQuacks: Int = 0
  }
}
