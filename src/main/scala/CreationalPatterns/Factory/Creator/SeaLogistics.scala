package CreationalPatterns.Factory.Creator

import CreationalPatterns.Factory.Product._

class SeaLogistics extends Logistics {
  override def createTransport(vehicle: String): Transport = new Ship()
}
