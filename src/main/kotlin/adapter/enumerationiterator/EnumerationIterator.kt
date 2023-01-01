package adapter.enumerationiterator

import java.lang.UnsupportedOperationException
import java.util.Enumeration

class EnumerationIterator(
  private val enumeration: Enumeration<*>
) : Iterator<Any> {

  override fun hasNext(): Boolean = enumeration.hasMoreElements()

  override fun next(): Any = enumeration.nextElement()

  fun remove(): Unit = throw UnsupportedOperationException()
}
