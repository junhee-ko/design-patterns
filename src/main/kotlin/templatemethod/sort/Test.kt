package templatemethod.sort

import java.util.*

fun main() {
  val ducks: Array<Duck> = arrayOf(
    Duck("A", 8),
    Duck("B", 1),
    Duck("C", 4),
    Duck("D", 9),
  )

  println("before sort")
  display(ducks)

  Arrays.sort(ducks)

  println("after sort")
  display(ducks)
}

private fun display(ducks: Array<Duck>) {
  ducks.forEach {
    println(it)
  }
}
