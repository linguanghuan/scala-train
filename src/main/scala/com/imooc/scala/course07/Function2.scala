package com.imooc.scala.course07

/**
  * 高阶函数
  */
object Function2 extends App {
  val l = List(1, 2, 3, 4, 5, 6, 7, 8)
  // map: 逐个取操作集合中的每个元素
  l.map((x: Int) => x + 1) // 全称
  l.map((x) => x * 2) // 简称 类型可以推导
  l.map(x => x * 2) // 简称 括号只有一个元素 括号可以省略 否则不行
  l.map(_ * 2)
  /*
  scala>  l.map((x:Int)=>x+1)
res6: List[Int] = List(2, 3, 4, 5, 6, 7, 8, 9)
scala> l.map(x=>x*2)
res7: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16)
scala> l.map(_ * 2)
res8: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16)
类似于y=f(x)
   */
  l.map(_ * 2).foreach(println)

  // 取大于8的
  l.map(_ * 2).filter(_ > 8).foreach(println)


  /* 取前几个元素
  scala> l.take(4)
  res9: List[Int] = List(1, 2, 3, 4)

  scala> l.take(2)
  res10: List[Int] = List(1, 2)
  */

  println("------------reduce-------------------")
  // 1+2=3 3+3=6 6+4=10 10+5=15 .....
  l.reduce(_ + _) // 36 两两相邻的元素加起来

  l.reduceLeft(_ - _)  // -34  为什么
  l.reduceRight(_ - _)  // -4  为什么

  l.fold(0)(_ - _)
//  l.foldLeft()
  /*
  scala> l.max
  res14: Int = 8

  scala> l.min
  res15: Int = 1

  scala> l.sum
  res16: Int = 36
  */

  val f = List(List(1,2), List(3,4), List(5,6))
  f.flatten  // 压扁
  /*
  scala> val f = List(List(1,2), List(3,4), List(5,6))
  f: List[List[Int]] = List(List(1, 2), List(3, 4), List(5, 6))

  scala> f.flatten
  res17: List[Int] = List(1, 2, 3, 4, 5, 6)
  */

  f.map(_.map(_*2))
  /*
  scala> f.map(_.map(_*2))
  res18: List[List[Int]] = List(List(2, 4), List(6, 8), List(10, 12))

  scala> f.flatMap(_.map(_*2))  // flatMap可以看成 flatten 后再map
  res19: List[Int] = List(2, 4, 6, 8, 10, 12)
  */

  println("--------------------")
  val txt = scala.io.Source.fromFile("hello.txt").mkString
  println(txt)
  val txts = List(txt)
  txts.flatMap(_.split(",")).foreach(println)
  /*
hello
world
hello
hello
   */
  txts.flatMap(_.split(",")).map(x=>(x,1)).foreach(println)
  /*
(hello,1)
(world,1)
(hello,1)
(hello,1)
   */
// wordcount统计如何做?


}
