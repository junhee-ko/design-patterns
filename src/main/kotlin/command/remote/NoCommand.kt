package command.remote

class NoCommand: Command {

  override fun execute() {
    println("no command")
  }
}
