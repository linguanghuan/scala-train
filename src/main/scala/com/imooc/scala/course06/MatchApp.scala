package com.imooc.scala.course06

import scala.util.Random

object MatchApp extends App{

  val names = Array("111", "222", "333")
  val name = names(Random.nextInt(names.length))
  name match {
    case "111" => println("aaa")
    case "222" => println("bbb")
    case "333" => println("ccc")
    case _ => println("unknow")
  }

  def judgeGrade(grade:String) = {
    grade match {
      case "A" => println("excellent")
      case "B" => println("good")
      case "C" => println("just so so")
      case _ => println("need work harder")
    }
  }

  judgeGrade("A")  // excellent
  judgeGrade("B")  // good
  judgeGrade("C") // just so so
  judgeGrade("D")  // need work harder

  def judgeGrade(name:String, grade:String) = {
    grade match {
      case "A" => println("excellent")
      case "B" => println("good")
      case "C" => println("just so so")
      case _  if(name=="lisi") => println("lisi: need work harder")  // 双重过滤
      case _ => println("need work harder")
    }
  }

  judgeGrade("zhangsan", "D") // need work harder
  judgeGrade("lisi", "A")  // excellent
  judgeGrade("lisi", "D")  // lisi: need work harder

  def greeting(array:Array[String]) = {
    array match {
      case Array("zhangsan") => println("Hi: zhangsan")  // 数组里面只有zhangsan一个人
      case Array(x,y) => println("Hi: " + x  +"," + y)  // 数组里面有任意两个人
      case Array("zhangsan", _*) => println("Hi: zhangsan and other friends") // zhangsan开头的后面任意个的
      case _ => println("Hi: everybody")
    }
  }
  println("---------Array模式匹配------------")
  greeting(Array("zhangsan"))  // Hi: zhangsan
  greeting(Array("lisi", "wangwu"))  // Hi: lisi,wangwu
  greeting(Array("zhangsan", "lisi"))  // Hi: zhangsan,lisi
  greeting(Array("zhangsan", "lisi", "wangwu")) // Hi: zhangsan and other friends
  greeting(Array("lisi", "zhangsan", "wangwu"))  // Hi: everybody


  println("-------------List模式匹配--------------")
  def greeting(list:List[String]) = {
    list match {
      case "zhangsan"::Nil => println("Hi: zhangsan")  // list里面只有zhangsan
      case x::y::Nil => println("Hi: " + x + "," + y)  // 2个元素
      case "zhangsan"::tail => println("Hi: zhangsan and other friends") // zhangsan开头的 有其他元素
      case _ => println("Hi: everybody")
    }
  }

  greeting(List("zhangsan"))  // Hi: zhangsan
  greeting(List("zhangsan", "lisi")) // Hi: zhangsan,lisi
  greeting(List("pk", "zhangsan", "lisi"))  // Hi: everybody

  println("-------------类型----------------")
  def matchType(obj:Any) = {
    obj match {
      case x:Int => println("Int")
      case s:String =>println("String")
      case m:Map[_,_] => m.foreach(println)
      case _=> println("other type")
    }
  }

  matchType(1)  // Int
  matchType("1") // String
  matchType(1f)  // other type
  matchType(Map("name"->"pk", "age"->20))  // (name,pk)\n(age,20)

  println("---------case class--------------")
  class Person
  case class CTO(name:String, floor:String) extends Person
  case class Employee(name:String, floor:String) extends Person
  case class Other(name:String) extends Person

  def caseclassMatch(person:Person)={
    person match {
      case CTO(name,floor) => println("CTO name is:" + name + ", floor is:" + floor)
      case Employee(name,floor) => println("Employee name is:" + name + ", floor is:" + floor)
      case _ => println("other")
    }
  }

  caseclassMatch(CTO("PK", "22")) // CTO name is:PK, floor is:22
  caseclassMatch(Employee("zhangsan", "2")) // Employee name is:zhangsan, floor is:2
  caseclassMatch(Other("Other")) // other

}
