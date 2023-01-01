package iterator.old

fun main() {
  val pancakeHouseMenu: PancakeHouseMenu = PancakeHouseMenu()
  val pancakeHouseMenuItems: MutableList<MenuItem> = pancakeHouseMenu.getMenuItems()
  pancakeHouseMenuItems.forEach {
    println(it)
  }

  val dinnerMenu: DinnerMenu = DinnerMenu()
  val dinnerMenuItems: Array<MenuItem> = dinnerMenu.getMenuItems()
  dinnerMenuItems.forEach {
    println(it)
  }
}
