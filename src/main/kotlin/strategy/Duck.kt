package strategy

abstract class Duck {
  open var flyBehavior: FlyBehavior? = null
  open var quackBehavior: QuackBehavior? = null

  abstract fun display()

  fun performFly() {
    flyBehavior!!.fly()
  }

  fun performQuack() {
    quackBehavior!!.quack()
  }
}

class MallardDuck(
  override var flyBehavior: FlyBehavior? = FlyWithWings(),
  override var quackBehavior: QuackBehavior? = Quack()
) : Duck() {

  override fun display() {
    println("나는 물오리")
  }
}

