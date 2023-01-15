package combining.adapter

fun main() {
  val mallardDuck = MallardDuck()
  val redHeadDuck = RedHeadDuck()
  val duckCall = DuckCall()
  val rubberDuck = RubberDuck()
  val goose = GooseAdapter(Goose()) // HERE

  simulate(mallardDuck)
  simulate(redHeadDuck)
  simulate(duckCall)
  simulate(rubberDuck)
  simulate(goose) //HERE
}

private fun simulate(duck: Quackable) = duck.quack()
