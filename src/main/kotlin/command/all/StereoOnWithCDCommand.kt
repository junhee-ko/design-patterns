package command.all

class StereoOnWithCDCommand(
  private val stereo: Stereo
): Command {

  override fun execute() {
    stereo.on()
    stereo.setCD()
    stereo.setVolume(1)
  }

  override fun undo() {
    stereo.off()
  }

  override fun toString(): String = "StereoOnWithCDCommand(stereo=$stereo)"
}
