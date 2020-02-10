package com.knoldus

/**
 * class currency converts one currency to another
 */
class Currency {
  /**
   * methods changes currency dollar to different currencies
   * @param converto takes currency name in which conversion should take place
   * @param amount takes the amount
   * @return converted value
   */
  def dollar(converto: String, amount: Double): Double = {
    converto match {
      case "euro" => amount * 0.91
      case "pound" => amount * 0.78
      case "yen" => amount * 109.73
      case "yuan" => amount * 7.00
      case "taka" => amount * 84.87
      case "canadian dollar" => amount * 1.33
      case "peso" => amount * 50.95
      case "INR" => amount * 71.52
    }
  }

  /**
   * methods changes currency euro to different currencies
   * @param converto takes currency name in which conversion should take place
   * @param euro takes the amount
   * @return converted value
   */
  def euro(converto: String, euro: Double): Double = {
    converto match {
      case "dollar" => euro * 0.91
      case "pound" => euro * 0.78
      case "yen" => euro * 109.73
      case "yuan" => euro * 7.00
      case "taka" => euro * 84.87
      case "canadian dollar" => euro * 1.33
      case "peso" => euro * 50.95
      case "INR" => euro * 71.52
    }
  }

  /**
   * methods changes pound euro to different currencies
   * @param converto takes currency name in which conversion should take place
   * @param pound takes the amount
   * @return converted value
   */
  def pound(converto: String, pound: Double): Double = {
    converto match {
      case "dollar" => pound * 92.20
      case "euro" => pound * 1.18
      case "yen" => pound * 141.47
      case "yuan" => pound * 9.02
      case "taka" => pound * 109.41
      case "canadian dollar" => pound * 1.72
      case "peso" => pound * 24.19
      case "INR" => pound * 92.20
    }

  }

  /**
   *methods changes pound to different currencies
   * @param converto takes currency name in which conversion should take place
   * @param INR amount
   * @return converted value
   */

  def inr(converto: String, INR: Double): Double = {
    converto match {
      case "dollar" => INR * 0.014
      case "euro" => INR * 0.013
      case "yen" => INR * 1.53
      case "yuan" => INR * 0.098
      case "taka" => INR * 1.19
      case "canadian dollar" => INR * 0.019
      case "peso" => INR * 0.26
      case "krone" => INR * 0.13
    }
  }

  /**
   * methods changes yen to different currencies
   * @param converto takes currency name in which conversion should take place
   * @param yen amount
   * @return converted value
   */
  def yen(converto: String, yen: Double): Double = {
    converto match {
      case "dollar" => 0.0091 * yen
      case "euro" => 0.0083 * yen
      case "inr" => 0.013 * yen
      case "yuan" => 0.13 * yen
      case "taka" => 0.011 * yen
      case "canadian dollar" => 0.69 * yen
      case "peso" => 0.018 * yen
      case "krone" => 0.099 * yen
    }
  }

}



