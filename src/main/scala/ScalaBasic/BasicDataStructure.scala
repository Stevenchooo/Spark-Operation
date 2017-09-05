package ScalaBasic

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Steven on 2017/8/18.
  */
object BasicDataStructure {
  def main(args: Array[String]): Unit = {


  }

  case class MainBefore0901() {
    //模式匹配
    def fibonacci(in: Any): Int = in match {
      case 0 => 0
      case 1 => 1
      case n: Int if (n > 1) => fibonacci(n - 1) + fibonacci(n - 2)
      case _ => 0
    }

    println(fibonacci(7))

    //元祖
    val hostPort = ("localhost", 80)
    println("host:%s,port:%s".format(hostPort._1, hostPort._2))

    //选项 Option
    //Option本身是泛型的，并且有两个子类： Some[T] 或 None
    trait Option[T] {
      def isDefined: Boolean

      def get: T

      def getOrElse(t: T): T
    }

    //映射 Map
    val map = Map(1 -> "one", 2 -> "two")
    println(map.get(2))
    println(map.get(3))

    //函数组合子 Functional Combinators
    //Map
    val numbers = List(1, 2, 3)
    val double: Seq[Double] = numbers.map((i: Int) => i * 2.0)
    val squared: Seq[BigInt] = numbers.map((i: Int) => BigInt(i).pow(3))
    println("%s".format(numbers))
    println(double)
    println(squared)

    def timesTwo(i: Int): Int = i * 2

    val doubleFunction = numbers.map(timesTwo _)
    println(" foreach : " + doubleFunction)


  }

  case class MainAfter0901() {
    val strArrayVar = ArrayBuffer[String]()
    strArrayVar += "Hello"
    strArrayVar += ("World", "Programmer")
    strArrayVar ++= Array("Wllcome", "To", "XueTuWuYou")

    var mylist = Array(7.5, 1.5, 2.5, 4.5, 5.5)
    for (x <- mylist) {
      println(x)
    }
    var total = 0.0;
    for (x <- 0 to mylist.length - 1) {
      total += mylist(x)
    }
    println("Total is " + total)
    var max = mylist(0)
    for (x <- 0 to mylist.length - 1) {
      if (mylist(x) > max) max = mylist(x)
    }
    println("Max is " + max)
  }

}
