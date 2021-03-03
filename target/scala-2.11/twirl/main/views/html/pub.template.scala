
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pub_Scope0 {
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

class pub extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[pub_info,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pubMetadata: pub_info):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<body>

<table border="1">
    <tr>
        <th>pub_info ID</th>
        <th>Title</th>
        <th>Metadata</th>
    </tr>

    <tr>
        <td>"""),_display_(/*15.14*/pubMetadata/*15.25*/.pid),format.raw/*15.29*/("""</td>
        <td>"""),_display_(/*16.14*/pubMetadata/*16.25*/.Title),format.raw/*16.31*/("""</td>
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

</table>
</body>
</html>"""))
      }
    }
  }

  def render(pubMetadata:pub_info): play.twirl.api.HtmlFormat.Appendable = apply(pubMetadata)

  def f:((pub_info) => play.twirl.api.HtmlFormat.Appendable) = (pubMetadata) => apply(pubMetadata)

  def ref: this.type = this

}


}

/**/
object pub extends pub_Scope0.pub
              /*
                  -- GENERATED --
                  DATE: Tue Mar 02 11:41:59 CST 2021
                  SOURCE: /Users/huasucaster/Desktop/CS Master/CS7340/Lab2/Lab-2-backend/app/views/pub.scala.html
                  HASH: 61359dce772c73e81ae40f2ca10c0d00b5bc1c89
                  MATRIX: 743->1|861->24|889->26|1086->196|1106->207|1131->211|1177->230|1197->241|1224->247|1270->266|1290->277|1317->283|1363->302|1383->313|1411->320|1457->339|1477->350|1510->362|1556->381|1576->392|1605->400|1651->419|1671->430|1698->436|1744->455|1764->466|1788->469|1834->488|1854->499|1883->507|1929->526|1949->537|1979->546|2025->565|2045->576|2074->584|2120->603|2140->614|2172->625|2218->644|2238->655|2266->662|2312->681|2332->692|2364->703|2410->722|2430->733|2461->743|2507->762|2527->773|2553->778|2599->797|2619->808|2647->815|2693->834|2713->845|2744->855
                  LINES: 27->1|32->1|34->3|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32
                  -- GENERATED --
              */
          