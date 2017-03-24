package org.ruyin.code.scala.brief.tutorial

/**
  * Created by ruyin on 2017/3/25.
  */
class Date(y:Int,m:Int,d:Int) extends Ord{
  def year = y
  def month = m
  def day =d

  override def toString: String = year + "-" + month + "-" + day

  override def equals(obj: scala.Any): Boolean =
    obj.isInstanceOf[Date] && {
      val o = obj.asInstanceOf[Date]
      o.day == day && o.month == month && o.year == year
    }

  override def < (obj: Any): Boolean = {
      if(!obj.isInstanceOf[Date])
        throw new RuntimeException

      val o = obj.asInstanceOf[Date]
      (o.year > year) || (o.year == year && (o.month > month ||
        (o.month == month && o.day > day)))
  }
}

object CompareDate{
  def main(args: Array[String]): Unit = {
    def d1 = new Date(2017,12,12)
    def d2 = new Date(2017,11,11)
    println(d1 <= d2)
    println(d1.==(d2))
  }
}
