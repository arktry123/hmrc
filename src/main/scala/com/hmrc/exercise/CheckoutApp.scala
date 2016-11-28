package com.hmrc.exercise

class CheckoutApp extends Application{
  def checkout(lisOfItems: List[String]):String = {
    val (apples, oranges) = lisOfItems.partition(item => item.equals("Apple"))
    "£" + (apples.length * prices("Apple") + oranges.length * prices("Orange"))/100.toDouble
  }
}
