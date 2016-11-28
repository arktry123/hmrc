package com.hmrc.exercise

import org.scalatest.{BeforeAndAfter, FunSuite}

class CheckoutAppSpec extends FunSuite with BeforeAndAfter{

  var checkoutApp: CheckoutApp = _
  before{
    checkoutApp = new CheckoutApp
  }

  test("An empty list of Items should return £0.0"){
    assert(checkoutApp.checkout(Nil) == "£0.0")
  }

}
