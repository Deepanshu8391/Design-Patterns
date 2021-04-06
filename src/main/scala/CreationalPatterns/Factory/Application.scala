package CreationalPatterns.Factory

import CreationalPatterns.Factory.Creator._
import scala.util.Random

object Application extends App {
  val randomNumber = Random.nextInt(3)
  randomNumber match {
    case 0 =>
      val roadLogistics = new RoadLogistics
      val randomNumber = Random.nextInt(3)
      randomNumber match {
        case 0 => roadLogistics.planDelivery("bus")
        case 1 => roadLogistics.planDelivery("truck")
        case 2 => roadLogistics.planDelivery("car")
        case _ => System.err.println("Invalid road vehicle name")
      }
    case 1 =>
      val seaLogistics = new SeaLogistics()
      seaLogistics.planDelivery("ship")
    case 2 =>
      val airLogistics = new AirLogistics()
      airLogistics.planDelivery("plane")
    case _ => System.err.println("Invalid Logistics request")
  }
}