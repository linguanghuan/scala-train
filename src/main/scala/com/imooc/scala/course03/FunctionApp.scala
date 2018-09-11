package com.imooc.scala.course03

/**
  * 函数的定义和使用
  */
object FunctionApp {

  def main(args: Array[String]): Unit = {
    println(add(2, 3))
    println(three())
    println(three)   // 没有入参可以直接写函数名称省略括号
    sayHello()
    sayHello
    sayHello("zhangsan")
    sayName()  // 这里括号不能省略
    sayName("ruoze")

    // 命名参数
    println(speed(100, 10))
    println(speed(time = 10,distance = 100))

    // 可变参数 *
    println(sum(1,2,3,4,5,6,7,8,9))

    // 循环表达式
    for( i<- 1 to 10 if i%2==0) {
      println(i)
    }
    val courses = Array("Hadoop", "Spark SQL", "Spark Streaming")
    for(course<-courses) {
      println(course)
    }
    // => 将左边的course作用上一个函数变成另外一个结果
    courses.foreach(course=>println(course))
    var (num, sumResult) = (100, 0)
    while(num > 0) {
      sumResult = sumResult + num
      num = num -1
    }
    println(sumResult)
  }

  def add(x:Int, y: Int): Int = {
    x + y  // 如果有返回值最后一行直接当返回值
  }

  def three() = 1 + 2  // 只用一行可以不用{}

  def sayHello()={
    println("say hello")
  }

  def sayHello(name:String)={
    println(" hello " + name)
  }

  // 默认参数
  def sayName(name:String="PK") = {
    println(name)
  }

  // 命名参数
  def speed(distance:Float, time:Float):Float =  {
    distance / time
  }

  // 可变参数
  def sum(numbers:Int*):Int = {
    var result = 0
    for(number<-numbers) {
      result += number
    }
    result
  }
}
