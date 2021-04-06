package CreationalPatterns.Factory.Product

class Plane extends Transport {
  override def deliver(): Unit = {
    System.err.println("It is a Plane")
  }
}
