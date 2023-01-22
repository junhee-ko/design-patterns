package command.remote

class RemoteControl {

  private var onCommands: Array<Command> = Array(7) { NoCommand() }
  private var offCommands: Array<Command> = Array(7) { NoCommand() }

  fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
    onCommands[slot] = onCommand
    offCommands[slot] = offCommand
  }

  fun onButtonWasPushed(slot: Int) {
    onCommands[slot].execute()
  }

  fun offButtonWasPushed(slot: Int) {
    offCommands[slot].execute()
  }

  override fun toString(): String {
    return "RemoteControl(onCommands=${onCommands.contentToString()}, offCommands=${offCommands.contentToString()})"
  }
}
