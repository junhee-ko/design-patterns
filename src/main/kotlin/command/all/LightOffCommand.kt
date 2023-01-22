package command.all

class LightOffCommand(
  private val light: Light
): Command {

  override fun execute() {
    light.off()
  }

  override fun undo() {
    light.on()
  }

  override fun toString(): String = "LightOffCommand(light=$light)"
}
