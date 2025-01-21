package for_loop

class ForEachDemo {

  def forEachExample(): Unit = {
    val ids = List("a1", "b2", "c3")
    for (id <- ids) println(id)
  }
}
