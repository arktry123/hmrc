package com.hmrc.exercise

import org.scalatest.{BeforeAndAfter, FunSuite}

class CheckoutAppSpec extends FunSuite with BeforeAndAfter{

  var application: CheckoutApp = _
  before{
    application = new CheckoutApp
  }

  test("An empty list of Items should return £0.0"){
    assert(application.checkout(Nil) == "£0.0")
  }

  test("One Apple should return £0.6"){
    assert(application.checkout(List("Apple")) == "£0.6")
  }

  test("One Orange should return 0.25"){
    assert(application.checkout(List("Orange")) == "£0.25")
  }

  test("One Apple and One Orange should return 0.85"){
    assert(application.checkout(List("Apple", "Orange")) == "£0.85")
  }

  test("One Orange and One Apple should return 0.85"){
    assert(application.checkout(List("Orange", "Apple")) == "£0.85")
  }

  test("Two Oranges and One Apple should return 1.1"){
    assert(application.checkout(List("Orange", "Apple", "Orange")) == "£1.1")
  }

  test("Two Apples and One Orange should return 1.45"){
    assert(application.checkout(List("Apple", "Apple", "Orange")) == "£1.45")
  }

  test("Given Example case - Three Apples and One Orange should return 2.05"){
    assert(application.checkout(List("Apple", "Apple", "Orange", "Apple")) == "£2.05")
  }

  test ("Huge number of Apples and Oranges") {
    var list: List[String] = Nil
    for(i <- 1 to 1000){
      list = "Apple" :: list
      list = "Orange" :: list
    }
    assert (application.checkout(list) == "£850.0")
  }
}
