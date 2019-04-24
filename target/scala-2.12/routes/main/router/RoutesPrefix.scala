// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Year2project/conf/routes
// @DATE:Wed Apr 24 14:17:03 IST 2019


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
