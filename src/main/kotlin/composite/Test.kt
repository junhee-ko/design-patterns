package composite

fun main() {
  val pancake: MenuComponent = Menu(
    name = "pancake",
    description = "good"
  )
  val dinner: MenuComponent = Menu(
    name = "dinner",
    description = "expensive"
  )

  val allMenus: MenuComponent = Menu(
    name = "all menus",
    description = "top level"
  )
  allMenus.add(pancake)
  allMenus.add(dinner)

  val underDinner01: MenuComponent = MenuItem(
    name = "under dinner 01",
    description = "under dinner 01",
    vegetarian = false,
    price = 10.0
  )
  val underDinner02: MenuComponent = MenuItem(
    name = "under dinner 02",
    description = "under dinner 02",
    vegetarian = true,
    price = 12.0
  )
  dinner.add(underDinner01)
  dinner.add(underDinner02)

  val waitress: Waitress = Waitress(allMenus)
  waitress.printMenu()
}
