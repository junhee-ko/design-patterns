package iterator.improve2

fun main() {
  val pancakeHouseMenu: Menu = PancakeHouseMenu()
  val pancakeHouseMenuIterator: Iterator<MenuItem> = pancakeHouseMenu.createIterator()
  printMenu(pancakeHouseMenuIterator)

  val dinnerMenu: Menu = DinnerMenu()
  val dinnerMenuIterator: Iterator<MenuItem> = dinnerMenu.createIterator()
  printMenu(dinnerMenuIterator)
}

private fun printMenu(iterator: Iterator<MenuItem>) {
  while (iterator.hasNext()) {
    println(iterator.next())
  }
}
