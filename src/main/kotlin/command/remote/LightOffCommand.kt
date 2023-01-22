package command.remote

class LightOffCommand(
  private val light: Light
): Command {

  override fun execute() {
    light.off()
  }

  override fun toString(): String = "LightOffCommand(light=$light)"
}
