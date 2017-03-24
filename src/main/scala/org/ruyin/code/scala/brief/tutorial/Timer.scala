package org.ruyin.code.scala.brief.tutorial

/**
  * Created by ruyin on 2017/3/24.
  *
  * scala不需要分号结尾
  *
  */
object Timer {

  def oncePerSecond(callback: () => Unit): Unit ={
    while (true){
      callback()
      Thread sleep 1000
    }
  }

  //scala中方法也是一个对象,对象就可为参数,完全OO
  def timeFlies(): Unit ={
    println("time flies like an arrow...")
  }

  def main(args: Array[String]): Unit = {
    //oncePerSecond(() => timeFlies());
    oncePerSecond(timeFlies);
  }
}
