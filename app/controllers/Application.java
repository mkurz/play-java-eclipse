package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return redirect(controllers.routes.Application.contact());
    }

    public Result contact() {
        return ok("contact");
    }
}
