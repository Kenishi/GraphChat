package com.aberdyne.graphchat

import akka.actor._
import spray.can.Http

class ClientHttpHandler extends Actor with ActorLogging {
  import context.dispatcher
  
  def receive = {
	  case _: Http.Connected => sender ! Http.Register(self)
	   
  }
}