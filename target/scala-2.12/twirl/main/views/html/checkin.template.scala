
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object checkin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[CheckinRecord],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(checkinRecordForm: Form[CheckinRecord]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("css/bootstrap_checkin.min.css")),format.raw/*6.95*/("""">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src=""""),_display_(/*8.23*/routes/*8.29*/.Assets.versioned("js/bootstrap_checkin.min.js")),format.raw/*8.77*/(""""></script>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand">CHECKIN</a>
                </div>
                <ul class="nav navbar-nav">
                    <li>
                
                    </li>
                </ul>
            </div>
        </nav>
        <center>
            <br>
            <br>
            <br>
            <br>
            <div class="container">
                <form action=""""),_display_(/*29.32*/routes/*29.38*/.HomeController.check_in_save()),format.raw/*29.69*/("""" method="POST">
                    <br>
                    <input type="text" class="form-control" placeholder="UID" name="uid">
                    <br>
                    <input type="text" class="form-control" placeholder="CAGE" name="cage">
                    <br>
                    <input type="text" class="form-control" placeholder="TIME" name="date_time">
                    <br>
                    <br>
                    <input type="submit" class="btn btn-default" value="Submit">
                </form>
            </div>
        </center>
    </body>
</html>"""))
      }
    }
  }

  def render(checkinRecordForm:Form[CheckinRecord]): play.twirl.api.HtmlFormat.Appendable = apply(checkinRecordForm)

  def f:((Form[CheckinRecord]) => play.twirl.api.HtmlFormat.Appendable) = (checkinRecordForm) => apply(checkinRecordForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 08 03:40:34 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaApp/play-java-seed/app/views/checkin.scala.html
                  HASH: 16cf69463a77f9ceb61c9a0cb524aee6ded05503
                  MATRIX: 963->1|1097->42|1287->206|1301->212|1371->262|1519->384|1533->390|1601->438|2192->1002|2207->1008|2259->1039
                  LINES: 28->1|33->2|37->6|37->6|37->6|39->8|39->8|39->8|60->29|60->29|60->29
                  -- GENERATED --
              */
          