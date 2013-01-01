package com.valdemar.storytail.backend

import akka.util.Duration
import spray.routing.SimpleRoutingApp
import spray.http.MediaTypes._


object Storytailbackend extends App with SimpleRoutingApp {
  def route = get {
    path("hello") {
      respondWithMediaType(`text/html`) {
        complete {
          <html>
            <h1>Say hello to <em>spray</em> on <em>spray-can</em>!</h1>
            <p>(<a href="/stop?method=post">stop server</a>)</p>
          </html>
        }
      }
    }
  }

    startServer(interface = "localhost", port = 8080)(route)
}
