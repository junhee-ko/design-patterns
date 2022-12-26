package factory.simplefactory

class SimplePizzaFactory {

  fun createPizza(type: String): Pizza? =
    when (type) {
      "cheese" -> CheesePizza()
      "pepperoni" -> PepperoniPizza()
      "clam" -> ClamPizza()
      else -> null
    }
}
