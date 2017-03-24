package org.ruyin.code.scala.brief.tutorial

/**
  * Created by ruyin on 2017/3/25.
  *
  * trait有点类似于Java中的接口,具有某些特性
  *
  * Ord的定义与Java中Comparable接口的含义一样
  */
trait Ord {

  def < (obj:Any):Boolean
  def <= (obj:Any):Boolean = (this < obj) || (this == obj)
  def > (obj:Any):Boolean = !(this <= obj)
  def >= (obj:Any):Boolean = !(this < obj)
}
