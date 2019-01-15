package uk.co.matthewmcgowan.demo1

import akka.actor.Actor

class GreetingActor1 extends Actor {
  override def receive: Receive = ???

  userInput()

  private def userInput(): Unit = {

    Console.println("Greet me.")

    val input = Console.readLine()

    // Complex processing
    Thread.sleep(5000)

    Console.println(input + " to you too.")

    userInput()
  }
}
