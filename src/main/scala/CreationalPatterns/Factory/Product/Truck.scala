package CreationalPatterns.Factory.Product

class Truck extends Transport {
  override def deliver(): Unit = {
    System.err.println("It is a Truck")
  }
}
