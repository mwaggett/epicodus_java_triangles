import java.util.Random;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.*;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import java.util.Map;


public class App {

  public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/newpage", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/newpage.vtl");

      int sideA = Integer.parseInt(request.queryParams("userSideA"));
      // model.put("sideA", sideA);

      int sideB = Integer.parseInt(request.queryParams("userSideB"));
      // model.put("sideB", sideB);

      int sideC = Integer.parseInt(request.queryParams("userSideC"));
      // model.put("sideC", sideC);

      Triangle userTriangle = new Triangle(sideA, sideB, sideC);

      String typeOfTriangle = userTriangle.whatKindOfTriangle();

      model.put("typeOfTriangle", typeOfTriangle);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  // public static <OutputClass> methodName(<Class> arg) {
  //
  // }


}
