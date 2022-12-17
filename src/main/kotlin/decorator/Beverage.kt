package decorator

abstract class Beverage {

  open var description: String = "제목 없음"

  abstract fun cost(): Double
}

class Espresso(
  override var description: String = "Espresso"
) : Beverage() {

  override fun cost(): Double = 1.99
}

class HouseBlend(
  override var description: String = "하우스 블랜드 커피"
): Beverage(){

  override fun cost(): Double = .89
}


