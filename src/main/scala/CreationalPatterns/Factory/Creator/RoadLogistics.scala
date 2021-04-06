package CreationalPatterns.Factory.Creator

import CreationalPatterns.Factory._
import CreationalPatterns.Factory.Product._

class RoadLogistics extends Logistics {
  override def createTransport(vehicle: String): Transport = {
    vehicle match {
      case Bus => new Bus()
      case Car => new Car()
      case Truck => new Truck()
      case _ =>
        System.err.println("Invalid vehicle name using Truck by default")
        new Truck()
    }
  }
}
