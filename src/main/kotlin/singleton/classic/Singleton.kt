package singleton.classic

class Singleton private constructor(
  val description: String = "classic singleton"
) {

  companion object {
    var uniqueInstance: Singleton? = null

    fun getInstance(): Singleton {
      if (uniqueInstance == null) {
        uniqueInstance = Singleton()
      }

      return uniqueInstance as Singleton
    }
  }
}

