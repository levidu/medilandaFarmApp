// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/levi/Downloads/medilandaFarmApp/conf/routes
// @DATE:Fri Aug 16 19:15:22 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:40
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:40
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.main"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkin""", """controllers.HomeController.check_in_create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkin""", """controllers.HomeController.check_in_save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editcheckin""", """controllers.HomeController.checkin_list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editcheckin/""" + "$" + """date_time<[^/]+>""", """controllers.HomeController.delete_checkin_row(date_time:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """countout""", """controllers.HomeController.count_out_create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """countout""", """controllers.HomeController.count_out_save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editcountout/""" + "$" + """date_time<[^/]+>""", """controllers.HomeController.delete_countout_row(date_time:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editcountout""", """controllers.HomeController.countout_list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manualadd""", """controllers.HomeController.manualadd_create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manualadd""", """controllers.HomeController.manualadd_save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_main0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_main0_invoker = createInvoker(
    HomeController_1.main,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "main",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_check_in_create1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkin")))
  )
  private[this] lazy val controllers_HomeController_check_in_create1_invoker = createInvoker(
    HomeController_1.check_in_create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "check_in_create",
      Nil,
      "GET",
      this.prefix + """checkin""",
      """checkin""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_check_in_save2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkin")))
  )
  private[this] lazy val controllers_HomeController_check_in_save2_invoker = createInvoker(
    HomeController_1.check_in_save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "check_in_save",
      Nil,
      "POST",
      this.prefix + """checkin""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_checkin_list3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editcheckin")))
  )
  private[this] lazy val controllers_HomeController_checkin_list3_invoker = createInvoker(
    HomeController_1.checkin_list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "checkin_list",
      Nil,
      "GET",
      this.prefix + """editcheckin""",
      """editcheckin""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_delete_checkin_row4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editcheckin/"), DynamicPart("date_time", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delete_checkin_row4_invoker = createInvoker(
    HomeController_1.delete_checkin_row(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete_checkin_row",
      Seq(classOf[String]),
      "GET",
      this.prefix + """editcheckin/""" + "$" + """date_time<[^/]+>""",
      """deletecheckin""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_count_out_create5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("countout")))
  )
  private[this] lazy val controllers_HomeController_count_out_create5_invoker = createInvoker(
    HomeController_1.count_out_create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "count_out_create",
      Nil,
      "GET",
      this.prefix + """countout""",
      """countout""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_count_out_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("countout")))
  )
  private[this] lazy val controllers_HomeController_count_out_save6_invoker = createInvoker(
    HomeController_1.count_out_save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "count_out_save",
      Nil,
      "POST",
      this.prefix + """countout""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_delete_countout_row7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editcountout/"), DynamicPart("date_time", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_delete_countout_row7_invoker = createInvoker(
    HomeController_1.delete_countout_row(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete_countout_row",
      Seq(classOf[String]),
      "GET",
      this.prefix + """editcountout/""" + "$" + """date_time<[^/]+>""",
      """deletecountout""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_countout_list8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editcountout")))
  )
  private[this] lazy val controllers_HomeController_countout_list8_invoker = createInvoker(
    HomeController_1.countout_list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "countout_list",
      Nil,
      "GET",
      this.prefix + """editcountout""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_manualadd_create9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manualadd")))
  )
  private[this] lazy val controllers_HomeController_manualadd_create9_invoker = createInvoker(
    HomeController_1.manualadd_create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "manualadd_create",
      Nil,
      "GET",
      this.prefix + """manualadd""",
      """manualadd""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_manualadd_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manualadd")))
  )
  private[this] lazy val controllers_HomeController_manualadd_save10_invoker = createInvoker(
    HomeController_1.manualadd_save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "manualadd_save",
      Nil,
      "POST",
      this.prefix + """manualadd""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_main0_route(params@_) =>
      call { 
        controllers_HomeController_main0_invoker.call(HomeController_1.main)
      }
  
    // @LINE:11
    case controllers_HomeController_check_in_create1_route(params@_) =>
      call { 
        controllers_HomeController_check_in_create1_invoker.call(HomeController_1.check_in_create())
      }
  
    // @LINE:13
    case controllers_HomeController_check_in_save2_route(params@_) =>
      call { 
        controllers_HomeController_check_in_save2_invoker.call(HomeController_1.check_in_save())
      }
  
    // @LINE:16
    case controllers_HomeController_checkin_list3_route(params@_) =>
      call { 
        controllers_HomeController_checkin_list3_invoker.call(HomeController_1.checkin_list())
      }
  
    // @LINE:19
    case controllers_HomeController_delete_checkin_row4_route(params@_) =>
      call(params.fromPath[String]("date_time", None)) { (date_time) =>
        controllers_HomeController_delete_checkin_row4_invoker.call(HomeController_1.delete_checkin_row(date_time))
      }
  
    // @LINE:23
    case controllers_HomeController_count_out_create5_route(params@_) =>
      call { 
        controllers_HomeController_count_out_create5_invoker.call(HomeController_1.count_out_create())
      }
  
    // @LINE:25
    case controllers_HomeController_count_out_save6_route(params@_) =>
      call { 
        controllers_HomeController_count_out_save6_invoker.call(HomeController_1.count_out_save())
      }
  
    // @LINE:28
    case controllers_HomeController_delete_countout_row7_route(params@_) =>
      call(params.fromPath[String]("date_time", None)) { (date_time) =>
        controllers_HomeController_delete_countout_row7_invoker.call(HomeController_1.delete_countout_row(date_time))
      }
  
    // @LINE:30
    case controllers_HomeController_countout_list8_route(params@_) =>
      call { 
        controllers_HomeController_countout_list8_invoker.call(HomeController_1.countout_list())
      }
  
    // @LINE:34
    case controllers_HomeController_manualadd_create9_route(params@_) =>
      call { 
        controllers_HomeController_manualadd_create9_invoker.call(HomeController_1.manualadd_create())
      }
  
    // @LINE:37
    case controllers_HomeController_manualadd_save10_route(params@_) =>
      call { 
        controllers_HomeController_manualadd_save10_invoker.call(HomeController_1.manualadd_save())
      }
  
    // @LINE:40
    case controllers_Assets_versioned11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
