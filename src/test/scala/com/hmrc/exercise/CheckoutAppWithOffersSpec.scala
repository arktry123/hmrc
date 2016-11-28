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
}
