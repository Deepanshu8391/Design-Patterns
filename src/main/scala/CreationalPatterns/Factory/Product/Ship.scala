package CreationalPatterns.Factory.Product

class Ship extends Transport {
  override def deliver(): Unit = {
    System.err.println("It is a Ship")
  }
}
