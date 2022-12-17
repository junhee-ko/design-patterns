package strategy

interface QuackBehavior {

  fun quack()
}

class Quack : QuackBehavior {

  override fun quack() {
    println("꽥 !")
  }
}

class MuteQuack : QuackBehavior {

  override fun quack() {
    println("Mute.....")
  }
}

class Squeak : QuackBehavior {

  override fun quack() {
    println("삑 !")
  }
}
