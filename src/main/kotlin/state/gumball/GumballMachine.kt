package state.gumball

class GumballMachine(
  private var count: Int = 0,
) {

  private var state: Int = SOLD_OUT

  init {
    if (count >= 0) {
      state = NO_QUARTER
    }
  }

  fun insertQuarter() {
    when (state) {
      HAS_QUARTER -> println("You can't insert another quarter")
      SOLD_OUT -> println("You can't insert a quarter, the machine is sold out")
      SOLD -> println("Please wait, we're already giving you a gumball")
      NO_QUARTER -> {
        state = HAS_QUARTER
        println("You inserted a quarter")
      }
    }
  }

  fun ejectQuarter() {
    when (state) {
      NO_QUARTER -> println("You haven't inserted a quarter")
      SOLD -> println("Sorry, you already turned the crank")
      SOLD_OUT -> println("You can't eject, you haven't inserted a quarter yet")
      HAS_QUARTER -> {
        println("Quarter returned")
        state = NO_QUARTER
      }
    }
  }

  fun turnCrank() {
    when (state) {
      SOLD -> println("Turning twice doesn't get you another gumball!")
      NO_QUARTER -> println("You turned but there's no quarter")
      SOLD_OUT -> println("You turned, but there are no gumballs")
      HAS_QUARTER -> {
        println("You turned...")
        state = SOLD
        dispense()
      }
    }
  }

  private fun dispense() {
    when (state) {
      NO_QUARTER -> println("You need to pay first")
      SOLD_OUT -> println("No gumball dispensed")
      HAS_QUARTER -> println("No gumball dispensed")
      SOLD -> {
        println("A gumball comes rolling out the slot")
        count -= 1
        state = if (count == 0) {
          println("Oops, out of gumballs!")
          SOLD_OUT
        } else {
          NO_QUARTER
        }
      }
    }
  }

  override fun toString(): String {
    val state = when (state) {
      0 -> "SOLD"
      1 -> "NO_QUARTER"
      2 -> "HAS_QUARTER"
      3 -> "SOLD"
      else -> "NOT DEFINED"
    }
    return "GumballMachine(count=$count, state=$state)"
  }


  companion object {
    private const val SOLD_OUT = 0
    private const val NO_QUARTER = 1
    private const val HAS_QUARTER = 2
    private const val SOLD = 3
  }
}
