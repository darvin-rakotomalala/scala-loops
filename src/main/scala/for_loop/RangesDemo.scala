package for_loop

class RangesDemo {

  def rangeExample(): Unit = {
    // Loop over the numbers in a range.
    for (i <- Range(5, 8)) {
      println(s"range1 $i")
    }

    // Loop with a step of 2.
    for (i <- Range(0, 5, 2)) {
      println(s"range2 $i")
    }

    // A decrement for-loop.
    // ... Step is negative 1.
    for (i <- Range(10, 5, -1)) {
      println(s"range3 $i")
    }
  }
}
