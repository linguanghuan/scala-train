package com.imooc.scala.course07

/**
  * 匿名函数
  * () => 函数体
  */
object FunctionApp  extends App {
  def sayHello(name:String) = {
    println("Hi:" + name)
  }

  sayHello("PK")

  /*
  匿名函数定义方式
scala> (x:Int)=>x+1
res0: Int => Int = <function1>

不加括号错误
scala> x:Int=>x+1
<console>:1: error: ';' expected but '=>' found.
x:Int=>x+1

匿名函数传给变量
scala> val m1 = (x:Int)=>x+1
m1: Int => Int = <function1>

调用
scala> m1(10)
res1: Int = 11

正常定义函数的方式 =
scala> def add(x:Int,y:Int)={x+y}
add: (x: Int, y: Int)Int
scala> add(2,3)
res3: Int = 5

匿名函数定义的方式 =>
scala> def add2=(x:Int,y:Int)=>{x+y}
add2: (Int, Int) => Int
scala> add2(2,3)
res4: Int = 5

scala> map(x=>(x,1))
map括号中的就是一个匿名函数
   */


  // curring函数
  def sum(a:Int, b:Int)={
    a+b
  }
  println(sum(2,3))  // 5

  // 将原来接收两个参数的一个函数，转换成2个
  def sum2(a:Int)(b:Int)={
    a+b
  }

  println(sum2(2)(3)) // 5

}
