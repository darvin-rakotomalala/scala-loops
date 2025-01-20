import scala.util.control._
import scala.util.control.Breaks.{break, breakable}

/*
  Scala program to illustrate the implementation of break
 */
class BreakStatement {

  def breakDemo(): Unit = {
    // Here, breakable is used to prevent exception
    breakable {
      for (a <- 1 to 10) {
        if (a == 6)
          // terminate the loop when
          // the value of a is equal to 6
          break
        else
          println(a);
      }
    }
  }

  def breakNestedDemo(): Unit = {
    var num1 = 0;
    var num2 = 0;
    val x = List(5, 10, 15);
    val y = List(20, 25, 30);

    val outLoop = new Breaks;
    val inLoop = new Breaks;

    // Here, breakable is used to prevent from exception
    outLoop.breakable {
      for (num1 <- x) {
        // print list x
        println(" " + num1);
        inLoop.breakable {
          for (num2 <- y) {
            //print list y
            println(" " + num2);

            if (num2 == 25) {
              // inLoop is break when num2 is equal to 25
              inLoop.break;
            }
          }
          // Here, inLoop breakable
        }
      }
      // Here, outLoop breakable
    }

  }


}
