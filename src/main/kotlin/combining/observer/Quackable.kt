package combining.observer

/*
*  Quackable 를 다른 객체에서 관측할 수 있게 만들기 위해서는,
*  QuackObservable 인터페이스를 구현하면 됨
* */
interface Quackable: QuackObservable {

  fun quack()
}
