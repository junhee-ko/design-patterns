package proxy.gumball

import java.rmi.RemoteException

class GumballMonitor(
  private val machine: GumballMachineRemote
) {

  fun report() {
    try {
      println("Gumball Machine: " + machine.getLocation())
      println("Current inventory: " + machine.getCount() + " gumballs")
      println("Current state: " + machine.getState())
    } catch (e: RemoteException) {
      e.printStackTrace()
    }
  }
}
