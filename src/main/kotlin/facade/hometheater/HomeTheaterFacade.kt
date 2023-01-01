package facade.hometheater

class HomeTheaterFacade(
  private val popcornPopper: PopcornPopper,
  private val lights: Lights,
  private val projector: Projector
) {

  fun watchMovie() {
    println("-- HomeTheaterFacade watchMovie")

    popcornPopper.on()
    popcornPopper.pop()

    lights.on()
    lights.dim()

    projector.on()
    projector.wideScreenMode()
  }

  fun endMovie() {
    println("-- HomeTheaterFacade endMovie")

    popcornPopper.off()
    lights.off()
    projector.off()
  }
}
