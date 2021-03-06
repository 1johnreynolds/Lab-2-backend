
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/backend/Lab-2-backend/conf/routes
// @DATE:Fri Mar 05 19:49:32 CST 2021

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

  
    // @LINE:21
    def partOneQueryFour: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PubController.partOneQueryFour",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query4Response"})
        }
      """
    )
  
    // @LINE:19
    def partOneQueryThree: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PubController.partOneQueryThree",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query3Response"})
        }
      """
    )
  
    // @LINE:23
    def partOneQueryFive: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PubController.partOneQueryFive",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query5Response"})
        }
      """
    )
  
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
    def partOneQueryOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PubController.partOneQueryOne",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query1Response"})
        }
      """
    )
  
    // @LINE:17
    def partOneQueryTwo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PubController.partOneQueryTwo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "query2Response"})
        }
      """
    )
  
  }


}
