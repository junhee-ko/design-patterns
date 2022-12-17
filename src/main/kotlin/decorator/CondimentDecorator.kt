package decorator

abstract class CondimentDecorator : Beverage() {

  open var beverage: Beverage? = null

  abstract override var description: String
}

class Mocha(
  override var beverage: Beverage?
) : CondimentDecorator() {

  override var description: String = beverage!!.description + ", 모카"

  override fun cost(): Double = beverage!!.cost() + .20
}

class Whip(
  override var beverage: Beverage?
) : CondimentDecorator() {

  override var description: String = beverage!!.description + ", 휘핑크림"

  override fun cost(): Double = beverage!!.cost() + .10
}
