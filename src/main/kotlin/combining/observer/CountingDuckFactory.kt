package combining.observer

class CountingDuckFactory: AbstractDuckFactory() {

  override fun createMallardDuck(): Quackable = QuackCounter(MallardDuck())

  override fun createReadHeadDuck(): Quackable = QuackCounter(RedHeadDuck())

  override fun createDuckCall(): Quackable = QuackCounter(DuckCall())

  override fun createRubberDuck(): Quackable = QuackCounter(RubberDuck())
}
