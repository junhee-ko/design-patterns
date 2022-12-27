package singleton.threadsafe

class Singleton private constructor(
  val description: String = "thread safe singleton"
) {

  companion object {
    private var uniqueInstance: Singleton? = null

    @Synchronized
    fun getInstance(): Singleton {
      if (uniqueInstance == null) {
        uniqueInstance = Singleton()
      }

      return uniqueInstance as Singleton
    }
  }
}

