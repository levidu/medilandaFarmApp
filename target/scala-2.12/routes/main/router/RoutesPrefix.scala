// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/levi/Downloads/medilandaApp/play-java-seed/conf/routes
// @DATE:Thu Aug 08 03:40:34 IST 2019


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
