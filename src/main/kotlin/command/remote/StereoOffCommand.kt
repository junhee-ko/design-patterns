package command.remote

class StereoOffCommand(
  private val stereo: Stereo
): Command {

  override fun execute() = stereo.off()

  override fun toString(): String = "StereoOffCommand(stereo=$stereo)"
}
