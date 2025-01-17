package while_loop

/* Scala program to illustrate while loop */
class WhileLoopDemo {

  def whileLoopExample(): Unit = {
    var x = 1
    while (x <= 4) {
      println("- Value of x: " + x)
      // Increment the value of x for next iteration
      x = x + 1
    }
  }

  def whileLoopTest(): Unit = {
    // while loops are also expressions that always return Unit
    var counter = 1
    val result: Unit = while (counter < 5) {
      counter += 1
      println("- Counter Unit test:" + counter)
    }
  }

}
