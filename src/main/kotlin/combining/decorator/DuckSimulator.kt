package combining.decorator

fun main() {
  val mallardDuck = QuackCounter(MallardDuck())
  val redHeadDuck = QuackCounter(RedHeadDuck())
  val duckCall = QuackCounter(DuckCall())
  val rubberDuck = QuackCounter(RubberDuck())
  val goose = GooseAdapter(Goose())

  simulate(mallardDuck)
  simulate(redHeadDuck)
  simulate(duckCall)
  simulate(rubberDuck)
  simulate(goose)

  println("quack count: ${QuackCounter.numberOfQuacks}")
}

private fun simulate(duck: Quackable) = duck.quack()
