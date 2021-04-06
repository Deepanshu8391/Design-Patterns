package CreationalPatterns.Factory.Creator

import CreationalPatterns.Factory.Product._

class AirLogistics extends Logistics {
  override def createTransport(vehicle: String): Transport = new Plane()
}
