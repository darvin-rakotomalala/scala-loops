import do_while_loop.DoWhileLoopDemo
import for_loop.ForLoopDemo
import while_loop.WhileLoopDemo

@main
def main(): Unit =
  println("--------------------------------------------------------------------------------------")
  println("Hello world! This is an example of the Scala | Loops(while, do..while, for, nested loops)")

  val whileLoop = new WhileLoopDemo()
  whileLoop.whileLoopExample()
  whileLoop.whileLoopTest()

  println("-------------------")

  val forLoop = new ForLoopDemo()
  forLoop.forLoopExample()
  forLoop.forLoopTest()

  println("-------------------")
  val doWhileLoop = new DoWhileLoopDemo()
  doWhileLoop.doWhileLoopExample()

  println("-------------------")
  val breakEx = new BreakStatement()
  println("- Breakable example: ")
  breakEx.breakDemo()
  println("- Breakable class and break in nested loop example: ")
  breakEx.breakNestedDemo()


