
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/backend/Lab-2-backend/conf/routes
// @DATE:Fri Mar 05 19:49:32 CST 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
