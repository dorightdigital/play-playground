package controllers

import play.api.data.Form

object PersonForm {
  import play.api.data.Forms._

  val form = Form(
    mapping(
      "name" -> nonEmptyText,
      "age" -> number(min = 0)
    )(Data.apply)(Data.unapply)
  )

  case class Data(name: String, age: Int)

}
