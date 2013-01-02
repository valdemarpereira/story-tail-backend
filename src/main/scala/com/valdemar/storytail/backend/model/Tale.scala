package com.valdemar.storytail.backend.model

/**
 * Created with IntelliJ IDEA.
 * User: valdemar
 * Date: 1/2/13
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */
import com.novus.salat._
import com.novus.salat.annotations._
import org.scala_tools.time.Imports._
import com.mongodb.casbah.Imports._

case class Tale(@Key("_id") id: ObjectId = new ObjectId,
                title: String,
                createUser: User,
                lastUpdateUser: User,
                tails: List[Tail],
                maxDays: Int,
                maxInteractions: Int,
                travelDistance: Long,
                interactions: Long,
                language: String,
                lockedForEdit: Boolean,
                lockDate: Option[DateTime],
                location: Location,
                city: String,
                country: String,
                createDate: DateTime,
                updateDate: DateTime)