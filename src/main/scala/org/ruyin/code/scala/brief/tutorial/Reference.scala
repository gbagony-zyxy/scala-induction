package org.ruyin.code.scala.brief.tutorial

/**
  * Created by ruyin on 2017/3/25.
  *
  * Genericity
  * scala支持泛型
  *
  * scala定义方法def,定义类变量var,定义实例的引用val
  */
class Reference[T] {

  //a reference which can either be empty or point to an object of some type
  //the initial value given to variable is _,which represents a defaut value
  /**
    * default value:the default value for numeric type is 0
    *               the default value for Boolean type is false
    *               the default value for Unit type is ()
    *               the default value for object type is null
    * */
  private var contents:T = _

  def set(value:T){contents = value}

  def get:T = contents
}

object IntegerReference{
  def main(args: Array[String]): Unit = {
    val reference = new Reference[Int]
    reference.set(1024)
    println("Reference contains the half of " + (reference.get * 2))
  }
}
