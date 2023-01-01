package iterator.improve2

import java.lang.UnsupportedOperationException

class DinnerMenuIterator(
  private val items: Array<MenuItem>,
  private var position: Int = 0
) : Iterator<MenuItem> {

  override fun hasNext(): Boolean = position < items.size

  override fun next(): MenuItem {
    val menuItem: MenuItem = items[position]
    position += 1

    return menuItem
  }

  fun remove(): Unit = throw UnsupportedOperationException()
}
