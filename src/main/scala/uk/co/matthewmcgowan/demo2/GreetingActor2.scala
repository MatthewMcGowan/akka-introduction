package uk.co.matthewmcgowan.demo2

import akka.actor.{Actor, Props}
import uk.co.matthewmcgowan.model.Greeting

class GreetingActor2 extends Actor {
  val userInputActor = context.actorOf(Props(new UserInputActor2))
  val greetingProcessorActor = context.actorOf(Props(new GreetingProcessorActor2))

  override def receive: Receive = {
    case msg: Greeting => greetingProcessorActor ! msg
  }
}
