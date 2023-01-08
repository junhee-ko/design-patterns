package proxy.gumball

import java.rmi.Naming

fun main(args: Array<String>) {
  val location = arrayOf(
    "rmi://santafe.mightygumball.com/gumballmachine",
    "rmi://boulder.mightygumball.com/gumballmachine",
    "rmi://austin.mightygumball.com/gumballmachine"
  )

  val monitors: MutableList<GumballMonitor> = mutableListOf()

  location.indices.forEach { index ->
    try {
      val machine = Naming.lookup(location[index]) as GumballMachineRemote
      monitors.add(GumballMonitor(machine))
    } catch (e: Exception) {
      e.printStackTrace()
    }
  }

  monitors.forEach { monitor -> monitor.report() }
}
