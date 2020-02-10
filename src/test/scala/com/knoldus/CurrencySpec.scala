package com.knoldus

import org.scalatest._

class CurrencySpec extends FlatSpec with BeforeAndAfterAll {

  var currency: Currency = new Currency

  override def beforeAll(): Unit = {
    currency = new Currency()
  }

  override def afterAll(): Unit = {
    if (currency != null) {
      currency = null
    }

  }

  "dollar method" should "give equivalent in euro" in {
    val actualResult = currency.dollar("euro", 10)
    val expectedResult = 9.10
    assert(expectedResult == actualResult)
  }
  "dollar method" should "give equivalent in pound" in {
    val actualResult = currency.dollar("pound", 10)
    val expectedResult = 7.800000000000001
    assert(expectedResult == actualResult)
  }
  "dollar method" should "give equivalent in yen" in {
    val actualResult = currency.dollar("yen", 10)
    val expectedResult = 1097.3
    assert(expectedResult == actualResult)
  }
  "dollar method" should "give equivalent in yuan" in {
    val actualResult = currency.dollar("yuan", 10)
    val expectedResult = 70.0
    assert(expectedResult == actualResult)
  }
  "dollar method" should "give equivalent in taka" in {
    val actualResult = currency.dollar("taka", 10)
    val expectedResult = 848.7
    assert(expectedResult == actualResult)
  }
  "dollar method" should "give equivalent in canadian dollar" in {
    val actualResult = currency.dollar("canadian dollar", 10)
    val expectedResult = 13.3
    assert(expectedResult == actualResult)
  }
  "dollar method" should "give equivalent in peso" in {
    val actualResult = currency.dollar(converto = "peso", 10)
    val expectedResult = 509.5
    assert(expectedResult == actualResult)
  }
  "dollar method" should "give equivalent in INR" in {
    val actualResult = currency.dollar(converto = "INR", 10)
    val expectedResult = 715.1999999999999
    assert(expectedResult == actualResult)
  }
  "dollar method" should "give dollar equivalent of currencies" in {
    try {
      val actualResult = currency.dollar(_, 10)
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid")
      }
    }
  }

  "euro method" should "give euro equivalent of dollar" in {
    val actualResult = currency.euro("dollar", 10)
    val expectedResult = 9.1
    assert(expectedResult == actualResult)
  }
  "euro method" should "give euro equivalent of pound" in {
    val actualResult = currency.euro("pound", 10)
    val expectedResult = 7.800000000000001
    assert(expectedResult == actualResult)
  }
  "euro method" should "give euro equivalent of yen" in {
    val actualResult = currency.euro("yen", 10)
    val expectedResult = 1097.3
    assert(expectedResult == actualResult)
  }
  "euro method" should "give euro equivalent of yuan" in {
    val actualResult = currency.euro("yuan", 10)
    val expectedResult = 70.0
    assert(expectedResult == actualResult)
  }
  "euro method" should "give euro equivalent of taka" in {
    val actualResult = currency.euro("taka", 10)
    val expectedResult = 848.7
    assert(expectedResult == actualResult)
  }
  "euro method" should "give euro equivalent of canadian dollar" in {
    val actualResult = currency.euro("canadian dollar", 10)
    val expectedResult = 13.3
    assert(expectedResult == actualResult)
  }
  "euro method" should "give euro equivalent of peso" in {
    val actualResult = currency.euro("peso", 10)
    val expectedResult = 509.5
    assert(expectedResult == actualResult)
  }
  "euro method" should "give euro equivalent of INR" in {
    val actualResult = currency.euro("INR", 10)
    val expectedResult = 715.1999999999999
    assert(expectedResult == actualResult)
  }
  "euro method" should "give euro equivalent of currencies" in {
    try {
      val actualResult = currency.euro(_, 10)
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid")
      }
    }
  }
  "inr method" should "give equivalent of dollar" in {
    val actualResult = currency.inr("dollar", 10)
    val expectedResult = 0.14
    assert(expectedResult == actualResult)
  }
  "inr method" should "give equivalent of euro" in {
    val actualResult = currency.inr("euro", 10)
    val expectedResult = 0.13
    assert(expectedResult == actualResult)
  }
  "inr method" should "give equivalent of yen" in {
    val actualResult = currency.inr("yen", 10)
    val expectedResult = 15.3
    assert(expectedResult == actualResult)
  }
  "inr method" should "give equivalent of yuan" in {
    val actualResult = currency.inr("yuan", 10)
    val expectedResult = 0.98
    assert(expectedResult == actualResult)
  }
  "inr method" should "give equivalent of taka" in {
    val actualResult = currency.inr("taka", 10)
    val expectedResult = 11.899999999999999
    assert(expectedResult == actualResult)
  }
  "inr method" should "give equivalent of canadian dollar" in {
    val actualResult = currency.inr("canadian dollar", 10)
    val expectedResult = 0.19
    assert(expectedResult == actualResult)
  }
  "inr method" should "give equivalent of peso" in {
    val actualResult = currency.inr("peso", 10)
    val expectedResult = 2.6
    assert(expectedResult == actualResult)
  }
  "inr method" should "give equivalent of krone" in {
    val actualResult = currency.inr("krone", 10)
    val expectedResult = 1.3
    assert(expectedResult == actualResult)
  }
  "inr method" should "give inr equivalent of currencies" in {
    try {
      val actualResult = currency.inr(_, 10)
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid")
      }
    }
  }
  "yen method" should "give equivalent of dollar" in {
    val actualResult = currency.yen("dollar", 10)
    val expectedResult = 0.091
    assert(expectedResult == actualResult)
  }
  "yen method" should "give equivalent of euro" in {
    val actualResult = currency.yen("euro", 10)
    val expectedResult = 0.083
    assert(expectedResult == actualResult)
  }
  "yen method" should "give equivalent of inr" in {
    val actualResult = currency.yen("inr", 10)
    val expectedResult = 0.13
    assert(expectedResult == actualResult)
  }
  "yen method" should "give equivalent of yuan" in {
    val actualResult = currency.yen("yuan", 10)
    val expectedResult = 1.3
    assert(expectedResult == actualResult)
  }
  "yen method" should "give equivalent of taka" in {
    val actualResult = currency.yen("taka", 10)
    val expectedResult = 0.10999999999999999
    assert(expectedResult == actualResult)
  }
  "yen method" should "give equivalent of canadian dollar" in {
    val actualResult = currency.yen("canadian dollar", 10)
    val expectedResult = 6.8999999999999995
    assert(expectedResult == actualResult)
  }
  "yen method" should "give equivalent of peso" in {
    val actualResult = currency.yen("peso", 10)
    val expectedResult = 0.18
    assert(expectedResult == actualResult)
  }
  "yen method" should "give equivalent of krone" in {
    val actualResult = currency.yen("krone", 10)
    val expectedResult = 0.99
    assert(expectedResult == actualResult)
  }
  "yen method" should "give yen equivalent of currencies" in {
    try {
      val actualResult = currency.yen(_, 10)
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid")
      }
    }
  }
  "pound method" should "give equivalent of dollar" in {
    val actualResult = currency.pound("dollar", 10)
    val expectedResult = 922.0
    assert(expectedResult == actualResult)
  }
  "pound method" should "give equivalent of euro" in {
    val actualResult = currency.pound("euro", 10)
    val expectedResult = 11.799999999999999
    assert(expectedResult == actualResult)
  }
  "pound method" should "give equivalent of yen" in {
    val actualResult = currency.pound("yen", 10)
    val expectedResult = 1414.7
    assert(expectedResult == actualResult)
  }

  "pound method" should "give equivalent of yuan" in {
    val actualResult = currency.pound("yuan", 10)
    val expectedResult = 90.19999999999999
    assert(expectedResult == actualResult)
  }
  "pound method" should "give equivalent of taka" in {
    val actualResult = currency.pound("taka", 10)
    val expectedResult = 1094.1
    assert(expectedResult == actualResult)
  }
  "pound method" should "give equivalent of canadian dollar" in {
    val actualResult = currency.pound("canadian dollar", 10)
    val expectedResult = 17.2
    assert(expectedResult == actualResult)
  }
  "pound method" should "give equivalent of peso" in {
    val actualResult = currency.pound("peso", 10)
    val expectedResult = 241.9
    assert(expectedResult == actualResult)
  }
  "pound method" should "give equivalent of INR" in {
    val actualResult = currency.pound("INR", 10)
    val expectedResult = 922.0
    assert(expectedResult == actualResult)
  }
  "pound method" should "give pound equivalent of currencies" in {
    try {
      val actualResult = currency.pound(_, 10)
    }
    catch {
      case ex: Exception => {
        assert(ex.getMessage == "invalid")
      }
    }
  }
}


