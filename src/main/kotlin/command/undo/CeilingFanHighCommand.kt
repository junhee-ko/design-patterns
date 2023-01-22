package command.undo

class CeilingFanHighCommand(
  private val ceilingFan: CeilingFan
) : Command {

  private var prevSpeed: Int = ceilingFan.speed

  override fun execute() {
    prevSpeed = ceilingFan.speed
    ceilingFan.high()
  }

  override fun undo() {
    when (prevSpeed) {
        CeilingFan.HIGH -> ceilingFan.high()
        CeilingFan.MEDIUM -> ceilingFan.medium()
        CeilingFan.LOW -> ceilingFan.low()
        CeilingFan.OFF -> ceilingFan.off()
    }
  }
}
