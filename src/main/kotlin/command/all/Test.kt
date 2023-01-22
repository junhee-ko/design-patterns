package command.all

fun main() {
  val remoteControl = RemoteControl()

  val light = Light()
  val ceilingFan = CeilingFan()

  val lightOnCommand = LightOnCommand(light)
  val lightOffCommand = LightOffCommand(light)
  val ceilingFanHighCommand = CeilingFanHighCommand(ceilingFan)
  val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)

  val partyOn = arrayOf(lightOnCommand, ceilingFanHighCommand)
  val partyOff = arrayOf(lightOffCommand, ceilingFanOffCommand)
  val partyOnMacro = MacroCommand(partyOn)
  val partyOffMacro = MacroCommand(partyOff)

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
  remoteControl.setCommand(
    slot = 2,
    onCommand = partyOnMacro,
    offCommand = partyOffMacro
  )

  remoteControl.onButtonWasPushed(0)
  remoteControl.offButtonWasPushed(0)
  remoteControl.undoButtonWasPushed()

  remoteControl.onButtonWasPushed(1)
  remoteControl.offButtonWasPushed(1)
  remoteControl.undoButtonWasPushed()

  remoteControl.onButtonWasPushed(2)
  remoteControl.offButtonWasPushed(2)
  remoteControl.undoButtonWasPushed()
}
