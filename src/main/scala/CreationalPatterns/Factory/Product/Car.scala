package CreationalPatterns.Factory.Product

class Car extends Transport {
  override def deliver(): Unit = {
    System.err.println("It is a Car")
  }
}