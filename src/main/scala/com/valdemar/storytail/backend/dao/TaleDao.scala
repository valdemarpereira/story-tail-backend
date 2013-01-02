package com.valdemar.storytail.backend.dao

import com.novus.salat.dao.SalatDAO
import com.valdemar.storytail.backend.model.Tale
import com.mongodb.casbah.Imports._
import com.mongodb.casbah.MongoConnection
import com.novus.salat.global._

/**
 * Created with IntelliJ IDEA.
 * User: valdemar
 * Date: 1/2/13
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */

object TaleDao extends SalatDAO[Tale, ObjectId](collection = MongoConnection()("storytail_db")("storytail"))
