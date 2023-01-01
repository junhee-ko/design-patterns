package facade.hometheater

fun main() {
  val homeTheaterFacade: HomeTheaterFacade = HomeTheaterFacade(
    PopcornPopper(),
    Lights(),
    Projector()
  )

  homeTheaterFacade.watchMovie()
  homeTheaterFacade.endMovie()
}
