package composite

abstract class MenuComponent {

  open fun add(menuComponent: MenuComponent): Unit = throw UnsupportedOperationException()

  open fun remove(menuComponent: MenuComponent): Unit = throw UnsupportedOperationException()

  open fun getChild(i: Int): MenuComponent = throw UnsupportedOperationException()

  open fun getName(): String = throw UnsupportedOperationException()

  open fun getDescription(): String = throw UnsupportedOperationException()

  open fun getPrice(): Double = throw UnsupportedOperationException()

  open fun isVegetarian(): Boolean = throw UnsupportedOperationException()

  open fun print(): Unit = throw UnsupportedOperationException()
}
