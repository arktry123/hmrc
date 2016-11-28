package com.hmrc.exercise

class CheckoutApp {
  def checkout(lisOfItems: List[String]):String = {
    val (apples, oranges) = lisOfItems.partition(item => item.equals("Apple"))
    "£" + (apples.length * 60 + oranges.length * 25)/100.toDouble
  }
}
