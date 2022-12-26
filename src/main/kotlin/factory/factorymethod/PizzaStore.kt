package factory.factorymethod

abstract class PizzaStore {

  fun orderPizza(type: String): Pizza? {
    val pizza = createPizza(type)

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

  protected abstract fun createPizza(type: String): Pizza?
}

class NewYorkPizzaStore : PizzaStore() {

  override fun createPizza(type: String): Pizza? =
    when (type) {
      "cheese" -> NewYorkStyleCheesePizza()
      "pepperoni" -> NewYorkStylePepperoniPizza()
      "clam" -> NewYorkStyleClamPizza()
      else -> null
    }
}

class ChicagoPizzaStore : PizzaStore() {

  override fun createPizza(type: String): Pizza? =
    when (type) {
      "cheese" -> ChicagoStyleCheesePizza()
      "pepperoni" -> ChicagoStylePepperoniPizza()
      "clam" -> ChicagoStyleClamPizza()
      else -> null
    }
}

