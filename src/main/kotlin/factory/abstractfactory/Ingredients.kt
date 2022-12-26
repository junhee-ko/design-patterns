package factory.abstractfactory

interface Cheese

class ParmesanCheese : Cheese {

  override fun toString(): String = "Shredded Parmesan"
}

class MozzarellaCheese : Cheese {

  override fun toString(): String = "Shredded Mozzarella"
}

interface Clams

class FreshClams : Clams {

  override fun toString(): String = "Fresh Clams from Long Island Sound"
}

class FrozenClams : Clams {

  override fun toString(): String = "Frozen Clams from Chesapeake Bay"
}

interface Dough

class ThinCrustDough : Dough {

  override fun toString(): String = "Thin Crust Dough"
}

class ThickCrustDough : Dough {

  override fun toString(): String = "ThickCrust style extra thick crust dough"
}

interface Pepperoni

class SlicedPepperoni : Pepperoni {

  override fun toString(): String = "Sliced Pepperoni"
}

interface Sauce

class MarinaraSauce : Sauce {

  override fun toString(): String = "Marinara Sauce"
}

class PlumTomatoSauce : Sauce {

  override fun toString(): String = "Tomato sauce with plum tomatoes"
}

interface Veggies

class Spinach : Veggies {

  override fun toString(): String = "Spinach"
}

class Eggplant : Veggies {

  override fun toString(): String = "Eggplant"
}
