
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Desktop/CS Master/CS7340/Lab2/Lab-2-backend/conf/routes
// @DATE:Tue Mar 02 09:54:54 CST 2021

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReversePubController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def findAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PubController.findAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findAll"})
        }
      """
    )
  
    // @LINE:15
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PubController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query1Response"})
        }
      """
    )
  
  }


}
