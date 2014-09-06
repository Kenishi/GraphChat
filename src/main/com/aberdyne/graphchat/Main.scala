package com.aberdyne.graphchat


object Main extends App {
  val CLIENT_PORT = 13719
  
  implicit val system = ActorSystem()
  
  val client_handler = system.actorOf(Props[ClientHttpHandler], name="client")
  
}