package strategy

class FlyWithWings : FlyBehavior {

  override fun fly() {
    println("날고 있다.")
  }
}

class FlyNoWay : FlyBehavior {

  override fun fly() {
    println("나는 못 날아.")
  }
}
