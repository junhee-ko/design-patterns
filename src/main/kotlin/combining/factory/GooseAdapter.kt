package combining.factory

class GooseAdapter(
  private val goose: Goose
): Quackable {

  override fun quack() = goose.hook()
}
