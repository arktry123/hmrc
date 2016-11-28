package com.hmrc.exercise

import scala.collection.immutable.HashMap

class CheckoutApp extends Application{
  val prices = HashMap("Apple" -> 60, "Orange" -> 25)
  def checkout(lisOfItems: List[String]):String = {
    val (apples, oranges) = lisOfItems.partition(item => item.equals("Apple"))
    "£" + (apples.length * prices("Apple") + oranges.length * prices("Orange"))/100.toDouble
  }
}
