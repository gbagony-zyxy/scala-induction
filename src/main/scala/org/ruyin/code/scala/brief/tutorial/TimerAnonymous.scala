package org.ruyin.code.scala.brief.tutorial

/**
  * Created by ruyin on 2017/3/24.
  *
  * scala的匿名函数
  * scala声明为object即为单例
  *
  */
object TimerAnonymous {

  def oncePerSecond(callback:() => Unit): Unit ={
    while(true){
      callback();
      Thread sleep 1000;
    }
  }

  /**
    * () => 的含义:将一个函数的参数列表和方法体分隔开
    * */
  def main(args: Array[String]): Unit = {
    oncePerSecond(() =>
      println("time flies like an arrow...")
    )
  }
}
