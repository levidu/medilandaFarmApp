
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

object manualadd extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[ManualRecord],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(manualRecordForm: Form[ManualRecord]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href=""""),_display_(/*6.31*/routes/*6.37*/.Assets.versioned("css/bootstrap_manualadd.min.css")),format.raw/*6.89*/("""">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("js/bootstrap_manualadd.min.js")),format.raw/*9.71*/(""""></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet" href=""""),_display_(/*12.31*/routes/*12.37*/.Assets.versioned("NumPad-master/dist/jquery.ui.pinpad.css")),format.raw/*12.97*/("""">
<link rel="stylesheet" href=""""),_display_(/*13.31*/routes/*13.37*/.Assets.versioned("NumPad-master/external/jquery-ui/jquery-ui.css")),format.raw/*13.104*/("""">
<script src=""""),_display_(/*14.15*/routes/*14.21*/.Assets.versioned("NumPad-master/external/jquery/jquery.js")),format.raw/*14.81*/(""""></script>
<script src=""""),_display_(/*15.15*/routes/*15.21*/.Assets.versioned("NumPad-master/external/jquery-ui/jquery-ui.js")),format.raw/*15.87*/(""""></script>
<script src=""""),_display_(/*16.15*/routes/*16.21*/.Assets.versioned("NumPad-master/dist/jquery.ui.pinpad.js")),format.raw/*16.80*/(""""></script>
<script src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.versioned("NumPad-master/dist/jquery.ui.pinpad.extension.js")),format.raw/*17.90*/(""""></script>

<script>
            function myHomeFunction() """),format.raw/*20.39*/("""{"""),format.raw/*20.40*/("""
                """),format.raw/*21.17*/("""var x = document.getElementById('homeTrig');
                if (x.style.visibility === 'hidden') """),format.raw/*22.54*/("""{"""),format.raw/*22.55*/("""
                    """),format.raw/*23.21*/("""x.style.visibility = 'visible';
                """),format.raw/*24.17*/("""}"""),format.raw/*24.18*/(""" """),format.raw/*24.19*/("""else """),format.raw/*24.24*/("""{"""),format.raw/*24.25*/("""
                    """),format.raw/*25.21*/("""x.style.visibility = 'hidden';
                """),format.raw/*26.17*/("""}"""),format.raw/*26.18*/("""
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</script>
<script>
	$(function() """),format.raw/*30.15*/("""{"""),format.raw/*30.16*/("""
		"""),format.raw/*31.3*/("""$("#egg_count").pinpad("""),format.raw/*31.26*/("""{"""),format.raw/*31.27*/("""
			"""),format.raw/*32.4*/("""digitOnly : true
		"""),format.raw/*33.3*/("""}"""),format.raw/*33.4*/(""");
	"""),format.raw/*34.2*/("""}"""),format.raw/*34.3*/(""");
	$(function() """),format.raw/*35.15*/("""{"""),format.raw/*35.16*/("""
		"""),format.raw/*36.3*/("""$("#total_damage").pinpad("""),format.raw/*36.29*/("""{"""),format.raw/*36.30*/("""
			"""),format.raw/*37.4*/("""digitOnly : true
		"""),format.raw/*38.3*/("""}"""),format.raw/*38.4*/(""");
	"""),format.raw/*39.2*/("""}"""),format.raw/*39.3*/(""");

	var date = new Date();

	var cYear = date.getFullYear();
	var cMonth = date.getMonth();
	var cDate = date.getDate();

	$(function() """),format.raw/*47.15*/("""{"""),format.raw/*47.16*/("""
		"""),format.raw/*48.3*/("""$("#datepicker").datepicker("""),format.raw/*48.31*/("""{"""),format.raw/*48.32*/("""
			"""),format.raw/*49.4*/("""dateFormat : "yy-mm-dd",
			maxDate : new Date(cYear, cMonth, cDate)

		"""),format.raw/*52.3*/("""}"""),format.raw/*52.4*/(""");
	"""),format.raw/*53.2*/("""}"""),format.raw/*53.3*/(""");
</script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand">Manual Data Entry</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a onclick="myHomeFunction()"><span style="font-size:35px" class="glyphicon glyphicon-home"></span></a>
				</li>
			</ul>
		</div>
	</nav>
	<center>
		<div class="container">
			<form action=""""),_display_(/*70.19*/routes/*70.25*/.HomeController.manualadd_save()),format.raw/*70.57*/("""" method="POST">
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
				<br> <br> <br>
				<div class="btn-group btn-group-justified" data-toggle="buttons">
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="A1" required><span class="badge">A1</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="A2"><span class="badge">A2</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="A3"><span class="badge">A3</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="A4"><span class="badge">A4</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="3"><span class="badge">3</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="4"><span class="badge">4</span>
					</label>
					 <label class="btn btn-primary"> <input type="radio"
						name="cage" value="5"><span class="badge">5</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="6"><span class="badge">6</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="7"><span class="badge">7</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="8"><span class="badge">8</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="10"><span class="badge">10</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="11"><span class="badge">11</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="12"><span class="badge">12</span>
					</label>
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="B1"><span class="badge">B1</span>
					</label>
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="B2"><span class="badge">B2</span>
					</label>
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="B3"><span class="badge">B3</span>
					</label> 
					<label class="btn btn-primary"> <input type="radio"
						name="cage" value="B4"><span class="badge">B4</span>
					</label>
				</div>

				<br> <br> <input type="text" name="egg_count" id="egg_count" placeholder="TOTAL EGG COUNT"
					class="form-control"> <br> <br> <input
					type="text" name="total_damage" id="total_damage" placeholder="TOTAL DAMAGE COUNT" class="form-control">
				<br> <br> <input type="text" placeholder="Date"
					class="form-control" name="date_time" id="datepicker">
		</div>

		<input type="submit" class="btn btn-default" value="Submit">

		</form>
		</div>
	</center>
	
	        <p style="visibility: hidden; color:white" id="homeTrig">HOME</p>
	
</body>
</html>"""))
      }
    }
  }

  def render(manualRecordForm:Form[ManualRecord]): play.twirl.api.HtmlFormat.Appendable = apply(manualRecordForm)

  def f:((Form[ManualRecord]) => play.twirl.api.HtmlFormat.Appendable) = (manualRecordForm) => apply(manualRecordForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 21 06:37:06 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaFarmApp/app/views/manualadd.scala.html
                  HASH: 8f3d5a5e126cdd3a05b459ecbc58a351597c17f4
                  MATRIX: 964->1|1096->40|1258->176|1272->182|1344->234|1477->341|1491->347|1561->397|1766->575|1781->581|1862->641|1922->674|1937->680|2026->747|2070->764|2085->770|2166->830|2219->856|2234->862|2321->928|2374->954|2389->960|2469->1019|2522->1045|2537->1051|2627->1120|2715->1180|2744->1181|2789->1198|2915->1296|2944->1297|2993->1318|3069->1366|3098->1367|3127->1368|3160->1373|3189->1374|3238->1395|3313->1442|3342->1443|3383->1456|3412->1457|3448->1466|3509->1499|3538->1500|3568->1503|3619->1526|3648->1527|3679->1531|3725->1550|3753->1551|3784->1555|3812->1556|3857->1573|3886->1574|3916->1577|3970->1603|3999->1604|4030->1608|4076->1627|4104->1628|4135->1632|4163->1633|4328->1770|4357->1771|4387->1774|4443->1802|4472->1803|4503->1807|4602->1879|4630->1880|4661->1884|4689->1885|5137->2306|5152->2312|5205->2344
                  LINES: 28->1|33->2|37->6|37->6|37->6|40->9|40->9|40->9|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|51->20|51->20|52->21|53->22|53->22|54->23|55->24|55->24|55->24|55->24|55->24|56->25|57->26|57->26|58->27|58->27|59->28|61->30|61->30|62->31|62->31|62->31|63->32|64->33|64->33|65->34|65->34|66->35|66->35|67->36|67->36|67->36|68->37|69->38|69->38|70->39|70->39|78->47|78->47|79->48|79->48|79->48|80->49|83->52|83->52|84->53|84->53|101->70|101->70|101->70
                  -- GENERATED --
              */
          