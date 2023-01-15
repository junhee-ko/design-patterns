package combining.composite

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
}
