package iterator.improve1

interface Iterator {

  fun hasNext(): Boolean
  fun next(): MenuItem
}

class DinnerMenuIterator(
  private val items: Array<MenuItem>,
  private var position: Int = 0
) : Iterator {

  override fun hasNext(): Boolean = position < items.size

  override fun next(): MenuItem {
    val menuItem: MenuItem = items[position]
    position += 1

    return menuItem
  }
}

class PancakeHouseMenuIterator(
  private val items: MutableList<MenuItem>,
  private var position: Int = 0
) : Iterator {

  override fun hasNext(): Boolean = position < items.size

  override fun next(): MenuItem {
    val menuItem: MenuItem = items.get(position)
    position += 1

    return menuItem
  }
}
