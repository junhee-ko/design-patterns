package proxy.gumball

import java.io.Serializable

interface State : Serializable {

  fun insertQuarter()

  fun ejectQuarter()

  fun turnCrank()

  fun dispense()
}

class NoQuarterState(
  @Transient private val gumballMachine: GumballMachine
) : State {


  override fun insertQuarter() {
    println("You inserted a quarter")
    gumballMachine.setState(gumballMachine.hasQuarterState)
  }

  override fun ejectQuarter() = println("You haven't inserted a quarter")
  override fun turnCrank() = println("You turned, but there's no quarter")
  override fun dispense() = println("You need to pay first")

  companion object {
    private const val serialVersionUID = 2L
  }
}

class HasQuarterState(
  @field:Transient var gumballMachine: GumballMachine
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

  companion object {
    private const val serialVersionUID = 2L
  }
}

class SoldOutState(
  @field:Transient var gumballMachine: GumballMachine
) : State {

  override fun insertQuarter() = println("You can't insert a quarter, the machine is sold out")

  override fun ejectQuarter() = println("You can't eject, you haven't inserted a quarter yet")

  override fun turnCrank() = println("You turned, but there are no gumballs")

  override fun dispense() = println("No gumball dispensed")

  companion object {
    private const val serialVersionUID = 2L
  }
}

class SoldState(
  @field:Transient var gumballMachine: GumballMachine
) : State {

  override fun insertQuarter() = println("Please wait, we're already giving you a gumball")

  override fun ejectQuarter() = println("Sorry, you already turned the crank")

  override fun turnCrank() = println("Turning twice doesn't get you another gumball!")

  override fun dispense() {
    gumballMachine.releaseBall()

    if (gumballMachine.getCount() > 0) {
      gumballMachine.setState(gumballMachine.noQuarterState)
    } else {
      println("Oops, out of gumballs!")
      gumballMachine.setState(gumballMachine.soldOutState)
    }
  }

  companion object {
    private const val serialVersionUID = 2L
  }
}

