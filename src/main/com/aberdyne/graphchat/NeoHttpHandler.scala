package com.aberdyne.graphchat

import scala.concurrent.Future

class NeoHttpHandler(url:String) extends DatabaseInterface {

  private object transport {
	  def post(content: String) = {
	  }
  }
  
  def execute(cypher: String, promise: Future[String]) = {
    
  }
}