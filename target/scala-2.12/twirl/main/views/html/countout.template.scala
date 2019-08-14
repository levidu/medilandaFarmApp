
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

object countout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[CountRecord],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(countoutRecordForm: Form[CountRecord]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("css/bootstrap_count.css")),format.raw/*6.89*/("""">
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("NumPad-master/dist/jquery.ui.pinpad.css")),format.raw/*7.105*/("""">
        <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <link rel="stylesheet" href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.versioned("NumPad-master/external/jquery-ui/jquery-ui.css")),format.raw/*10.112*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("js/bootstrap_count.js")),format.raw/*11.71*/(""""></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("NumPad-master/external/jquery/jquery.js")),format.raw/*12.89*/(""""></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("NumPad-master/external/jquery-ui/jquery-ui.js")),format.raw/*13.95*/(""""></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("NumPad-master/dist/jquery.ui.pinpad.js")),format.raw/*14.88*/(""""></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.versioned("NumPad-master/dist/jquery.ui.pinpad.extension.js")),format.raw/*15.98*/(""""></script>
        <script>
        $( function () """),format.raw/*17.24*/("""{"""),format.raw/*17.25*/("""
            """),format.raw/*18.13*/("""$("#egg_count").pinpad( """),format.raw/*18.37*/("""{"""),format.raw/*18.38*/("""
                """),format.raw/*19.17*/("""digitOnly: true
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/(""" """),format.raw/*20.15*/(""");
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/(""" """),format.raw/*21.11*/(""");
        $( function () """),format.raw/*22.24*/("""{"""),format.raw/*22.25*/("""
            """),format.raw/*23.13*/("""$("#damage_count").pinpad( """),format.raw/*23.40*/("""{"""),format.raw/*23.41*/("""
                """),format.raw/*24.17*/("""digitOnly: true
            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/(""" """),format.raw/*25.15*/(""");
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/(""" """),format.raw/*26.11*/(""");
        $( function () """),format.raw/*27.24*/("""{"""),format.raw/*27.25*/("""
            """),format.raw/*28.13*/("""$("#dirty_count").pinpad( """),format.raw/*28.39*/("""{"""),format.raw/*28.40*/("""
                """),format.raw/*29.17*/("""digitOnly: true
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/(""" """),format.raw/*30.15*/(""");
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/(""" """),format.raw/*31.11*/(""");
        $( function () """),format.raw/*32.24*/("""{"""),format.raw/*32.25*/("""
            """),format.raw/*33.13*/("""$("#damaged_on_counter").pinpad( """),format.raw/*33.46*/("""{"""),format.raw/*33.47*/("""
                """),format.raw/*34.17*/("""digitOnly: true
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/(""" """),format.raw/*35.15*/(""");
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/(""" """),format.raw/*36.11*/(""");
    </script>    
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand">COUNT</a>
                </div>
                <ul class="nav navbar-nav">
                    <li>
                        
                    </li>
                </ul>
            </div>
        </nav>
        <center>
            <br>
            <div class="container">
                <form action=""""),_display_(/*55.32*/routes/*55.38*/.HomeController.count_out_save()),format.raw/*55.70*/("""" method="POST">
                    <div class="btn-group btn-group-justified" data-toggle="buttons">
					<label class="btn btn-primary btn-lg"> <input type="radio"
						name="user" value="user1" required>User 1
					</label> <label class="btn btn-primary btn-lg"> <input type="radio"
						name="user" value="user2">User 2
					</label> <label class="btn btn-primary btn-lg"> <input type="radio"
						name="user" value="user3">User 3
					</label> <label class="btn btn-primary btn-lg"> <input type="radio"
						name="user" value="user4">User 4
					</label> <label class="btn btn-primary btn-lg"> <input type="radio"
						name="user" value="user5">User 5
					</label> <label class="btn btn-primary btn-lg"> <input type="radio"
						name="user" value="user6">User 6
					</label>
				</div>
                    <br>
                    <br>
                    <input type="text" class="form-control" placeholder="EGG COUNT" name="egg_count" id="egg_count" required>
                    <br>
                    <input type="text" class="form-control" placeholder="DAMAGE COUNT" name="damage_count" id="damage_count" required>
                    <br>
                    <input type="text" class="form-control" placeholder="DIRTY COUNT" name="dirty_count" id="dirty_count" required>
                    <br>
                    <input type="text" class="form-control" placeholder="DAMAGED BY USER" name="damaged_on_counter" id="damaged_on_counter" required>
                    <br>
                    <br>
                    <br>
                    <br>
                    <input type="text" class="form-control" placeholder="UID" name="uid" required>
                    <br>
                    <input type="text" class="form-control" placeholder="CAGE" name="cage" required>
                    <br>
                    <input type="text" class="form-control" placeholder="TIME" name="date_time" required>
                    <br>
                    <br>
                    <input type="submit" class="btn btn-default" value="Submit">
                </form>
        </center>
    </body>
</html>"""))
      }
    }
  }

  def render(countoutRecordForm:Form[CountRecord]): play.twirl.api.HtmlFormat.Appendable = apply(countoutRecordForm)

  def f:((Form[CountRecord]) => play.twirl.api.HtmlFormat.Appendable) = (countoutRecordForm) => apply(countoutRecordForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 14 11:49:58 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaFarmApp/app/views/countout.scala.html
                  HASH: 044e6442dbec1ee7c531c8e93974a834bf359bf6
                  MATRIX: 962->1|1095->41|1285->205|1299->211|1363->255|1430->296|1444->302|1525->362|1691->501|1706->507|1795->574|1847->599|1862->605|1925->647|1986->681|2001->687|2082->747|2143->781|2158->787|2245->853|2306->887|2321->893|2401->952|2462->986|2477->992|2567->1061|2647->1113|2676->1114|2717->1127|2769->1151|2798->1152|2843->1169|2899->1197|2928->1198|2957->1199|2995->1210|3024->1211|3053->1212|3107->1238|3136->1239|3177->1252|3232->1279|3261->1280|3306->1297|3362->1325|3391->1326|3420->1327|3458->1338|3487->1339|3516->1340|3570->1366|3599->1367|3640->1380|3694->1406|3723->1407|3768->1424|3824->1452|3853->1453|3882->1454|3920->1465|3949->1466|3978->1467|4032->1493|4061->1494|4102->1507|4163->1540|4192->1541|4237->1558|4293->1586|4322->1587|4351->1588|4389->1599|4418->1600|4447->1601|5002->2129|5017->2135|5070->2167
                  LINES: 28->1|33->2|37->6|37->6|37->6|38->7|38->7|38->7|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|48->17|48->17|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36|86->55|86->55|86->55
                  -- GENERATED --
              */
          