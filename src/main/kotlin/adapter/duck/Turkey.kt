package adapter.duck

interface Turkey {

  fun gobble()
  fun fly()
}

class WildTurkey : Turkey {

  override fun gobble() = println("WildTurkey gobble")

  override fun fly() = println("WildTurkey fly")
}
