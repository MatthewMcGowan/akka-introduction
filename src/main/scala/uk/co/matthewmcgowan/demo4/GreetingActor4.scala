package uk.co.matthewmcgowan.demo4

import akka.actor.{Actor, Props}
import akka.routing.RoundRobinPool
import uk.co.matthewmcgowan.model.Greeting

class GreetingActor4 extends Actor {
  val userInputActor = context.actorOf(Props(new UserInputActor4))

  override def receive: Receive = {
    case msg: Greeting => handleGreeting(msg)
  }

  private def handleGreeting(msg: Greeting) = {
    val processingActor = context.actorOf(Props(new GreetingProcessorActor4))
    processingActor ! msg
  }
}
