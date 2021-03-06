
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/backend/Lab-2-backend/conf/routes
// @DATE:Fri Mar 05 19:49:32 CST 2021

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:12
  class ReversePubController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def partOneQueryFour(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "query4Response")
    }
  
    // @LINE:19
    def partOneQueryThree(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "query3Response")
    }
  
    // @LINE:23
    def partOneQueryFive(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "query5Response")
    }
  
    // @LINE:12
    def findAll(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "findAll")
    }
  
    // @LINE:15
    def partOneQueryOne(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "query1Response")
    }
  
    // @LINE:17
    def partOneQueryTwo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "query2Response")
    }
  
  }


}
