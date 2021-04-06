package CreationalPatterns.Factory.Creator

import CreationalPatterns.Factory.Product.Transport

abstract class Logistics {
  def createTransport(vehicle: String): Transport

  def planDelivery(vehicle: String): Unit = {
    val transport: Transport = createTransport(vehicle)
    transport.deliver()
  }
}
