package command.remote

fun main() {
  val remoteControl = RemoteControl()

  val light = Light()
  val stereo = Stereo()

  val lightOnCommand = LightOnCommand(light)
  val lightOffCommand = LightOffCommand(light)
  val stereoOnWithCDCommand = StereoOnWithCDCommand(stereo)
  val stereoOffCommand = StereoOffCommand(stereo)

  remoteControl.setCommand(
    slot = 0,
    onCommand = lightOnCommand,
    offCommand = lightOffCommand
  )
  remoteControl.setCommand(
    slot = 1,
    onCommand = stereoOnWithCDCommand,
    offCommand = stereoOffCommand
  )

  remoteControl.onButtonWasPushed(0)
  remoteControl.offButtonWasPushed(0)
  remoteControl.onButtonWasPushed(1)
  remoteControl.offButtonWasPushed(1)
  remoteControl.onButtonWasPushed(2)
  remoteControl.offButtonWasPushed(2)
  remoteControl.onButtonWasPushed(3)
  remoteControl.offButtonWasPushed(3)
  remoteControl.onButtonWasPushed(4)
  remoteControl.offButtonWasPushed(4)
}
