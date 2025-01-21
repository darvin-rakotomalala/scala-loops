package for_loop

class ForToUntilDemo {

  def forToUntilExample(): Unit = {
    // Use parentheses around with to method.
    for (i <- 0.to(3)) {
      println(s"for to $i")
    }

    // Use parentheses with until.
    for (i <- 0.until(3)) {
      println(s"for until $i")
    }
  }
}
