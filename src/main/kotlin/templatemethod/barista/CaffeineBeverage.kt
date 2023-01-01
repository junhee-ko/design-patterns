package templatemethod.barista

abstract class CaffeineBeverage {

  fun prepare() {
    boilWater()
    brew()
    pourInCup()
    addCondiments()
  }

  abstract fun brew()

  abstract fun addCondiments()

  private fun boilWater() = println("boilWater")

  private fun pourInCup() = println("pourInCup")
}

class Tea : CaffeineBeverage() {

  override fun brew() = println("Tea brew")

  override fun addCondiments() = println("Tea addCondiments")
}

class Coffee : CaffeineBeverage() {

  override fun brew() = println("Coffee brew")

  override fun addCondiments() = println("Coffee addCondiments")
}
