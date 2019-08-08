
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
                    <a class="navbar-brand">CHECKIN | Edit</a>
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
                  DATE: Thu Aug 08 03:40:34 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaApp/play-java-seed/app/views/editcheckin.scala.html
                  HASH: 2344d184e2e005df4cb48caa44538dbab265943b
                  MATRIX: 651->1|1002->30|1130->65|1315->224|1329->230|1399->280|1570->425|1584->431|1652->479|2574->1374|2618->1402|2658->1404|2702->1420|2768->1459|2787->1469|2815->1476|2869->1503|2888->1513|2917->1521|2971->1548|2990->1558|3024->1571|3105->1625|3120->1631|3200->1690|3407->1866|3455->1886
                  LINES: 24->1|29->2|34->3|37->6|37->6|37->6|39->8|39->8|39->8|67->36|67->36|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|73->42|73->42|73->42|80->49|82->51
                  -- GENERATED --
              */
          