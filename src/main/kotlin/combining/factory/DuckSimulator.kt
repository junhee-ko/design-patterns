package combining.factory

fun main() {
  val countingDuckFactory: AbstractDuckFactory = CountingDuckFactory()
  val duckFactory: AbstractDuckFactory = DuckFactory()

  simulate(countingDuckFactory)
  simulate(duckFactory)

  println("quack count: ${QuackCounter.numberOfQuacks}")
}

private fun simulate(duckFactory: AbstractDuckFactory){
  val mallardDuck = duckFactory.createMallardDuck()
  val readHeadDuck = duckFactory.createReadHeadDuck()
  val duckCall = duckFactory.createDuckCall()
  val rubberDuck = duckFactory.createRubberDuck()
  val goose = GooseAdapter(Goose())

  simulate(mallardDuck)
  simulate(readHeadDuck)
  simulate(duckCall)
  simulate(rubberDuck)
  simulate(goose)
}

private fun simulate(duck: Quackable) {
  duck.quack()
}
