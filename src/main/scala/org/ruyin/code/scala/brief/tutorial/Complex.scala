package org.ruyin.code.scala.brief.tutorial

/**
  * Created by ruyin on 2017/3/24.
  *
  * scala的class允许存在参数
  *
  * scala将方法作为返回值
  *
  * scala未显式继承超类,则AnyRef将被使用
  */
class Complex(real:Double,imaginary:Double) {

  //定义的两个方法都没有指定返回值,编译器默认指定了返回值类型与赋值号右边类型相同
  //初学者可以省略明确类型,熟悉了之后可以明确类型
  //def re() = real;

  //def im() = imaginary;

  //可以简写为下列形式
  def re = real;
  def im = imaginary;

  override def toString: String =
    "" + re + (if(im < 0) "" else "+") + im + "i"
}

/**
  * 无参的方法,无参的方法和拥有0个参数的方法含义不同,效果相同
  * */
object ComplexNumbers{
  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2,3.4)
    //println("imaginary part:" + c.im())
    println("imaginary part:" + c.im)
  }
}
