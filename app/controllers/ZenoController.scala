package controllers

import models.Philosopher
import play.api.mvc._
import play.api.libs.json._

class ZenoController extends Controller {

    val philosophers: List[Philosopher] = List(
        Philosopher("Zeno of Citium", 72),
        Philosopher("Marcus Aurelius", 58),
        Philosopher("Epictetus", 80)
    )

    def index = Action {
        Ok
    }

    def list = Action {
        Ok(Json.toJson(philosophers))
    }

    implicit val writesPhilosopher = Json.writes[Philosopher]

}
