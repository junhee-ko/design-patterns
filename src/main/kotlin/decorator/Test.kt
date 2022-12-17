package decorator

fun main() {
  val espresso: Beverage = Espresso()
  println(espresso.description + " " + espresso.cost())

  val houseBlend: Beverage = HouseBlend()
  val houseBlendWithMocha: Beverage = Mocha(houseBlend)
  val houseBlendWithMochaWithWhip: Beverage = Whip(houseBlendWithMocha)
  println(houseBlendWithMochaWithWhip.description + " " + houseBlendWithMochaWithWhip.cost())
}
