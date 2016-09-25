package com.example

import akka.actor.Actor
import akka.event.Logging

class MyActor extends Actor {
  val log = Logging(context.system.eventStream, classOf[MyActor])
  def receive = {
    case s: String => {
      log.info("logging... {}, {}", s, 123)
    }
    case _ => {
    }
  }
}
