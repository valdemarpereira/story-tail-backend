package com.valdemar.storytail.backend.model

/**
 * Created with IntelliJ IDEA.
 * User: valdemar
 * Date: 1/2/13
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */


import com.mongodb.casbah.Imports._
import com.novus.salat.annotations._
import org.scala_tools.time.Imports._

case class User (@Key("_id") id: ObjectId = new ObjectId,
                  name: String,
                  email: String,
                  password: String,
                  birthday: Option[DateTime],
                  createDate: DateTime,
                  lastLogin: DateTime,
                  nrLogins: Long)
