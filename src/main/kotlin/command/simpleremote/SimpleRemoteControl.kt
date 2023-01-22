package command.simpleremote

class SimpleRemoteControl {

  private var slot: Command? = null

  fun buttonWasPressed() = slot?.execute()

  fun setCommand(command: Command){
    slot = command
  }
}
