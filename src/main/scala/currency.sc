def dollar(converto: String, amount: Double): AnyVal = {
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

def euro(converto: String, euro: Double): AnyVal = {
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
dollar("taka",100)