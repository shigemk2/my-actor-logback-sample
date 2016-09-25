package com.example

import akka.actor.{ActorSystem, Props}

object Hello {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("mySystem")
    val props = Props[MyActor]
    val actor = system.actorOf(props, name = "myActor")

    for(i <- 1 to 5) {
      actor ! "hi"
      Thread.sleep(1000)
    }
  }
}
