package combining.observer

class Quackologist: Observer {

  override fun update(duck: QuackObservable) =
    println("Quackologist: $duck quacked")
}
