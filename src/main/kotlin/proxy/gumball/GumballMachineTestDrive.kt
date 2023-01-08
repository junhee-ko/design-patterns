package proxy.gumball

import java.rmi.Naming
import kotlin.system.exitProcess

fun main(args: Array<String>) {
  val gumballMachine: GumballMachine


  if (args.size < 2) {
    println("GumballMachine <name> <inventory>")
    exitProcess(1)
  }

  try {
    val count = args[1].toInt()
    gumballMachine = GumballMachine(args[0], count)
    Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine)
  } catch (e: Exception) {
    e.printStackTrace()
  }
}

