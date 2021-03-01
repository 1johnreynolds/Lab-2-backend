
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Downloads/Lab-2-Ebean 3/ebean-backend/conf/routes
// @DATE:Wed Feb 24 12:06:18 CST 2021


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
