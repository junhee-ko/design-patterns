package combining.composite

fun main() {
  val countingDuckFactory: AbstractDuckFactory = CountingDuckFactory()

  simulate(countingDuckFactory)

  println("quack count: ${QuackCounter.numberOfQuacks}")
}

private fun simulate(duckFactory: AbstractDuckFactory){
  val mallardDuck = duckFactory.createMallardDuck()
  val readHeadDuck = duckFactory.createReadHeadDuck()
  val duckCall = duckFactory.createDuckCall()
  val rubberDuck = duckFactory.createRubberDuck()
  val goose = GooseAdapter(Goose())

  val flockOfDucks = Flock()
  flockOfDucks.add(mallardDuck)
  flockOfDucks.add(readHeadDuck)
  flockOfDucks.add(duckCall)
  flockOfDucks.add(rubberDuck)
  flockOfDucks.add(goose)
  simulate(flockOfDucks)

  val flockOfMallards = Flock()
  val mallardDuck1 = duckFactory.createMallardDuck()
  val mallardDuck2 = duckFactory.createMallardDuck()
  val mallardDuck3 = duckFactory.createMallardDuck()
  flockOfMallards.add(mallardDuck1)
  flockOfMallards.add(mallardDuck2)
  flockOfMallards.add(mallardDuck3)
  simulate(flockOfMallards)
}

private fun simulate(duck: Quackable) {
  duck.quack()
}
