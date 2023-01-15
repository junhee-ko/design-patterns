package combining.duck

fun main() {
  val mallardDuck = MallardDuck()
  val redHeadDuck = RedHeadDuck()
  val duckCall = DuckCall()
  val rubberDuck = RubberDuck()

  simulate(mallardDuck)
  simulate(redHeadDuck)
  simulate(duckCall)
  simulate(rubberDuck)
}

private fun simulate(duck: Quackable) = duck.quack()
