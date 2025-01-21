package while_loop

class WhileTrueDemo {

  def whileLoopExample(): Unit = {
    var i = 3
    // Continue looping while "i" is greater than or equal to zero.
    while (i >= 0) {
      println(i)
      // Decrement.
      i -= 1
    }
  }

  def whileTrueTest(): Unit = {
    // Print random numbers in a loop.
    while (true) {
      val rand = Math.random()
      // Return if random number is too small.
      if (rand <= 0.1) {
        return
      }
      println(rand)
    }
  }

}
