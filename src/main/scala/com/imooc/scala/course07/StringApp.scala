package com.imooc.scala.course07

object StringApp extends App {
  val s = "Hello: "
  val name = "PK"
  println(s + name)  // 比较low的拼接

  println(s"Hello:$name") // 插值

  val team = "AC Milan"
  println(s"Hello:$name, Welcom to $team")

  // 多行
  val multiLine =
  // 3次双引号  |代表开始位置 如果没有的话 则会把前面的空格也打印
    """
      这是一个多行字符串
      |hello
      |world
      |pk
    """.stripMargin
  println(multiLine)

}
