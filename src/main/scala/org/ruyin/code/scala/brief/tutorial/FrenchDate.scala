package org.ruyin.code.scala.brief.tutorial

import java.text.DateFormat._
import java.util.Locale

import org.ruyin.code.scala.brief.tutorial
/**
  * Created by ruyin on 2017/3/24.
  */
object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = new tutorial.Date
    val df = getDateInstance(LONG,Locale.FRANCE)
    println(df format now)
  }
}
