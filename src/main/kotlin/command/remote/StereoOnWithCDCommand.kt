package command.remote

class StereoOnWithCDCommand(
  private val stereo: Stereo
): Command {

  override fun execute() {
    stereo.on()
    stereo.setCD()
    stereo.setVolume(1)
  }

  override fun toString(): String = "StereoOnWithCDCommand(stereo=$stereo)"
}
