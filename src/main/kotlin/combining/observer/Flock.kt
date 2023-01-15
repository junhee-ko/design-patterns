package combining.observer

class Flock : Quackable {

  private var quackers: MutableList<Quackable> = mutableListOf()

  fun add(quackable: Quackable) {
    quackers.add(quackable)
  }

  override fun quack() {
    val iterator: MutableIterator<Quackable> = quackers.iterator()
    while (iterator.hasNext()) {
      val quackable: Quackable = iterator.next()
      quackable.quack()
    }
  }

  override fun registerObserver(observer: Observer) {
    val iterator = quackers.iterator()
    while (iterator.hasNext()){
      val duck: Quackable = iterator.next()
      duck.registerObserver(observer)
    }
  }

  override fun notifyObservers() = Unit
}
