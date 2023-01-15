package combining.observer

fun main() {
  val countingDuckFactory: AbstractDuckFactory = CountingDuckFactory()

  simulate(countingDuckFactory)
}

private fun simulate(duckFactory: AbstractDuckFactory){
  val flockOfMallards = Flock()

  val mallardDuck1: Quackable = duckFactory.createMallardDuck()
  val mallardDuck2: Quackable = duckFactory.createMallardDuck()
  val mallardDuck3: Quackable = duckFactory.createMallardDuck()

  flockOfMallards.add(mallardDuck1)
  flockOfMallards.add(mallardDuck2)
  flockOfMallards.add(mallardDuck3)

  val quackologist: Observer = Quackologist()
  flockOfMallards.registerObserver(quackologist)

  simulate(flockOfMallards)
}

private fun simulate(duck: Quackable) {
  duck.quack()
}
