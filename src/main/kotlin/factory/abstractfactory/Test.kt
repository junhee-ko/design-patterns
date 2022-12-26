package factory.abstractfactory

fun main() {
  val newYorkPizzaStore: PizzaStore = NewYorkPizzaStore()

  val pizza: Pizza? = newYorkPizzaStore.orderPizza("cheese")
  println(pizza)
}
