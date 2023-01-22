package command.all

class CeilingFan {
  var speed: Int = OFF

  fun high() {
    speed = HIGH
    println("CeilingFan High")
  }

  fun medium() {
    speed = MEDIUM
    println("CeilingFan Medium")
  }

  fun low() {
    speed = LOW
    println("CeilingFan Low")
  }

  fun off() {
    speed = OFF
    println("CeilingFan Off")
  }

  companion object {
    const val HIGH = 3
    const val MEDIUM = 2
    const val LOW = 1
    const val OFF = 0
  }
}
