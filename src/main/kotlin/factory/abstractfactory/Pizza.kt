package factory.abstractfactory

abstract class Pizza {
  open var name: String? = null
  open var dough: Dough? = null
  open var veggies: List<Veggies> = emptyList()
  open var cheese: Cheese? = null
  open var pepperoni: Pepperoni? = null
  open var clam: Clams? = null

  abstract fun prepare()

  fun bake() {
    println("Baking $name")
  }

  fun cut() {
    println("Cutting $name")
  }

  fun box() {
    println("Boxing $name")
  }

  override fun toString(): String =
    "name: $name, dough: $dough, veggies: $veggies, cheese: $cheese, pepperoni: $pepperoni, clam: $clam"
}

class CheesePizza(
  override var name: String? = null,
  private val ingredientFactory: PizzaIngredientFactory
) : Pizza() {

  override fun prepare() {
    println("preparing $name")

    dough = ingredientFactory.createDough()
    cheese = ingredientFactory.createCheese()
    pepperoni = ingredientFactory.createPepperoni()
  }
}

class ClamPizza(
  override var name: String? = null,
  private val ingredientFactory: PizzaIngredientFactory
) : Pizza() {

  override fun prepare() {
    println("preparing $name")

    dough = ingredientFactory.createDough()
    cheese = ingredientFactory.createCheese()
    pepperoni = ingredientFactory.createPepperoni()
    clam = ingredientFactory.createClam()
  }
}
