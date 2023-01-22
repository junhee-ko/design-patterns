package command.all

class LightOnCommand(
  private val light: Light
): Command {

  override fun execute() {
    light.on()
  }

  override fun undo() {
    light.off()
  }

  override fun toString(): String = "LightOnCommand(light=$light)"
}
