// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/levi/Downloads/medilandaFarmApp/conf/routes
// @DATE:Tue Aug 20 03:03:32 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def main: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.main",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:25
    def count_out_save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.count_out_save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "countout"})
        }
      """
    )
  
    // @LINE:30
    def countout_list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.countout_list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editcountout"})
        }
      """
    )
  
    // @LINE:23
    def count_out_create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.count_out_create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "countout"})
        }
      """
    )
  
    // @LINE:37
    def manualadd_save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.manualadd_save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manualadd"})
        }
      """
    )
  
    // @LINE:11
    def check_in_create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.check_in_create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkin"})
        }
      """
    )
  
    // @LINE:16
    def checkin_list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.checkin_list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editcheckin"})
        }
      """
    )
  
    // @LINE:13
    def check_in_save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.check_in_save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checkin"})
        }
      """
    )
  
    // @LINE:19
    def delete_checkin_row: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete_checkin_row",
      """
        function(date_time0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editcheckin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("date_time", date_time0))})
        }
      """
    )
  
    // @LINE:34
    def manualadd_create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.manualadd_create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manualadd"})
        }
      """
    )
  
    // @LINE:28
    def delete_countout_row: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.delete_countout_row",
      """
        function(date_time0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editcountout/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("date_time", date_time0))})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
