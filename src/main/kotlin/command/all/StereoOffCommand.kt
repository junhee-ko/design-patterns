package command.all

class StereoOffCommand(
  private val stereo: Stereo
) : Command {

  override fun execute() = stereo.off()

  override fun undo() = stereo.on()

  override fun toString(): String = "StereoOffCommand(stereo=$stereo)"
}
