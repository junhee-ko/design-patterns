package proxy.gumball

import java.rmi.server.UnicastRemoteObject

class GumballMachine(
  private val location: String,
  private val numberGumballs: Int
) : UnicastRemoteObject(), GumballMachineRemote {

  val soldOutState: State
  val noQuarterState: State
  val hasQuarterState: State
  val soldState: State

  private var state: State
  private var count: Int

  init {
    soldOutState = SoldOutState(this)
    noQuarterState = NoQuarterState(this)
    hasQuarterState = HasQuarterState(this)
    soldState = SoldState(this)

    this.count = numberGumballs

    state = if (numberGumballs > 0) {
      noQuarterState
    } else {
      soldOutState
    }
  }

  fun insertQuarter() {
    state.insertQuarter()
  }

  fun ejectQuarter() {
    state.ejectQuarter()
  }

  fun turnCrank() {
    state.turnCrank()
    state.dispense()
  }

  fun setState(state: State) {
    this.state = state
  }

  fun releaseBall() {
    println("A gumball comes rolling out the slot...")

    if (count != 0) {
      count -= 1
    }
  }

  override fun getCount(): Int = count

  override fun getLocation(): String = location

  override fun getState(): State = state

  companion object {
    private const val serialVersionUID = 2L
  }
}
