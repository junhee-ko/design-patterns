package state.gumballstate

interface State {
  fun insertQuarter()
  fun ejectQuarter()
  fun turnCrank()
  fun dispense()
}

class SoldState(
  private val gumballMachine: GumballMachine
) : State {

  override fun insertQuarter() = println("Please wait, we're already giving you a gumball")

  override fun ejectQuarter() = println("Sorry, you already turned the crank")

  override fun turnCrank() = println("Turning twice doesn't get you another gumball!")

  override fun dispense() {
    gumballMachine.releaseBall()

    if (gumballMachine.count > 0) {
      gumballMachine.setState(gumballMachine.noQuarterState)
    } else {
      println("Oops, out of gumballs!")
      gumballMachine.setState(gumballMachine.soldOutState)
    }
  }
}

class SoldOutState(
  private val gumballMachine: GumballMachine
) : State {

  override fun insertQuarter() = println("You can't insert a quarter, the machine is sold out")

  override fun ejectQuarter() = println("You can't eject, you haven't inserted a quarter yet")

  override fun turnCrank() = println("You turned, but there are no gumballs")

  override fun dispense() = println("No gumball dispensed")
}

class NoQuarterState(
  private val gumballMachine: GumballMachine
) : State {

  override fun insertQuarter() {
    println("You inserted a quarter")
    gumballMachine.setState(gumballMachine.hasQuarterState)
  }

  override fun ejectQuarter() = println("You haven't inserted a quarter")

  override fun turnCrank() = println("You turned, but there's no quarter")

  override fun dispense() = println("You need to pay first")
}

class HasQuarterState(
  private val gumballMachine: GumballMachine
) : State {

  override fun insertQuarter() = println("You can't insert another quarter")

  override fun ejectQuarter() {
    println("Quarter returned")
    gumballMachine.setState(gumballMachine.noQuarterState)
  }

  override fun turnCrank() {
    println("You turned...")
    gumballMachine.setState(gumballMachine.soldState)
  }

  override fun dispense() = println("No gumball dispensed")
}

