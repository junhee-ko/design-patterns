package iterator.improve1

fun main() {
  val pancakeHouseMenu: PancakeHouseMenu = PancakeHouseMenu()
  val pancakeHouseMenuIterator: Iterator = pancakeHouseMenu.createIterator()
  printMenu(pancakeHouseMenuIterator)

  val dinnerMenu: DinnerMenu = DinnerMenu()
  val dinnerMenuIterator: Iterator = dinnerMenu.createIterator()
  printMenu(dinnerMenuIterator)
}

private fun printMenu(iterator: Iterator) {
  while (iterator.hasNext()) {
    println(iterator.next())
  }
}
