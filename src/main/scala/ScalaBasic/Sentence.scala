package ScalaBasic
import java.util.Date
/**
  * Created by cWX491729 on 2017/8/30.
  */
object Sentence {
  def main(args: Array[String]): Unit = {
    //<- 生成器
    var a = 0;
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    for (x <- numList if x < 8; if x != 3) {
      print((x + ". "))
    }
    fu()
    for (i <- 1 until 10) {
      println("Factorial of " + i + ": = " + faberity(i))
    }
    fa("Hello", "Scala", "Python");
    print("\n" + apply(layout, 10))

    print("\n" + function0(12, 12)
      + "\n" + function1)

    val date1 = new Date
    val logg = function2(date1 , _:String)
    logg("message1")
    Thread.sleep(2000)
    val date2 = new Date
    logg("message2")
  }

  def functionName(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }

  def fu(): Unit = {
    return println("return text")
  }

  def faberity(n: BigInt): BigInt = {
    if (n < 1)
      1
    else
      n * faberity(n - 1)
  }

  def fa(args: String*) = {
    var i: Int = 0;
    for (a <- args) {
      println("Arg value[" + i + "] = " + a);
      i += 1
    }
  }

  //将其他函数作为参数或其结果是函数的函数。
  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"

  //匿名函数
  var function0 = (x: Int, y: Int) => x * y
  var function1 = () => ("steve")

  //柯里化函数
  def strcat(s1: String)(s2: String) = s1 + s2
  def strcat1(s1: String) = (s2: String) => s1 + s2

  //Scala允许您定义函数内部的函数，而在其他函数中定义的函数称为局部函数。

  def function2 (date : Date , message: String )= {
    println(date + "----" + message)
  }


}
