package command.all

class RemoteControl {

  private var onCommands: Array<Command> = Array(7) { NoCommand() }
  private var offCommands: Array<Command> = Array(7) { NoCommand() }
  private var undoCommand: Command = NoCommand()

  fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
    onCommands[slot] = onCommand
    offCommands[slot] = offCommand
  }

  fun onButtonWasPushed(slot: Int) {
    onCommands[slot].execute()
    undoCommand = onCommands[slot]
  }

  fun offButtonWasPushed(slot: Int) {
    offCommands[slot].execute()
    undoCommand = offCommands[slot]
  }

  fun undoButtonWasPushed() {
    undoCommand.undo()
  }

  override fun toString(): String {
    return "RemoteControl(onCommands=${onCommands.contentToString()}, offCommands=${offCommands.contentToString()})"
  }
}
