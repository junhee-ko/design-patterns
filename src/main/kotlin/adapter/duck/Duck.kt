package adapter.duck

interface Duck {

  fun quack()
  fun fly()
}

class MallardDuck : Duck {

  override fun quack() = println("MallardDuck quack")

  override fun fly() = println("MallardDuck fly")
}
