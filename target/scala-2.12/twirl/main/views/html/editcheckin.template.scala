
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
/*1.2*/import models.CheckinRecord

object editcheckin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[CheckinRecord],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(checkinList: List[CheckinRecord]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<html><head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("css/bootstrap_checkin.min.css")),format.raw/*6.95*/("""">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js" type="text/javascript"></script>
        <script src=""""),_display_(/*8.23*/routes/*8.29*/.Assets.versioned("js/bootstrap_checkin.min.js")),format.raw/*8.77*/("""" type="text/javascript"></script>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand">CHECKIN | Delete</a>
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
            <div class="col-md-auto">
            	<table class="table table-hover">
            		<thead>
            			<th scope="col">UID</th>
            			<th scope="col">CAGE</th>
            			<th scope="col">DATE-TIME</th> 		
            		</thead>
            		<tbody>
            			"""),_display_(/*36.17*/for(checkinRow<-checkinList) yield /*36.45*/ {_display_(Seq[Any](format.raw/*36.47*/("""
            			"""),format.raw/*37.16*/("""<tr sccope="row">
            				<td>"""),_display_(/*38.22*/checkinRow/*38.32*/.getUid),format.raw/*38.39*/("""</td>
            				<td>"""),_display_(/*39.22*/checkinRow/*39.32*/.getCage),format.raw/*39.40*/("""</td>
            				<td>"""),_display_(/*40.22*/checkinRow/*40.32*/.getDate_time),format.raw/*40.45*/("""</td>
            				<td>
            					<a href=""""),_display_(/*42.28*/routes/*42.34*/.HomeController.delete_checkin_row(checkinRow.getDate_time)),format.raw/*42.93*/("""">
            					<i class="glyphicon glyphicon-trash"></i>
            					</a>
            				</td>
            				
            			</tr>
            			
            			""")))}),format.raw/*49.17*/("""
    
            		"""),format.raw/*51.15*/("""</tbody>
            		<tfoot>
            			<tr scope="row">
            			</tr>
            			
            		</tfoot>
                
            </div>
        </center>
    

</body></html>"""))
      }
    }
  }

  def render(checkinList:List[CheckinRecord]): play.twirl.api.HtmlFormat.Appendable = apply(checkinList)

  def f:((List[CheckinRecord]) => play.twirl.api.HtmlFormat.Appendable) = (checkinList) => apply(checkinList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 14 11:32:45 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaFarmApp/app/views/editcheckin.scala.html
                  HASH: b8a9942a89cb448f76072e82fc23a35dc1fb2f68
                  MATRIX: 651->1|1002->30|1130->65|1315->224|1329->230|1399->280|1570->425|1584->431|1652->479|2576->1376|2620->1404|2660->1406|2704->1422|2770->1461|2789->1471|2817->1478|2871->1505|2890->1515|2919->1523|2973->1550|2992->1560|3026->1573|3107->1627|3122->1633|3202->1692|3409->1868|3457->1888
                  LINES: 24->1|29->2|34->3|37->6|37->6|37->6|39->8|39->8|39->8|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|73->42|73->42|73->42|80->49|82->51
                  -- GENERATED --
              */
          