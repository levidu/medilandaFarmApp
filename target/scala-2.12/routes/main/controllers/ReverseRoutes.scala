// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/levi/Downloads/medilandaFarmApp/conf/routes
// @DATE:Tue Aug 20 12:42:58 IST 2019

import play.api.mvc.Call


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
    def main(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:25
    def count_out_save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "countout")
    }
  
    // @LINE:30
    def countout_list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "editcountout")
    }
  
    // @LINE:23
    def count_out_create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "countout")
    }
  
    // @LINE:37
    def manualadd_save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "manualadd")
    }
  
    // @LINE:11
    def check_in_create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "checkin")
    }
  
    // @LINE:16
    def checkin_list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "editcheckin")
    }
  
    // @LINE:13
    def check_in_save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "checkin")
    }
  
    // @LINE:19
    def delete_checkin_row(date_time:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "editcheckin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("date_time", date_time)))
    }
  
    // @LINE:34
    def manualadd_create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manualadd")
    }
  
    // @LINE:28
    def delete_countout_row(date_time:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "editcountout/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("date_time", date_time)))
    }
  
  }

  // @LINE:40
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
