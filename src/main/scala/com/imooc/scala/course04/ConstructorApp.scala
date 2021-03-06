package com.imooc.scala.course04

object ConstructorApp {
  def main(args: Array[String]): Unit = {
    /*
    val person = new Person("zhangsan", 30)
    println(person.name + ":" + person.age + ":" + person.school)
    val person2 = new Person("pk", 18,"M")
    println(person2.name + ":" + person2.age + ":" + person2.school + ":" + person2.gender)
    */
    val student = new Student("pk", 10, "math")
    println(student.name + ":" + student.age + ":" + student.major)

    println(student)


  }
}

// 主构造器
class Person(val name:String, val age:Int) {
  println("Person constructor enter....")

  var school = "ustc"

  var gender:String = _
  // 附属构造器
  def this(name:String , age:Int, gender:String) {
    this(name, age) // 附属构造器的第一行代码必须调用主构造器或者其他附属构造器
    this.gender = gender
  }

  println("person constructor leave...")

}

class Student(name:String, age:Int, var major:String) extends Person(name,age) {  // 父类没有的属性要加var否则访问不到
  println("Student enter...")

//  override var school = "jmu"   // 使用overrite 重写属性, 有问题
//  Error:(40, 16) overriding variable school in class Person of type String;
//  variable school cannot override a mutable variable
//  override var school = "jmu"   // 使用overrite 重写属性, 有问题

  override def toString: String = {   // 使用override关键字重写object的toString
    "name:" + name + ", age:" + age + ", school:" + school + ", major:" + major
  }

  println("Stuent leave...")
}
