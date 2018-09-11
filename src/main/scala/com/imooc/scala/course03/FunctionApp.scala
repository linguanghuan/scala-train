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
}
