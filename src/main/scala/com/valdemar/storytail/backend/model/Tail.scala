package com.valdemar.storytail.backend.model

/**
 * Created with IntelliJ IDEA.
 * User: valdemar
 * Date: 1/2/13
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */

import com.mongodb.casbah.Imports._
import com.novus.salat.annotations._
import org.scala_tools.time.Imports._

case class Tail(@Key("_id") id: ObjectId = new ObjectId,
                story:String,
                loc: Location,
                user: User,
                city: String,
                country: String,
                createDate: DateTime)