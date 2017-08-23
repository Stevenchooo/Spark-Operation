package basicOperation

import scala.io.Source

/**
  * Created by Steven on 2017/8/4.
  */
object readFiles {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile ("pom.xml")
    // val file = Source.fromURL( "http://spark.apache.org")
    for (line <- file.getLines()){
      println(line)
    }
    file.close()
    println(matchTest("Two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))
  }

  def matchTest(x :Any) : Any = x match{
      //case的顺序有影响
    case 1 => "One"
    case "Two" => 2
    case y: Int => "scala.Int"
    case _ => "many"

  }

  case class Person(name: String, age: Int)

}

