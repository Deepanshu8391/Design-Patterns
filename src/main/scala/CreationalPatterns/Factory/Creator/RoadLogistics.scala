package CreationalPatterns.Factory.Creator

import CreationalPatterns.Factory.Product._

class RoadLogistics extends Logistics {
  val Bus = "bus"
  val Car = "car"
  val Truck = "truck"
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
