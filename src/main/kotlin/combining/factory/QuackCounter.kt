package combining.factory

class QuackCounter(
  private val duck: Quackable
): Quackable {

  override fun quack() {
    duck.quack()
    numberOfQuacks += 1
  }

  companion object{
    var numberOfQuacks: Int = 0
  }
}
