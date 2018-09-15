package com.imooc.scala.course06

object ExceptionApp extends App {

  try {
    val i = 10/0  // java.lang.ArithmeticException: / by zero
    println(i)
  } catch{
    case e: ArithmeticException => println("除数不能为0")
    case e: Exception => println(e.getMessage)
  } finally {
    // 释放资源, 一定能执行
    // IO操作: close file
  }

}
