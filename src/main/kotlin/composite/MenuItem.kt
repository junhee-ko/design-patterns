package composite

class MenuItem(
  private val name: String,
  private val description: String,
  private val vegetarian: Boolean,
  private val price: Double
) : MenuComponent() {

  override fun getName(): String {
    return this.getName()
  }

  override fun getDescription(): String {
    return this.getDescription()
  }

  override fun getPrice(): Double {
    return this.getPrice()
  }

  override fun isVegetarian(): Boolean {
    return this.isVegetarian()
  }

  override fun print() {
    println("$name $description $vegetarian $price")
  }
}
