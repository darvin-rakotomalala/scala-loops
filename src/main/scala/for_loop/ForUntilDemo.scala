package for_loop

class ForUntilDemo {

  def forUntilExample(): Unit = {
    // With until, the final number is not included.
    // ... It is an exclusive bound.
    for (i <- 100 until 105) println(i)
  }
}
