package com.valdemar.storytail.backend

import akka.util.Duration
import dao.UserDao
import spray.routing.SimpleRoutingApp
import spray.http.MediaTypes._
import com.valdemar.storytail.backend.model.User
import org.scala_tools.time.Imports._
import com.mongodb.casbah.commons.conversions.scala.{RegisterConversionHelpers, RegisterJodaTimeConversionHelpers}



   /*
trait HelloService extends Directives {
  val helloService = {
    path("hello") {
      get {
        complete {
          <h1>Say hello to Spray</h1>
        }
      }
    }
  }
}
         */
/*
object Storytailbackend extends App with SimpleRoutingApp {
  def route = get {
    path("hello") {
      respondWithMediaType(`text/html`) {
        complete {
          <html>
            <h1>Say hello to <em>spray</em> on <em>spray-can</em>!</h1>
          </html>
        }
      }
    }~
      pathPrefix("user" / Rest)  { username =>
  }
*/


object Storytailbackend extends App with SimpleRoutingApp {

  RegisterConversionHelpers()              // Problem: was missing ()
  RegisterJodaTimeConversionHelpers()      // Problem: was missing ()


  def route = pathPrefix("hello" / Rest) {  userName =>
    get {
      createUserName(userName)
      respondWithMediaType(`text/html`) {
        complete (userName + " Created!!")
      }
    }
  }

  def createUserName( userName: String)  {
    val userTosave =  User(name = userName, email = "aaa@bbb.pt", password = "########", birthday = Some(DateTime.now), createDate = DateTime.now, lastLogin = DateTime.now, nrLogins = 0)
    UserDao.insert(userTosave)
  }

  lazy val msg =
    <html>
      <h1>Say hello to <em>spray</em> on <em>spray-can</em>!</h1>
    </html>

    startServer(interface = "localhost", port = 8080)(route)
}




