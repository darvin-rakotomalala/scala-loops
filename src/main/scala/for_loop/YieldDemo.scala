package for_loop

/*
  Scala program to illustrate yield keyword.
  yield keyword will returns a result after completing of loop iterations.

  Syntax:
    var result = for{ var x <- List}
    yield x
 */
class YieldDemo {

  def yieldExample(): Unit = {
    // Using yield with for
    var print = for (i <- 1 to 10) yield i
    for (j <- print) {
      // Printing result
      println(j)
    }
  }

  def yieldArrayExample(): Unit = {
    val a = Array(8, 3, 1, 6, 4, 5)
    // Using yield with for
    var print = for (e <- a if e > 4) yield e
    for (i <- print) {
      // Printing result
      println(i)
    }
  }


}
