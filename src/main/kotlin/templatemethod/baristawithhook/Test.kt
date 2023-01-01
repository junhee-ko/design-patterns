package templatemethod.baristawithhook

fun main() {
  val tea: CaffeineBeverageWithHook = TeaWithHook()
  val coffee: CaffeineBeverageWithHook = CoffeeWithHook()

  tea.prepare()
  println("--")
  coffee.prepare()

}
