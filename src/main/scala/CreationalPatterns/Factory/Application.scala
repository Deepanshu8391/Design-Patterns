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
        case 0 => roadLogistics.planDelivery(Bus)
        case 1 => roadLogistics.planDelivery(Truck)
        case 2 => roadLogistics.planDelivery(Car)
        case _ => System.err.println("Invalid road vehicle name")
      }
    case 1 =>
      val seaLogistics = new SeaLogistics()
      seaLogistics.planDelivery(Ship)
    case 2 =>
      val airLogistics = new AirLogistics()
      airLogistics.planDelivery(Plane)
    case _ => System.err.println("Invalid Logistics request")
  }
}
