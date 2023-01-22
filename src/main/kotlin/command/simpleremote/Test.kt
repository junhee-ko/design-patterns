package command.simpleremote

fun main() {
  val simpleRemoteControl = SimpleRemoteControl()
  val light = Light()
  val lightOnCommand = LightOnCommand(light)

  simpleRemoteControl.setCommand(lightOnCommand)
  simpleRemoteControl.buttonWasPressed()
}
