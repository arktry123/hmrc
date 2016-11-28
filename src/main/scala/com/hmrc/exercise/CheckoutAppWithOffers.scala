package com.hmrc.exercise

import scala.collection.immutable.HashMap

class CheckoutAppWithOffers extends Application {
  val offers = HashMap("Apple" ->(2, 1), "Orange" ->(3, 2))
  val prices = HashMap("Apple" -> 60, "Orange" -> 25)

  def checkout(listOfItems: List[String]): String = {
    val (apples, oranges) = listOfItems.partition(s => s.equals("Apple"))
    val (applesCount, orangesCount) = (apples.length, oranges.length)

    val (effectiveAppleCount, effectiveOrangeCount) = {
      val tApples = offers.getOrElse("Apple", (1, 1))
      val effectiveAppleCount = (applesCount / tApples._1) * tApples._2 + (applesCount % tApples._1)
      val tOranges = offers.getOrElse("Orange", (1, 1))
      val effectiveOrangeCount = (orangesCount / tOranges._1) * tOranges._2 + (orangesCount % tOranges._1)
      (effectiveAppleCount, effectiveOrangeCount)
    }
    "£" + (effectiveAppleCount * prices("Apple") + effectiveOrangeCount * prices("Orange")) / 100.toDouble
  }
}
