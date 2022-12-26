package factory.simplefactory

fun main() {
  val simplePizzaFactory: SimplePizzaFactory = SimplePizzaFactory()
  val pizzaStore: PizzaStore = PizzaStore(simplePizzaFactory)

  pizzaStore.orderPizza("cheese")
  pizzaStore.orderPizza("pepperoni")
  pizzaStore.orderPizza("clam")
}
