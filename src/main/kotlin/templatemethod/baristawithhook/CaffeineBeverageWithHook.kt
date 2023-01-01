package templatemethod.baristawithhook

abstract class CaffeineBeverageWithHook {

  fun prepare() {
    boilWater()
    brew()
    pourInCup()
    if (customerWantsCondiments()) {
      addCondiments()
    }
  }

  abstract fun brew()

  abstract fun addCondiments()

  private fun boilWater() = println("boilWater")

  private fun pourInCup() = println("pourInCup")

  open fun customerWantsCondiments(): Boolean = true
}

class TeaWithHook : CaffeineBeverageWithHook() {

  override fun brew() = println("Tea brew")

  override fun addCondiments() = println("Tea addCondiments")

  override fun customerWantsCondiments(): Boolean = false // 사용자 입력 값을 받아서 판단 가능
}

class CoffeeWithHook : CaffeineBeverageWithHook() {

  override fun brew() = println("Coffee brew")

  override fun addCondiments() = println("Coffee addCondiments")

  override fun customerWantsCondiments(): Boolean = true
}
