package adapter.duck

class TurkeyAdapter(
  private val turkey: Turkey
) : Duck {

  override fun quack() = turkey.gobble()

  override fun fly() = turkey.fly()
}
