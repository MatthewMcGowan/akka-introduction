package uk.co.matthewmcgowan

import scala.concurrent.{duration, Await, ExecutionContextExecutor, Future}
import scala.concurrent.duration._

import akka.actor.{ActorContext, ActorRef, ActorSystem, Props, Terminated}
import akka.util.Timeout
import uk.co.matthewmcgowan.demo1.GreetingActor1
import uk.co.matthewmcgowan.demo2.GreetingActor2
import uk.co.matthewmcgowan.demo3.GreetingActor3
import uk.co.matthewmcgowan.demo4.GreetingActor4

object app extends App {
  implicit private val system: ActorSystem = ActorSystem()
  implicit private val executionContext: ExecutionContextExecutor = system.dispatcher
  implicit private val timeout: Timeout = 10 seconds

  /* DEMO 1 */
  val greetingActor = system.actorOf(Props(new GreetingActor1))

  /* DEMO 2 */
//  val greetingActor = system.actorOf(Props(new GreetingActor2))

  /* DEMO 3 */
//  val greetingActor = system.actorOf(Props(new GreetingActor3))

  /* DEMO 4 */
//  val greetingActor = system.actorOf(Props(new GreetingActor4))
}
