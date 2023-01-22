package command.undo

fun main() {
  val remoteControl = RemoteControl()

  val light = Light()
  val ceilingFan = CeilingFan()

  val lightOnCommand = LightOnCommand(light)
  val lightOffCommand = LightOffCommand(light)
  val ceilingFanHighCommand = CeilingFanHighCommand(ceilingFan)
  val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)

  remoteControl.setCommand(
    slot = 0,
    onCommand = lightOnCommand,
    offCommand = lightOffCommand
  )
  remoteControl.setCommand(
    slot = 1,
    onCommand = ceilingFanHighCommand,
    offCommand = ceilingFanOffCommand
  )

  remoteControl.onButtonWasPushed(0)
  remoteControl.offButtonWasPushed(0)
  remoteControl.undoButtonWasPushed(0)

  remoteControl.onButtonWasPushed(1)
  remoteControl.offButtonWasPushed(1)
  remoteControl.undoButtonWasPushed(1)
}
