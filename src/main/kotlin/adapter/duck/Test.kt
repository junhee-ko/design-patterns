package adapter.duck

fun main() {
  val mallardDuck: Duck = MallardDuck()
  test(mallardDuck)

  val wildTurkey: Turkey = WildTurkey()
  val turkeyAdapter: Duck = TurkeyAdapter(wildTurkey)
  test(turkeyAdapter)
}

private fun test(mallardDuck: Duck) {
  mallardDuck.quack()
  mallardDuck.fly()
}
