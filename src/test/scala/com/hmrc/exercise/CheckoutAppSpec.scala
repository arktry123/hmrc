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

  test("One Apple should return £0.6"){
    assert(checkoutApp.checkout(List("Apple")) == "£0.6")
  }

  test("One Orange should return 0.25"){
    assert(checkoutApp.checkout(List("Orange")) == "£0.25")
  }

  test("One Apple and One Orange should return 0.85"){
    assert(checkoutApp.checkout(List("Apple", "Orange")) == "£0.85")
  }

  test("One Orange and One Apple should return 0.85"){
    assert(checkoutApp.checkout(List("Orange", "Apple")) == "£0.85")
  }

}
