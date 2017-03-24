package org.ruyin.code.scala.brief.tutorial

/**
  * Created by ruyin on 2017/3/25.
  *
  * scala提供的Case classes以及模式匹配(pattern matching)
  */
abstract class Tree
//左右子树计算结果
case class Sum(l:Tree,r:Tree) extends Tree
//变量
case class Var(n:String) extends Tree
//常量
case class Const(v:Int) extends Tree

/**
  * Note:
  *   1、the new keyword is not mandatory to create instances of theses classes(ie.
  *       one can write Const(5) instead of new Const(5))
  *
  *   2、getter functions are automatically for the constructor parameters
  *
  *   3、default definitions for methods equals and hashCode are provided,which work
  *       on the structure of the instances and not on their identity
  *
  *   4、a default definition for method toString is provided,and prints the value in
  *       a "source form"(e.g.the tree for expression x+1 prints as Sum(Var(x),Const(1)))
  *
  *   5、instances of these classes can be decomposed through pattern matching
  * */
//type Environment = String => Int