package for_loop

class ForLoopDemo {

  def forLoopExample(): Unit = {
    var y = 0;
    // for loop execution with range
    for (y <- 1 to 7) {
      println("- Value of y is: " + y);
    }
  }

  def forLoopTest(): Unit = {
    val evens = for i <- 1 to 5 yield i * 2
    println("- Evens test: " + evens)
  }

}
