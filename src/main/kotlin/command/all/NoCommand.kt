package command.all

class NoCommand: Command {

  override fun execute() {
    println("no command")
  }

  override fun undo() {
    println("no command")
  }
}
