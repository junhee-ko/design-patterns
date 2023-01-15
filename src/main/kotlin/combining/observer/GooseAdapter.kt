package combining.observer

class GooseAdapter(
  private val goose: Goose
) : Quackable {

  private val observable: Observable = Observable(this)

  override fun quack() {
    goose.hook()
    notifyObservers()
  }

  override fun registerObserver(observer: Observer) {
    observable.registerObserver(observer)
  }

  override fun notifyObservers() {
    observable.notifyObservers()
  }
}
