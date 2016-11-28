package com.hmrc.exercise

/**
  * Created by Ramakrishna Allam on 28/11/2016.
  */
trait Application {

  def checkout(listOfItems: List[String]): String
}
