package templatemethod.barista

fun main() {
  val tea: CaffeineBeverage = Tea()
  val coffee: CaffeineBeverage = Coffee()

  tea.prepare()
}
