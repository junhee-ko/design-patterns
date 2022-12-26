package factory.abstractfactory

interface PizzaIngredientFactory {

  fun createDough(): Dough
  fun createSauce(): Sauce
  fun createCheese(): Cheese
  fun createVeggies(): List<Veggies>
  fun createPepperoni(): Pepperoni
  fun createClam(): Clams
}


class NewYorkPizzaIngredientFactory : PizzaIngredientFactory {

  override fun createDough(): Dough = ThinCrustDough()

  override fun createSauce(): Sauce = MarinaraSauce()

  override fun createCheese(): Cheese = MozzarellaCheese()

  override fun createVeggies(): List<Veggies> = listOf(Spinach())

  override fun createPepperoni(): Pepperoni = SlicedPepperoni()

  override fun createClam(): Clams = FrozenClams()
}

