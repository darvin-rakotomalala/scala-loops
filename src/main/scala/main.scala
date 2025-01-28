import do_while_loop.DoWhileLoopDemo
import for_loop.{ForEachDemo, ForLoopDemo, ForToDemo, ForToUntilDemo, ForUntilDemo, RangesDemo, YieldDemo}
import while_loop.{WhileLoopDemo, WhileTrueDemo}

@main
def main(): Unit =
  println("--------------------------------------------------------------------------------------")
  println("Hello world! This is an example of the Scala | Loops(while, do..while, for, nested loops)")

  println("- While Loop examples: ")
  val whileLoop = new WhileLoopDemo()
  whileLoop.whileLoopExample()
  whileLoop.whileLoopTest()

  val whileTrueEx = new WhileTrueDemo()
  whileTrueEx.whileLoopExample()
  whileTrueEx.whileTrueTest()

  println("-----------------------------")

  val forLoop = new ForLoopDemo()
  forLoop.forLoopExample()
  forLoop.forLoopTest()

  println("-----------------------------")

  println("- Use a for-each loop over all the elements in the list: ")
  val forEachEx = new ForEachDemo()
  forEachEx.forEachExample()

  println("- Use a For to loop example: ")
  val forToEx = new ForToDemo()
  forToEx.forToExample()

  println("- Use a For Until loop example: ")
  val forUntilEx = new ForUntilDemo()
  forUntilEx.forUntilExample()

  println("- Use a For To and For Until loop example: ")
  val forToUntilEx = new ForToUntilDemo()
  forToUntilEx.forToUntilExample()

  println("- Ranges example: ")
  val rangeEx = new RangesDemo()
  rangeEx.rangeExample()

  println("-----------------------------")
  val doWhileLoop = new DoWhileLoopDemo()
  doWhileLoop.doWhileLoopExample()

  println("-----------------------------")
  val breakEx = new BreakStatement()
  println("- Breakable example: ")
  breakEx.breakDemo()
  println("- Breakable class and break in nested loop example: ")
  breakEx.breakNestedDemo()

  println("-----------------------------")
  println("- Using yield with for example")
  val yieldDemo = new YieldDemo()
  yieldDemo.yieldExample()
  println("- Yield Array example")
  yieldDemo.yieldArrayExample()


