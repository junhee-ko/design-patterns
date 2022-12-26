package factory.factorymethod

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

class NewYorkStylePepperoniPizza(
  override var name: String? = "NY Style Pepperoni Pizza",
  override var dough: String? = "Thin Crust Dough",
  override var sauce: String? = "Marinara Sauce",
  override var toppings: List<String> = listOf("Grated Reggiano Cheese", "Sliced Pepperoni", "Garlic")
) : Pizza()

class NewYorkStyleCheesePizza(
  override var name: String? = "NY Style Sauce and Cheese Pizza",
  override var dough: String? = "Thin Crust Dough",
  override var sauce: String? = "Marinara Sauce",
  override var toppings: List<String> = listOf("Grated Reggiano Cheese")
) : Pizza()

class NewYorkStyleClamPizza(
  override var name: String? = "NY Style Clam Pizza",
  override var dough: String? = "Thin Crust Dough",
  override var sauce: String? = "Marinara Sauce",
  override var toppings: List<String> = listOf("Grated Reggiano Cheese", "Fresh Clams from Long Island Sound")
) : Pizza()

// --------

class ChicagoStyleCheesePizza(
  override var name: String? = "Chicago Style Deep Dish Cheese Pizza",
  override var dough: String? = "Extra Thick Crust Dough",
  override var sauce: String? = "Plum Tomato Sauce",
  override var toppings: List<String> = listOf("Shredded Mozzarella Cheese")
) : Pizza()

class ChicagoStylePepperoniPizza(
  override var name: String? = "Chicago Style Pepperoni Pizza",
  override var dough: String? = "Extra Thick Crust Dough",
  override var sauce: String? = "Plum Tomato Sauce",
  override var toppings: List<String> = listOf("Shredded Mozzarella Cheese")
) : Pizza()

class ChicagoStyleClamPizza(
  override var name: String? = "Chicago Style Clam Pizza",
  override var dough: String? = "Thin Crust Dough",
  override var sauce: String? = "Plum Tomato Sauce",
  override var toppings: List<String> = listOf("Shredded Mozzarella Cheese", "Sliced Pepperoni", "Garlic")
) : Pizza()
