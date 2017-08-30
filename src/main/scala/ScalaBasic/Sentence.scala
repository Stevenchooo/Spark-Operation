package ScalaBasic

/**
  * Created by cWX491729 on 2017/8/30.
  */
object Sentence {
  def main(args: Array[String]): Unit = {
    //<- 生成器
    var a = 0;
    val numList = List(1,2,3,4,5,6,7,8,9,10);
    for(x <- numList if x<8 ; if x != 3){
      print((x + ". "))
    }
    fu()
  }

  def functionName (a:Int, b:Int) :Int ={
    var sum:Int = 0
    sum = a + b
    return sum
  }
  def fu():Unit={
    return print("return text")
  }
}
