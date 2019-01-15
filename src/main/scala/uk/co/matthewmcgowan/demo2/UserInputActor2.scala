package uk.co.matthewmcgowan.demo2

import akka.actor.Actor
import uk.co.matthewmcgowan.model.Greeting

class UserInputActor2 extends Actor {
  override def receive(): Receive = ???

  userInput()

  private def userInput(): Unit = {

    Console.println("Greet me.")
    val input = Console.readLine()

    context.parent ! Greeting(input)

    userInput()
  }
}
