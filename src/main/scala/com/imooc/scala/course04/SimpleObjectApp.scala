package com.imooc.scala.course04

object SimpleObjectApp {
  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "meixi"
//    person.age = 40  不能给age常量赋值
    println(person.name + ","+ person.age)
    println(person.eat())
    person.watchFootBall("Barceln")
    person.printInfo()
//    println(person.gender)  编译不通过 private [this] 只能在class内部用 出了类就访问不到
  }
}

class People{
//  var name:String = ""  // 变量 get set
  var name:String=_  // 占位符 var才能用占位符， val不能用，用占位符需要加上类型定义，否则可以去掉类型，可以自动推导
  val age:Int = 10   // 常量只有get

  private [this] val gender = "mail"


  def printInfo()={
    println(gender)
  }

  def eat():String = {
    name + " eat..."
  }

  def watchFootBall(teamName:String):Unit = {
    println(name + " is watching match of " + teamName)
  }

}