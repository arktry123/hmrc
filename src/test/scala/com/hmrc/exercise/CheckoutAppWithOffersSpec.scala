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

  test("Given Example in the Question") {
    assert(application.checkout(List("Apple", "Apple", "Orange", "Apple")) == "£1.45")
  }

  test ("Three Oranges cost the same as Two Oranges") {
    assert (application.checkout(List("Orange", "Orange", "Orange")) == application.checkout(List("Orange", "Orange")))
  }

  test ("Two Apples cost the same as One Apple") {
    assert (application.checkout(List("Apple", "Apple")) == application.checkout(List("Apple")))
  }

  test ("Four Apples cost the same as Three Apples") {
    assert (application.checkout(List("Apple", "Apple", "Apple","Apple")) == application.checkout(List("Apple", "Apple", "Apple")))
  }

}
