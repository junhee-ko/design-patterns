package singleton.threadsafe

fun main() {
  val instance: Singleton = Singleton.getInstance()
  println(instance.description)

}
