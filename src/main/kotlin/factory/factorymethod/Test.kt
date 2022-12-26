package factory.factorymethod

fun main() {

  val newYorkPizzaStore: PizzaStore = NewYorkPizzaStore()
  newYorkPizzaStore.orderPizza("cheese")

  val chicagoPizzaStore: PizzaStore = ChicagoPizzaStore()
  chicagoPizzaStore.orderPizza("cheese")
}
