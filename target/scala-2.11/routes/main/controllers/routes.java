
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/backend/Lab-2-backend/conf/routes
// @DATE:Fri Mar 05 19:49:32 CST 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePubController PubController = new controllers.ReversePubController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePubController PubController = new controllers.javascript.ReversePubController(RoutesPrefix.byNamePrefix());
  }

}
