package combining.decorator

class GooseAdapter(
  private val goose: Goose
): Quackable {

  override fun quack() = goose.hook()
}
