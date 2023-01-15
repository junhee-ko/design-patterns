package combining.observer

abstract class AbstractDuckFactory {

  abstract fun createMallardDuck(): Quackable
  abstract fun createReadHeadDuck(): Quackable
  abstract fun createDuckCall(): Quackable
  abstract fun createRubberDuck(): Quackable
}
