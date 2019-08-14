
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href=""""),_display_(/*5.39*/routes/*5.45*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*5.87*/("""">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src=""""),_display_(/*7.23*/routes/*7.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*7.69*/("""" type="text/javascript"></script>
        <script>
            function myFunction() """),format.raw/*9.35*/("""{"""),format.raw/*9.36*/("""
                """),format.raw/*10.17*/("""var x = document.getElementById('checkTrig');
                if (x.style.visibility === 'hidden') """),format.raw/*11.54*/("""{"""),format.raw/*11.55*/("""
                    """),format.raw/*12.21*/("""x.style.visibility = 'visible';
                """),format.raw/*13.17*/("""}"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""else """),format.raw/*13.24*/("""{"""),format.raw/*13.25*/("""
                    """),format.raw/*14.21*/("""x.style.visibility = 'hidden';
                """),format.raw/*15.17*/("""}"""),format.raw/*15.18*/("""
            """),format.raw/*16.13*/("""}"""),format.raw/*16.14*/("""
            """),format.raw/*17.13*/("""function myFunction1() """),format.raw/*17.36*/("""{"""),format.raw/*17.37*/("""
                """),format.raw/*18.17*/("""var x = document.getElementById('countTrig');
                if (x.style.visibility === 'hidden') """),format.raw/*19.54*/("""{"""),format.raw/*19.55*/("""
                    """),format.raw/*20.21*/("""x.style.visibility = 'visible';
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/(""" """),format.raw/*21.19*/("""else """),format.raw/*21.24*/("""{"""),format.raw/*21.25*/("""
                    """),format.raw/*22.21*/("""x.style.visibility = 'hidden';
                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/("""
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</script>
        <script>
            function myFunction() """),format.raw/*27.35*/("""{"""),format.raw/*27.36*/("""
                """),format.raw/*28.17*/("""var x = document.getElementById('checkTrig');
                if (x.style.visibility === 'hidden') """),format.raw/*29.54*/("""{"""),format.raw/*29.55*/("""
                    """),format.raw/*30.21*/("""x.style.visibility = 'visible';
                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/(""" """),format.raw/*31.19*/("""else """),format.raw/*31.24*/("""{"""),format.raw/*31.25*/("""
                    """),format.raw/*32.21*/("""x.style.visibility = 'hidden';
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/("""
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""
            """),format.raw/*35.13*/("""function myFunction1() """),format.raw/*35.36*/("""{"""),format.raw/*35.37*/("""
                """),format.raw/*36.17*/("""var x = document.getElementById('countTrig');
                if (x.style.visibility === 'hidden') """),format.raw/*37.54*/("""{"""),format.raw/*37.55*/("""
                    """),format.raw/*38.21*/("""x.style.visibility = 'visible';
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/(""" """),format.raw/*39.19*/("""else """),format.raw/*39.24*/("""{"""),format.raw/*39.25*/("""
                    """),format.raw/*40.21*/("""x.style.visibility = 'hidden';
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/("""
            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/("""
        """),format.raw/*43.9*/("""</script>
    </head>
    <body>
        <div>
            <a href="/editcheckin" title= "Delete Check-in Rows" style="background-color: #e91e1e;border-color: #e91e1e" class="btn btn-success btn-lg">
                <span class="glyphicon glyphicon-trash"></span>
            </a>
           
            <a href="/editcountout" title="Delete Count Rows"style="background-color: #4CAF50;border-color: #4CAF50" class="btn btn-success btn-lg">
                <span class="glyphicon glyphicon-trash"></span>
            </a>
            <a href="/manualadd" title="Manual Data Entry" style="background-color: #FF9800;border-color: #FF9800;float:right" class="btn btn-success btn-lg">
                <span class="glyphicon glyphicon-calendar"></span>
            </a>
            
        </div>
        <center>
            <center>
                <br>
                <br>
                <br>
                <br>
                <br>
                <a style="width:80vw;display:block;vertical-align:middle;color:white;background-color: #e91e1e;font-size:10vh;font-family: 'Gill Sans', 'Gill Sans MT', Calibri, sans-serif;padding-top:5vh;padding-bottom:5vh;max-height=30vh;min-height=10vh;border-radius:5vh;text-decoration: none;" onclick="myFunction()">CHECK-IN</a>
                <br>
                <br>
                <a style="width:80vw;display:block;vertical-align:middle;color:white;background-color: #4CAF50;font-size:10vh;font-family: 'Gill Sans', 'Gill Sans MT', Calibri, sans-serif;padding-top:5vh;padding-bottom:5vh;max-height=30vh;min-height=10vh;border-radius:5vh;text-decoration: none;" onclick="myFunction1()">COUNT</a>
                <p style="visibility: hidden;" id="checkTrig">CHECK-IN</p>
                <p style="visibility: hidden;" id="countTrig">COUNT</p>
            </center>
        </center>
    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 14 15:22:47 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaFarmApp/app/views/main.scala.html
                  HASH: 9a6c3a9190d3614b21de1731f24023ae2c400aa9
                  MATRIX: 1029->0|1219->164|1233->170|1295->212|1443->334|1457->340|1517->380|1630->466|1658->467|1703->484|1830->583|1859->584|1908->605|1984->653|2013->654|2042->655|2075->660|2104->661|2153->682|2228->729|2257->730|2298->743|2327->744|2368->757|2419->780|2448->781|2493->798|2620->897|2649->898|2698->919|2774->967|2803->968|2832->969|2865->974|2894->975|2943->996|3018->1043|3047->1044|3088->1057|3117->1058|3153->1067|3242->1128|3271->1129|3316->1146|3443->1245|3472->1246|3521->1267|3597->1315|3626->1316|3655->1317|3688->1322|3717->1323|3766->1344|3841->1391|3870->1392|3911->1405|3940->1406|3981->1419|4032->1442|4061->1443|4106->1460|4233->1559|4262->1560|4311->1581|4387->1629|4416->1630|4445->1631|4478->1636|4507->1637|4556->1658|4631->1705|4660->1706|4701->1719|4730->1720|4766->1729
                  LINES: 33->1|37->5|37->5|37->5|39->7|39->7|39->7|41->9|41->9|42->10|43->11|43->11|44->12|45->13|45->13|45->13|45->13|45->13|46->14|47->15|47->15|48->16|48->16|49->17|49->17|49->17|50->18|51->19|51->19|52->20|53->21|53->21|53->21|53->21|53->21|54->22|55->23|55->23|56->24|56->24|57->25|59->27|59->27|60->28|61->29|61->29|62->30|63->31|63->31|63->31|63->31|63->31|64->32|65->33|65->33|66->34|66->34|67->35|67->35|67->35|68->36|69->37|69->37|70->38|71->39|71->39|71->39|71->39|71->39|72->40|73->41|73->41|74->42|74->42|75->43
                  -- GENERATED --
              */
          