
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
            """),format.raw/*25.13*/("""function myFunction2() """),format.raw/*25.36*/("""{"""),format.raw/*25.37*/("""
                """),format.raw/*26.17*/("""var x = document.getElementById('rcheckinTrig');
                if (x.style.visibility === 'hidden') """),format.raw/*27.54*/("""{"""),format.raw/*27.55*/("""
                    """),format.raw/*28.21*/("""x.style.visibility = 'visible';
                """),format.raw/*29.17*/("""}"""),format.raw/*29.18*/(""" """),format.raw/*29.19*/("""else """),format.raw/*29.24*/("""{"""),format.raw/*29.25*/("""
                    """),format.raw/*30.21*/("""x.style.visibility = 'hidden';
                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/("""
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""
            """),format.raw/*33.13*/("""function myFunction3() """),format.raw/*33.36*/("""{"""),format.raw/*33.37*/("""
                """),format.raw/*34.17*/("""var x = document.getElementById('rcountTrig');
                if (x.style.visibility === 'hidden') """),format.raw/*35.54*/("""{"""),format.raw/*35.55*/("""
                    """),format.raw/*36.21*/("""x.style.visibility = 'visible';
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/(""" """),format.raw/*37.19*/("""else """),format.raw/*37.24*/("""{"""),format.raw/*37.25*/("""
                    """),format.raw/*38.21*/("""x.style.visibility = 'hidden';
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/("""
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""
            """),format.raw/*41.13*/("""function myFunction4() """),format.raw/*41.36*/("""{"""),format.raw/*41.37*/("""
                """),format.raw/*42.17*/("""var x = document.getElementById('manualTrig');
                if (x.style.visibility === 'hidden') """),format.raw/*43.54*/("""{"""),format.raw/*43.55*/("""
                    """),format.raw/*44.21*/("""x.style.visibility = 'visible';
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/(""" """),format.raw/*45.19*/("""else """),format.raw/*45.24*/("""{"""),format.raw/*45.25*/("""
                    """),format.raw/*46.21*/("""x.style.visibility = 'hidden';
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/("""
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/("""
            
            
        """),format.raw/*51.9*/("""</script>
    </head>
    <body>
        <div>
            <a title= "Delete Check-in Rows" style="background-color: #e91e1e;border-color: #e91e1e" class="btn btn-success btn-lg" onclick="myFunction2()" >
                <span class="glyphicon glyphicon-trash"></span>
            </a>
           
            <a title="Delete Count Rows"style="background-color: #4CAF50;border-color: #4CAF50" class="btn btn-success btn-lg" onclick="myFunction3()">
                <span class="glyphicon glyphicon-trash"></span>
            </a>
            <a title="Manual Data Entry" style="background-color: #FF9800;border-color: #FF9800;float:right" class="btn btn-success btn-lg" onclick="myFunction4()">
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
                <p style="visibility: hidden; color:white" id="checkTrig">CHECK-IN</p>
                <p style="visibility: hidden; color:white" id="countTrig">COUNT</p>
                <p style="visibility: hidden; color:white" id="rcheckinTrig">REMOVE CHECK-IN ROWS</p>
                <p style="visibility: hidden; color:white" id="rcountTrig">REMOVE COUNT ROWS</p>
                <p style="visibility: hidden; color:white" id="manualTrig">MANUAL DATA ENTRY</p>
                
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
                  DATE: Fri Aug 16 19:15:22 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaFarmApp/app/views/main.scala.html
                  HASH: a0b58694923b320e7891ceabcd625b6301752492
                  MATRIX: 1029->0|1219->164|1233->170|1295->212|1443->334|1457->340|1517->380|1630->466|1658->467|1703->484|1830->583|1859->584|1908->605|1984->653|2013->654|2042->655|2075->660|2104->661|2153->682|2228->729|2257->730|2298->743|2327->744|2368->757|2419->780|2448->781|2493->798|2620->897|2649->898|2698->919|2774->967|2803->968|2832->969|2865->974|2894->975|2943->996|3018->1043|3047->1044|3088->1057|3117->1058|3158->1071|3209->1094|3238->1095|3283->1112|3413->1214|3442->1215|3491->1236|3567->1284|3596->1285|3625->1286|3658->1291|3687->1292|3736->1313|3811->1360|3840->1361|3881->1374|3910->1375|3951->1388|4002->1411|4031->1412|4076->1429|4204->1529|4233->1530|4282->1551|4358->1599|4387->1600|4416->1601|4449->1606|4478->1607|4527->1628|4602->1675|4631->1676|4672->1689|4701->1690|4742->1703|4793->1726|4822->1727|4867->1744|4995->1844|5024->1845|5073->1866|5149->1914|5178->1915|5207->1916|5240->1921|5269->1922|5318->1943|5393->1990|5422->1991|5463->2004|5492->2005|5554->2040
                  LINES: 33->1|37->5|37->5|37->5|39->7|39->7|39->7|41->9|41->9|42->10|43->11|43->11|44->12|45->13|45->13|45->13|45->13|45->13|46->14|47->15|47->15|48->16|48->16|49->17|49->17|49->17|50->18|51->19|51->19|52->20|53->21|53->21|53->21|53->21|53->21|54->22|55->23|55->23|56->24|56->24|57->25|57->25|57->25|58->26|59->27|59->27|60->28|61->29|61->29|61->29|61->29|61->29|62->30|63->31|63->31|64->32|64->32|65->33|65->33|65->33|66->34|67->35|67->35|68->36|69->37|69->37|69->37|69->37|69->37|70->38|71->39|71->39|72->40|72->40|73->41|73->41|73->41|74->42|75->43|75->43|76->44|77->45|77->45|77->45|77->45|77->45|78->46|79->47|79->47|80->48|80->48|83->51
                  -- GENERATED --
              */
          