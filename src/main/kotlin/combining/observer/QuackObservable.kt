package combining.observer

interface QuackObservable {

  fun registerObserver(observer: Observer)
  fun notifyObservers()
}
