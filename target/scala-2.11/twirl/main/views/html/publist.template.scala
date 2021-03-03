
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object publist_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class publist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[pub_info],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pubList: List[pub_info]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<body>

<table border="1">
    <tr>
        <th>pub_info ID</th>
        <th>Title</th>
        <th>Metadata</th>
    </tr>
    """),_display_(/*13.6*/for(pubMetadata <- pubList) yield /*13.33*/ {_display_(Seq[Any](format.raw/*13.35*/("""
    """),format.raw/*14.5*/("""<tr>
        <td>"""),_display_(/*15.14*/pubMetadata/*15.25*/.pid),format.raw/*15.29*/("""</td>
        <td>"""),_display_(/*16.14*/pubMetadata/*16.25*/.title),format.raw/*16.31*/("""</td>
        <td>"""),_display_(/*17.14*/pubMetadata/*17.25*/.mdate),format.raw/*17.31*/("""</td>
        <td>"""),_display_(/*18.14*/pubMetadata/*18.25*/.author),format.raw/*18.32*/("""</td>
        <td>"""),_display_(/*19.14*/pubMetadata/*19.25*/.author_list),format.raw/*19.37*/("""</td>
        <td>"""),_display_(/*20.14*/pubMetadata/*20.25*/.editors),format.raw/*20.33*/("""</td>
        <td>"""),_display_(/*21.14*/pubMetadata/*21.25*/.pages),format.raw/*21.31*/("""</td>
        <td>"""),_display_(/*22.14*/pubMetadata/*22.25*/.ee),format.raw/*22.28*/("""</td>
        <td>"""),_display_(/*23.14*/pubMetadata/*23.25*/.pub_url),format.raw/*23.33*/("""</td>
        <td>"""),_display_(/*24.14*/pubMetadata/*24.25*/.pub_year),format.raw/*24.34*/("""</td>
        <td>"""),_display_(/*25.14*/pubMetadata/*25.25*/.journal),format.raw/*25.33*/("""</td>
        <td>"""),_display_(/*26.14*/pubMetadata/*26.25*/.book_title),format.raw/*26.36*/("""</td>
        <td>"""),_display_(/*27.14*/pubMetadata/*27.25*/.volume),format.raw/*27.32*/("""</td>
        <td>"""),_display_(/*28.14*/pubMetadata/*28.25*/.pub_number),format.raw/*28.36*/("""</td>
        <td>"""),_display_(/*29.14*/pubMetadata/*29.25*/.publisher),format.raw/*29.35*/("""</td>
        <td>"""),_display_(/*30.14*/pubMetadata/*30.25*/.isbn),format.raw/*30.30*/("""</td>
        <td>"""),_display_(/*31.14*/pubMetadata/*31.25*/.series),format.raw/*31.32*/("""</td>
        <td>"""),_display_(/*32.14*/pubMetadata/*32.25*/.cross_ref),format.raw/*32.35*/("""</td>
    </tr>
    """)))}),format.raw/*34.6*/("""
"""),format.raw/*35.1*/("""</table>
</body>
</html>"""))
      }
    }
  }

  def render(pubList:List[pub_info]): play.twirl.api.HtmlFormat.Appendable = apply(pubList)

  def f:((List[pub_info]) => play.twirl.api.HtmlFormat.Appendable) = (pubList) => apply(pubList)

  def ref: this.type = this

}


}

/**/
object publist extends publist_Scope0.publist
              /*
                  -- GENERATED --
                  DATE: Tue Mar 02 23:27:31 CST 2021
                  SOURCE: /Users/huasucaster/Desktop/CS Master/CS7340/Lab2/Lab-2-backend/app/views/publist.scala.html
                  HASH: 4f90bfde307ba877e381f386eae6ff57d695c60f
                  MATRIX: 757->1|877->26|905->28|1083->180|1126->207|1166->209|1198->214|1243->232|1263->243|1288->247|1334->266|1354->277|1381->283|1427->302|1447->313|1474->319|1520->338|1540->349|1568->356|1614->375|1634->386|1667->398|1713->417|1733->428|1762->436|1808->455|1828->466|1855->472|1901->491|1921->502|1945->505|1991->524|2011->535|2040->543|2086->562|2106->573|2136->582|2182->601|2202->612|2231->620|2277->639|2297->650|2329->661|2375->680|2395->691|2423->698|2469->717|2489->728|2521->739|2567->758|2587->769|2618->779|2664->798|2684->809|2710->814|2756->833|2776->844|2804->851|2850->870|2870->881|2901->891|2952->912|2980->913
                  LINES: 27->1|32->1|34->3|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|65->34|66->35
                  -- GENERATED --
              */
          