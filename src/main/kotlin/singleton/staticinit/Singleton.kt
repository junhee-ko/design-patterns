package singleton.staticinit

class Singleton private constructor(
  val description: String = "static init singleton"
) {

  companion object {
    val uniqueInstance: Singleton = Singleton()
  }
}

