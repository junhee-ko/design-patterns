package state.gumballstate

class GumballMachine(
  var count: Int = 0,
) {

  private var state: State

  val soldOutState: State
  val noQuarterState: State
  val hasQuarterState: State
  val soldState: State

  init {
    soldOutState = SoldOutState(this)
    noQuarterState = NoQuarterState(this)
    hasQuarterState = HasQuarterState(this)
    soldState = SoldState(this)

    state = if (count > 0) {
      noQuarterState
    } else {
      soldOutState
    }
  }

  fun insertQuarter() = state.insertQuarter()

  fun ejectQuarter() = state.ejectQuarter()

  fun turnCrank() {
    state.turnCrank()
    state.dispense()
  }

  fun setState(state: State) {
    this.state = state
  }

  fun releaseBall() {
    println("A gumball comes rolling out the slot...")

    if (count > 0) {
      count -= 1
    }
  }
}
