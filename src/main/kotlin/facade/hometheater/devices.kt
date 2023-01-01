package facade.hometheater

class PopcornPopper {

  fun on() = println("PopcornPopper on")

  fun off() = println("PopcornPopper off")

  fun pop() = println("PopcornPopper pop")
}

class Lights {

  fun on() = println("Lights on")

  fun off() = println("Lights off")

  fun dim() = println("Lights dim")
}

class Projector {

  fun on() = println("Projector on")

  fun off() = println("Projector off")

  fun wideScreenMode() = println("Projector wideScreenMode")
}
