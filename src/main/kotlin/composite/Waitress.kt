package composite

class Waitress(
  private val allMenu: MenuComponent
) {

  fun printMenu() = allMenu.print()
}
