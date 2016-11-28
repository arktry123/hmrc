package com.hmrc.exercise

import scala.collection.immutable.HashMap

trait Application {
  //returns the cost of the cart in String format prepeding "£"
  def checkout(listOfItems: List[String]): String
  val prices = HashMap("Apple" -> 60, "Orange" -> 25)
}
