package singleton.classic

fun main() {
  val instance: Singleton = Singleton.getInstance()
  println(instance.description)
}
