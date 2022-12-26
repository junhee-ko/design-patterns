package factory.simplefactory

abstract class Pizza {
  open var name: String? = null
  open var dough: String? = null
  open var sauce: String? = null
  open var toppings: List<String> = ArrayList()

  fun prepare() {
    println("Preparing $name")
  }

  fun bake() {
    println("Baking $name")
  }

  fun cut() {
    println("Cutting $name")
  }

  fun box() {
    println("Boxing $name")
  }
}

class PepperoniPizza(
  override var name: String? = "Pepperoni Pizza",
  override var dough: String? = "Crust",
  override var sauce: String? = "Marinara sauce",
  override var toppings: List<String> = listOf("Sliced Pepperoni", "Sliced Onion")
) : Pizza()

class CheesePizza(
  override var name: String? = "Cheese Pizza",
  override var dough: String? = "Regular Crust",
  override var sauce: String? = "Marinara Pizza Sauce",
  override var toppings: List<String> = listOf("Fresh Mozzarella", "Parmesan")
) : Pizza()

class ClamPizza(
  override var name: String? = "Clam Pizza",
  override var dough: String? = "Thin crust",
  override var sauce: String? = "White garlic sauce",
  override var toppings: List<String> = listOf("Clams", "Grated parmesan cheese")
) : Pizza()
