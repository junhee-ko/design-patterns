package singleton.staticinit

fun main() {
  val instance: Singleton = Singleton.uniqueInstance
  println(instance.description)
}
