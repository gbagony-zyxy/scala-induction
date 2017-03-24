package org.ruyin.code.scala

/**
  * Created by ruyin on 2017/3/25.
  *
  * scala中的class,object以及trait代表的角色
  */
class User {

  private var name:String = _
  private var age:Int = _

  //定义普通方法的形式
  def startsWith(prefix: String): Boolean = name.startsWith(prefix)

  def setName(vaule:String){name = vaule}
  def setAge(value:Int){age = value}
  def getName:String = name
  def getAge:Int = age
}
