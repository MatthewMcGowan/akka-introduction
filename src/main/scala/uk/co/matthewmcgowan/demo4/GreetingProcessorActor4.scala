package uk.co.matthewmcgowan.demo4

import akka.actor.Actor
import uk.co.matthewmcgowan.model.Greeting

class GreetingProcessorActor4 extends Actor {

  override def receive(): Receive = {
    case msg: Greeting => processGreeting(msg)
  }

  def processGreeting(msg: Greeting): Unit = {
    // Complex processing
    Thread.sleep(5000)

    Console.println(msg.value + " to you too from " + context.self.path)

    context.stop(self)
  }
}
