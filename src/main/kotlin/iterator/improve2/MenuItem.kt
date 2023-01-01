package iterator.improve2

interface Menu {
  fun createIterator(): Iterator<MenuItem>
}

data class MenuItem(
  val name: String,
  val description: String,
  val vegetarian: Boolean,
  val price: Double
)

class DinnerMenu(
  private val menuItems: Array<MenuItem> = arrayOf(
    MenuItem(
      name = "DinnerMenu AA",
      description = "good",
      vegetarian = false,
      price = 1000.0
    ),
    MenuItem(
      name = "DinnerMenu CC",
      description = "delicious",
      vegetarian = false,
      price = 801.2
    )
  ),
  private var numberOfItems: Int = 0
): Menu {

  fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
    if (numberOfItems > MAX_ITEMS) {
      println("menu full")
    } else {

      menuItems[numberOfItems] = MenuItem(
        name = name,
        description = description,
        vegetarian = vegetarian,
        price = price
      )
    }
    numberOfItems += 1
  }

  override fun createIterator(): Iterator<MenuItem> = DinnerMenuIterator(menuItems)

  companion object {
    private const val MAX_ITEMS = 6
  }
}

class PancakeHouseMenu(
  private val menuItems: MutableList<MenuItem> = mutableListOf(
    MenuItem(
      name = "PancakeHouseMenu AA",
      description = "good",
      vegetarian = false,
      price = 1000.0
    ),
    MenuItem(
      name = "PancakeHouseMenu CC",
      description = "delicious",
      vegetarian = false,
      price = 801.2
    )
  )
): Menu {

  fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
    menuItems.add(
      MenuItem(
        name = name,
        description = description,
        vegetarian = vegetarian,
        price = price
      )
    )
  }

  override fun createIterator(): MutableIterator<MenuItem> = menuItems.iterator()
}

