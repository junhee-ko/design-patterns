package combining.factory

class DuckFactory: AbstractDuckFactory() {

  override fun createMallardDuck(): Quackable = MallardDuck()

  override fun createReadHeadDuck(): Quackable = RedHeadDuck()

  override fun createDuckCall(): Quackable = DuckCall()

  override fun createRubberDuck(): Quackable = RubberDuck()
}
