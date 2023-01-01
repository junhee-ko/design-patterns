package composite

class Menu(
  private val menuComponents: MutableList<MenuComponent> = mutableListOf(),
  private val name: String,
  private val description: String
) : MenuComponent() {

  override fun add(menuComponent: MenuComponent) {
    menuComponents.add(menuComponent)
  }

  override fun remove(menuComponent: MenuComponent) {
    menuComponents.remove(menuComponent)
  }

  override fun getChild(i: Int): MenuComponent = menuComponents[i]

  override fun getName(): String = this.getName()

  override fun getDescription(): String = this.getDescription()

  override fun print() {
    menuComponents.forEach {
      it.print()
    }
  }
}
