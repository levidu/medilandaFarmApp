// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/levi/Downloads/medilandaFarmApp/conf/routes
// @DATE:Tue Aug 20 12:42:58 IST 2019


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
