package adapter.enumerationiterator

import java.util.Vector

fun main() {
  val vector: Vector<String> = Vector<String>(listOf("A", "C", "B"))
  val enumerationIterator: EnumerationIterator = EnumerationIterator(vector.elements())

  while (enumerationIterator.hasNext()) {
    println(enumerationIterator.next())
  }

  enumerationIterator.remove()
}
