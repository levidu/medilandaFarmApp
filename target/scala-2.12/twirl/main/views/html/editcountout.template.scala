
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
            function myHomeFunction() """),format.raw/*18.39*/("""{"""),format.raw/*18.40*/("""
                """),format.raw/*19.17*/("""var x = document.getElementById('homeTrig');
                if (x.style.visibility === 'hidden') """),format.raw/*20.54*/("""{"""),format.raw/*20.55*/("""
                    """),format.raw/*21.21*/("""x.style.visibility = 'visible';
                """),format.raw/*22.17*/("""}"""),format.raw/*22.18*/(""" """),format.raw/*22.19*/("""else """),format.raw/*22.24*/("""{"""),format.raw/*22.25*/("""
                    """),format.raw/*23.21*/("""x.style.visibility = 'hidden';
                """),format.raw/*24.17*/("""}"""),format.raw/*24.18*/("""
            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""</script>
        <script>
        
        
        $(function()"""),format.raw/*30.21*/("""{"""),format.raw/*30.22*/("""
            """),format.raw/*31.13*/("""$("#egg_count").pinpad("""),format.raw/*31.36*/("""{"""),format.raw/*31.37*/("""
                """),format.raw/*32.17*/("""digitOnly: true
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/(""");
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/(""");
        $(function()"""),format.raw/*35.21*/("""{"""),format.raw/*35.22*/("""
            """),format.raw/*36.13*/("""$("#damage_count").pinpad("""),format.raw/*36.39*/("""{"""),format.raw/*36.40*/("""
                """),format.raw/*37.17*/("""digitOnly: true
            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/(""");
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/(""");
        $(function()"""),format.raw/*40.21*/("""{"""),format.raw/*40.22*/("""
            """),format.raw/*41.13*/("""$("#dirty_count").pinpad("""),format.raw/*41.38*/("""{"""),format.raw/*41.39*/("""
                """),format.raw/*42.17*/("""digitOnly: true
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/(""");
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/(""");
        $(function()"""),format.raw/*45.21*/("""{"""),format.raw/*45.22*/("""
            """),format.raw/*46.13*/("""$("#damaged_on_counter").pinpad( """),format.raw/*46.46*/("""{"""),format.raw/*46.47*/("""
                """),format.raw/*47.17*/("""digitOnly: true
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/(""");
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/(""");
    </script>    
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand">COUNT | Delete</a>
                </div>
                <ul class="nav navbar-nav">
                    <li>
                        <a onclick="myHomeFunction()"><span style="font-size:35px" class="glyphicon glyphicon-home"></span></a>
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
            			"""),_display_(/*84.17*/for(countoutRow<-countoutList) yield /*84.47*/ {_display_(Seq[Any](format.raw/*84.49*/("""
            			"""),format.raw/*85.16*/("""<tr sccope="row">
            				<td>"""),_display_(/*86.22*/countoutRow/*86.33*/.getUid),format.raw/*86.40*/("""</td>
            				<td>"""),_display_(/*87.22*/countoutRow/*87.33*/.getCage),format.raw/*87.41*/("""</td>
            				<td>"""),_display_(/*88.22*/countoutRow/*88.33*/.getUser),format.raw/*88.41*/("""</td>
            				<td>"""),_display_(/*89.22*/countoutRow/*89.33*/.getEgg_count),format.raw/*89.46*/("""</td>
            				<td>"""),_display_(/*90.22*/countoutRow/*90.33*/.getDamage_count),format.raw/*90.49*/("""</td>
            				<td>"""),_display_(/*91.22*/countoutRow/*91.33*/.getDirty_count),format.raw/*91.48*/("""</td>
            				<td>"""),_display_(/*92.22*/countoutRow/*92.33*/.getDamaged_on_counter),format.raw/*92.55*/("""</td>
            				<td>"""),_display_(/*93.22*/countoutRow/*93.33*/.getDate_time),format.raw/*93.46*/("""</td>
            				<td>
            					<a href=""""),_display_(/*95.28*/routes/*95.34*/.HomeController.delete_countout_row(countoutRow.getDate_time)),format.raw/*95.95*/("""">
            					<i style="font-size:35px" class="glyphicon glyphicon-trash"></i>
            					</a>
            				</td>
            				
            			</tr>
            			
            			""")))}),format.raw/*102.17*/("""
    
            		"""),format.raw/*104.15*/("""</tbody>
            		<tfoot>
            			<tr scope="row">
            			</tr>
            			
            		</tfoot>
                
            </div>
        </center>
        
        <p style="visibility: hidden; color:white" id="homeTrig">HOME</p>
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
                  DATE: Tue Aug 20 12:42:58 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaFarmApp/app/views/editcountout.scala.html
                  HASH: 20b11fbfa8ae4a6d3befa056a77e4d6bfe3f5e7d
                  MATRIX: 651->1|999->28|1126->62|1316->226|1330->232|1392->274|1459->315|1473->321|1554->381|1621->422|1635->428|1723->495|1872->617|1887->623|1948->663|2032->720|2047->726|2128->786|2189->820|2204->826|2291->892|2352->926|2367->932|2447->991|2508->1025|2523->1031|2613->1100|2717->1176|2746->1177|2791->1194|2917->1292|2946->1293|2995->1314|3071->1362|3100->1363|3129->1364|3162->1369|3191->1370|3240->1391|3315->1438|3344->1439|3385->1452|3414->1453|3450->1462|3543->1527|3572->1528|3613->1541|3664->1564|3693->1565|3738->1582|3794->1610|3823->1611|3861->1622|3890->1623|3941->1646|3970->1647|4011->1660|4065->1686|4094->1687|4139->1704|4195->1732|4224->1733|4262->1744|4291->1745|4342->1768|4371->1769|4412->1782|4465->1807|4494->1808|4539->1825|4595->1853|4624->1854|4662->1865|4691->1866|4742->1889|4771->1890|4812->1903|4873->1936|4902->1937|4947->1954|5003->1982|5032->1983|5070->1994|5099->1995|6305->3174|6351->3204|6391->3206|6435->3222|6501->3261|6521->3272|6549->3279|6603->3306|6623->3317|6652->3325|6706->3352|6726->3363|6755->3371|6809->3398|6829->3409|6863->3422|6917->3449|6937->3460|6974->3476|7028->3503|7048->3514|7084->3529|7138->3556|7158->3567|7201->3589|7255->3616|7275->3627|7309->3640|7390->3694|7405->3700|7487->3761|7718->3960|7767->3980
                  LINES: 24->1|29->2|34->3|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|49->18|49->18|50->19|51->20|51->20|52->21|53->22|53->22|53->22|53->22|53->22|54->23|55->24|55->24|56->25|56->25|57->26|61->30|61->30|62->31|62->31|62->31|63->32|64->33|64->33|65->34|65->34|66->35|66->35|67->36|67->36|67->36|68->37|69->38|69->38|70->39|70->39|71->40|71->40|72->41|72->41|72->41|73->42|74->43|74->43|75->44|75->44|76->45|76->45|77->46|77->46|77->46|78->47|79->48|79->48|80->49|80->49|115->84|115->84|115->84|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|126->95|126->95|126->95|133->102|135->104
                  -- GENERATED --
              */
          