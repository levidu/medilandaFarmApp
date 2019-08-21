
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
        <script>
            function myHomeFunction() """),format.raw/*10.39*/("""{"""),format.raw/*10.40*/("""
                """),format.raw/*11.17*/("""var x = document.getElementById('homeTrig');
                if (x.style.visibility === 'hidden') """),format.raw/*12.54*/("""{"""),format.raw/*12.55*/("""
                    """),format.raw/*13.21*/("""x.style.visibility = 'visible';
                """),format.raw/*14.17*/("""}"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""else """),format.raw/*14.24*/("""{"""),format.raw/*14.25*/("""
                    """),format.raw/*15.21*/("""x.style.visibility = 'hidden';
                """),format.raw/*16.17*/("""}"""),format.raw/*16.18*/("""
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
        """),format.raw/*18.9*/("""</script>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand">CHECKIN | Delete</a>
                </div>
                <ul class="nav navbar-nav">
                    <li>
                        <a  onclick="myHomeFunction()"><span style="font-size:35px" class="glyphicon glyphicon-home"></span></a>
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
            			"""),_display_(/*46.17*/for(checkinRow<-checkinList) yield /*46.45*/ {_display_(Seq[Any](format.raw/*46.47*/("""
            			"""),format.raw/*47.16*/("""<tr sccope="row">
            				<td>"""),_display_(/*48.22*/checkinRow/*48.32*/.getUid),format.raw/*48.39*/("""</td>
            				<td>"""),_display_(/*49.22*/checkinRow/*49.32*/.getCage),format.raw/*49.40*/("""</td>
            				<td>"""),_display_(/*50.22*/checkinRow/*50.32*/.getDate_time),format.raw/*50.45*/("""</td>
            				<td>
            					<a href=""""),_display_(/*52.28*/routes/*52.34*/.HomeController.delete_checkin_row(checkinRow.getDate_time)),format.raw/*52.93*/("""">
            					<i style="font-size:35px" class="glyphicon glyphicon-trash"></i>
            					</a>
            				</td>
            				
            			</tr>
            			
            			""")))}),format.raw/*59.17*/("""
    
            		"""),format.raw/*61.15*/("""</tbody>
            		<tfoot>
            			<tr scope="row">
            			</tr>
            			
            		</tfoot>
                
            </div>
        </center>
       	<p style="visibility: hidden; color:white" id="homeTrig">HOME</p>
        
    

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
                  DATE: Thu Aug 22 03:59:37 IST 2019
                  SOURCE: /Users/levi/Downloads/medilandaFarmApp/app/views/editcheckin.scala.html
                  HASH: 8449b81042db77843f676c9b44b9310c254133ab
                  MATRIX: 651->1|1002->30|1130->65|1315->224|1329->230|1399->280|1570->425|1584->431|1652->479|1770->569|1799->570|1844->587|1970->685|1999->686|2048->707|2124->755|2153->756|2182->757|2215->762|2244->763|2293->784|2368->831|2397->832|2438->845|2467->846|2503->855|3444->1769|3488->1797|3528->1799|3572->1815|3638->1854|3657->1864|3685->1871|3739->1898|3758->1908|3787->1916|3841->1943|3860->1953|3894->1966|3975->2020|3990->2026|4070->2085|4300->2284|4348->2304
                  LINES: 24->1|29->2|34->3|37->6|37->6|37->6|39->8|39->8|39->8|41->10|41->10|42->11|43->12|43->12|44->13|45->14|45->14|45->14|45->14|45->14|46->15|47->16|47->16|48->17|48->17|49->18|77->46|77->46|77->46|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|83->52|83->52|83->52|90->59|92->61
                  -- GENERATED --
              */
          