
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


<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<script>
	$(function() """),format.raw/*24.15*/("""{"""),format.raw/*24.16*/("""
		"""),format.raw/*25.3*/("""$("#total_count").pinpad("""),format.raw/*25.28*/("""{"""),format.raw/*25.29*/("""
			"""),format.raw/*26.4*/("""digitOnly : true
		"""),format.raw/*27.3*/("""}"""),format.raw/*27.4*/(""");
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/(""");
	$(function() """),format.raw/*29.15*/("""{"""),format.raw/*29.16*/("""
		"""),format.raw/*30.3*/("""$("#total_damage").pinpad("""),format.raw/*30.29*/("""{"""),format.raw/*30.30*/("""
			"""),format.raw/*31.4*/("""digitOnly : true
		"""),format.raw/*32.3*/("""}"""),format.raw/*32.4*/(""");
	"""),format.raw/*33.2*/("""}"""),format.raw/*33.3*/(""");

	var date = new Date();

	var cYear = date.getFullYear();
	var cMonth = date.getMonth();
	var cDate = date.getDate();

	$(function() """),format.raw/*41.15*/("""{"""),format.raw/*41.16*/("""
		"""),format.raw/*42.3*/("""$("#datepicker").datepicker("""),format.raw/*42.31*/("""{"""),format.raw/*42.32*/("""
			"""),format.raw/*43.4*/("""dateFormat : "yy-mm-dd",
			maxDate : new Date(cYear, cMonth, cDate)

		"""),format.raw/*46.3*/("""}"""),format.raw/*46.4*/(""");
	"""),format.raw/*47.2*/("""}"""),format.raw/*47.3*/(""");
</script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand">Manual Data Entry</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="/"><span class="glyphicon glyphicon-home"></span></a>
				</li>
			</ul>
		</div>
	</nav>
	<center>
		<div class="container">
			<form action=""""),_display_(/*64.19*/routes/*64.25*/.HomeController.manualadd_save()),format.raw/*64.57*/("""" method="POST">
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

				<br> <br> <input type="text" name="total_count" id="total_count" placeholder="TOTAL EGG COUNT"
					class="form-control"> <br> <br> <input
					type="text" name="total_damage" id="total_damage" placeholder="TOTAL DAMAGE COUNT" class="form-control">
				<br> <br> <input type="text" placeholder="Date"
					class="form-control" name="date_time" id="datepicker">
		</div>

		<input type="submit" class="btn btn-default" value="Submit">

		</form>
		</div>
	</center>
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
                  DATE: Thu Aug 08 03:40:34 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaApp/play-java-seed/app/views/manualadd.scala.html
                  HASH: 54ffe82b744e4466a8f2423e9745e11aabbcadc7
                  MATRIX: 964->1|1096->40|1258->176|1272->182|1344->234|1477->341|1491->347|1561->397|1766->575|1781->581|1862->641|1922->674|1937->680|2026->747|2070->764|2085->770|2166->830|2219->856|2234->862|2321->928|2374->954|2389->960|2469->1019|2522->1045|2537->1051|2627->1120|2785->1250|2814->1251|2844->1254|2897->1279|2926->1280|2957->1284|3003->1303|3031->1304|3062->1308|3090->1309|3135->1326|3164->1327|3194->1330|3248->1356|3277->1357|3308->1361|3354->1380|3382->1381|3413->1385|3441->1386|3606->1523|3635->1524|3665->1527|3721->1555|3750->1556|3781->1560|3880->1632|3908->1633|3939->1637|3967->1638|4374->2018|4389->2024|4442->2056
                  LINES: 28->1|33->2|37->6|37->6|37->6|40->9|40->9|40->9|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|55->24|55->24|56->25|56->25|56->25|57->26|58->27|58->27|59->28|59->28|60->29|60->29|61->30|61->30|61->30|62->31|63->32|63->32|64->33|64->33|72->41|72->41|73->42|73->42|73->42|74->43|77->46|77->46|78->47|78->47|95->64|95->64|95->64
                  -- GENERATED --
              */
          