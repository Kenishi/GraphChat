package com.aberdyne.graphchat

import java.util.Date

abstract class Event(protocol: Protocol, time: Date, id: Long, eventType: String) {

	def data: String
}