package example

/**
  * Created by diego on 25/05/16.
  */
object Main extends App {
  println(Lists.max(List(1, 3, 2)))
  println(Lists.sum(List(1, 3, 2)))

  println(Lists.max(List(1)))
  println(Lists.sum(List(1)))

  println(Lists.sum(Nil))
  println(Lists.sum(Nil))
}
