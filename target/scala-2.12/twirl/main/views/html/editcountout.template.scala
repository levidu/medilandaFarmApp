
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
/*1.2*/import models.CountRecord

object editcountout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[CountRecord],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(countoutList: List[CountRecord]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*7.87*/("""">
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.versioned("NumPad-master/dist/jquery.ui.pinpad.css")),format.raw/*8.105*/("""">
        <link rel="stylesheet" href=""""),_display_(/*9.39*/routes/*9.45*/.Assets.versioned("NumPad-master/external/jquery-ui/jquery-ui.css")),format.raw/*9.112*/("""">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*11.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("NumPad-master/external/jquery/jquery.js")),format.raw/*12.89*/(""""></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("NumPad-master/external/jquery-ui/jquery-ui.js")),format.raw/*13.95*/(""""></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("NumPad-master/dist/jquery.ui.pinpad.js")),format.raw/*14.88*/(""""></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.versioned("NumPad-master/dist/jquery.ui.pinpad.extension.js")),format.raw/*15.98*/(""""></script>
        <script>
        $(function()"""),format.raw/*17.21*/("""{"""),format.raw/*17.22*/("""
            """),format.raw/*18.13*/("""$("#egg_count").pinpad("""),format.raw/*18.36*/("""{"""),format.raw/*18.37*/("""
                """),format.raw/*19.17*/("""digitOnly: true
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/(""");
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/(""");
        $(function()"""),format.raw/*22.21*/("""{"""),format.raw/*22.22*/("""
            """),format.raw/*23.13*/("""$("#damage_count").pinpad("""),format.raw/*23.39*/("""{"""),format.raw/*23.40*/("""
                """),format.raw/*24.17*/("""digitOnly: true
            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/(""");
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/(""");
        $(function()"""),format.raw/*27.21*/("""{"""),format.raw/*27.22*/("""
            """),format.raw/*28.13*/("""$("#dirty_count").pinpad("""),format.raw/*28.38*/("""{"""),format.raw/*28.39*/("""
                """),format.raw/*29.17*/("""digitOnly: true
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/(""");
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/(""");
        $(function()"""),format.raw/*32.21*/("""{"""),format.raw/*32.22*/("""
            """),format.raw/*33.13*/("""$("#damaged_on_counter").pinpad( """),format.raw/*33.46*/("""{"""),format.raw/*33.47*/("""
                """),format.raw/*34.17*/("""digitOnly: true
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/(""");
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/(""");
    </script>    
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand">COUNT | Edit</a>
                </div>
                <ul class="nav navbar-nav">
                    <li>
                        <a href="/"><span class="glyphicon glyphicon-home"></span></a>
                    </li>
                </ul>
            </div>
        </nav>
        <center>
            <br>
            <br>
            <br>
            <br>
            <br>
            <div class="col-md-auto">
            	<table class="table table-hover">
            		<thead>
            			<th scope="col">UID</th>
            			<th scope="col">CAGE</th>
            			<th scope="col">USER</th>
            			<th scope="col">EGG COUNT</th>
            			<th scope="col">DAMAGE COUNT</th>
            			<th scope="col">DIRTY EGG COUNT</th>
            			<th scope="col">DAMAGED ON COUNTER</th>
            			<th scope="col">DATE-TIME</th>
            		</thead>
            		<tbody>
            			"""),_display_(/*71.17*/for(countoutRow<-countoutList) yield /*71.47*/ {_display_(Seq[Any](format.raw/*71.49*/("""
            			"""),format.raw/*72.16*/("""<tr sccope="row">
            				<td>"""),_display_(/*73.22*/countoutRow/*73.33*/.getUid),format.raw/*73.40*/("""</td>
            				<td>"""),_display_(/*74.22*/countoutRow/*74.33*/.getCage),format.raw/*74.41*/("""</td>
            				<td>"""),_display_(/*75.22*/countoutRow/*75.33*/.getUser),format.raw/*75.41*/("""</td>
            				<td>"""),_display_(/*76.22*/countoutRow/*76.33*/.getEgg_count),format.raw/*76.46*/("""</td>
            				<td>"""),_display_(/*77.22*/countoutRow/*77.33*/.getDamage_count),format.raw/*77.49*/("""</td>
            				<td>"""),_display_(/*78.22*/countoutRow/*78.33*/.getDirty_count),format.raw/*78.48*/("""</td>
            				<td>"""),_display_(/*79.22*/countoutRow/*79.33*/.getDamaged_on_counter),format.raw/*79.55*/("""</td>
            				<td>"""),_display_(/*80.22*/countoutRow/*80.33*/.getDate_time),format.raw/*80.46*/("""</td>
            				<td>
            					<a href=""""),_display_(/*82.28*/routes/*82.34*/.HomeController.delete_countout_row(countoutRow.getDate_time)),format.raw/*82.95*/("""">
            					<i class="glyphicon glyphicon-trash"></i>
            					</a>
            				</td>
            				
            			</tr>
            			
            			""")))}),format.raw/*89.17*/("""
    
            		"""),format.raw/*91.15*/("""</tbody>
            		<tfoot>
            			<tr scope="row">
            			</tr>
            			
            		</tfoot>
                
            </div>
        </center>
    </body>
</html>"""))
      }
    }
  }

  def render(countoutList:List[CountRecord]): play.twirl.api.HtmlFormat.Appendable = apply(countoutList)

  def f:((List[CountRecord]) => play.twirl.api.HtmlFormat.Appendable) = (countoutList) => apply(countoutList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 08 03:40:34 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaApp/play-java-seed/app/views/editcountout.scala.html
                  HASH: a7b0bcfd6de6e9811c9000fa80ff96c92566edb4
                  MATRIX: 651->1|999->28|1126->62|1316->226|1330->232|1392->274|1459->315|1473->321|1554->381|1621->422|1635->428|1723->495|1872->617|1887->623|1948->663|2032->720|2047->726|2128->786|2189->820|2204->826|2291->892|2352->926|2367->932|2447->991|2508->1025|2523->1031|2613->1100|2690->1149|2719->1150|2760->1163|2811->1186|2840->1187|2885->1204|2941->1232|2970->1233|3008->1244|3037->1245|3088->1268|3117->1269|3158->1282|3212->1308|3241->1309|3286->1326|3342->1354|3371->1355|3409->1366|3438->1367|3489->1390|3518->1391|3559->1404|3612->1429|3641->1430|3686->1447|3742->1475|3771->1476|3809->1487|3838->1488|3889->1511|3918->1512|3959->1525|4020->1558|4049->1559|4094->1576|4150->1604|4179->1605|4217->1616|4246->1617|5409->2753|5455->2783|5495->2785|5539->2801|5605->2840|5625->2851|5653->2858|5707->2885|5727->2896|5756->2904|5810->2931|5830->2942|5859->2950|5913->2977|5933->2988|5967->3001|6021->3028|6041->3039|6078->3055|6132->3082|6152->3093|6188->3108|6242->3135|6262->3146|6305->3168|6359->3195|6379->3206|6413->3219|6494->3273|6509->3279|6591->3340|6798->3516|6846->3536
                  LINES: 24->1|29->2|34->3|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|48->17|48->17|49->18|49->18|49->18|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|54->23|55->24|56->25|56->25|57->26|57->26|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|62->31|62->31|63->32|63->32|64->33|64->33|64->33|65->34|66->35|66->35|67->36|67->36|102->71|102->71|102->71|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|113->82|113->82|113->82|120->89|122->91
                  -- GENERATED --
              */
          