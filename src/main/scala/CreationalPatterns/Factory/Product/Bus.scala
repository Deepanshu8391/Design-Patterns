package CreationalPatterns.Factory.Product

class Bus extends Transport {
  override def deliver(): Unit = {
    System.err.println("It is a Bus")
  }
}