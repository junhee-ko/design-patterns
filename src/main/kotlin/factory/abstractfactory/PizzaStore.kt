package factory.abstractfactory

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

  override fun createPizza(type: String): Pizza? {
    val newYorkPizzaIngredientFactory: PizzaIngredientFactory = NewYorkPizzaIngredientFactory()

    return when (type) {
      "cheese" -> CheesePizza(
        name = "New York Style Cheese Pizza",
        ingredientFactory = newYorkPizzaIngredientFactory
      )
      "clam" -> ClamPizza(
        name = "New York Style Clam Pizza",
        ingredientFactory = newYorkPizzaIngredientFactory
      )
      else -> null
    }
  }
}
