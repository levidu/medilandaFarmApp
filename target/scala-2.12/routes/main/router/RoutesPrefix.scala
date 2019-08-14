// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/levi/Downloads/medilandaFarmApp/conf/routes
// @DATE:Wed Aug 14 15:22:47 IST 2019


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
