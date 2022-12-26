package factory.simplefactory

class PizzaStore(
  private val factory: SimplePizzaFactory
) {

  fun orderPizza(type: String): Pizza? {
    val pizza = factory.createPizza(type)

    if (pizza == null) {
      println("Failed to create pizza")
      return null
    }

    pizza.prepare()
    pizza.bake()
    pizza.cut()
    pizza.box()

    return pizza
  }
}
