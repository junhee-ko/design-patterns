package combining.observer

class Observable(
  private val duck: QuackObservable
) : QuackObservable {

  private val observers: MutableList<Observer> = mutableListOf()

  override fun registerObserver(observer: Observer) {
    observers.add(observer)
  }

  override fun notifyObservers() {
    val iterator = observers.iterator()
    while (iterator.hasNext()){
      val observer: Observer = iterator.next()
      observer.update(duck)
    }
  }
}
