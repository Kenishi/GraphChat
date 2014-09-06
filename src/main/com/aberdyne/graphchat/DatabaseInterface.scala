package com.aberdyne.graphchat
import scala.concurrent.Future

trait DatabaseInterface {
	def execute(cypher: String, promise: Future[String])
}