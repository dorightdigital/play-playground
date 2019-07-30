package controllers

import javax.inject.Inject
import play.api.mvc.{AnyContent, MessagesAbstractController, MessagesControllerComponents, MessagesRequest, MessagesRequestHeader, Request}
import PersonForm._

class PersonController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {

  private val endpoint = routes.PersonController.receiveForm()

  def displayForm() = Action { implicit request: MessagesRequest[AnyContent] => {

    Ok(views.html.personForm(endpoint, form))
  }
  }

  def receiveForm() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

}
