package com.hmrc.exercise

import org.scalatest.{BeforeAndAfter, FunSuite}

class CheckoutAppWithOffersSpec extends FunSuite with BeforeAndAfter{
  var application: CheckoutAppWithOffers = _
  before{
    application = new CheckoutAppWithOffers
  }

  test("An Empty List of items should return £0.0"){
    assert(application.checkout(Nil) == "£0.0")
  }

  test ("Only Apples case") {
    assert (application.checkout(List("Apple", "Apple", "Apple", "Apple")) == "£1.2")
  }

  test ("Only Oranges case") {
    assert (application.checkout(List("Orange", "Orange")) == "£0.5")
  }

  test ("Three Oranges case") {
    assert (application.checkout(List("Orange", "Orange", "Orange")) == "£0.5")
  }

}
