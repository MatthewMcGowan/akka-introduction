package uk.co.matthewmcgowan.demo3

import akka.actor.{Actor, Props}
import akka.routing.RoundRobinPool
import uk.co.matthewmcgowan.model.Greeting

class GreetingActor3 extends Actor {
  val userInputActor = context.actorOf(Props(new UserInputActor3))
  val greetingProcessorActor = context.actorOf(RoundRobinPool(3).props(Props(new GreetingProcessorActor3)))

  override def receive: Receive = {
    case msg: Greeting => greetingProcessorActor ! msg
  }
}
