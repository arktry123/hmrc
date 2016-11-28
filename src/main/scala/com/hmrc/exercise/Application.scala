package com.hmrc.exercise

trait Application {
  //returns the cost of the cart in String format prepeding "£"
  def checkout(listOfItems: List[String]): String
}
