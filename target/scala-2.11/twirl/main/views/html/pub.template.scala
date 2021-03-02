
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

class pub extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Publication,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pubMetadata: Publication):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<body>

<table border="1">
    <tr>
        <th>Publication ID</th>
        <th>Title</th>
        <th>Metadata</th>
    </tr>

    <tr>
        <td>"""),_display_(/*15.14*/pubMetadata/*15.25*/.pid),format.raw/*15.29*/("""</td>
        <td>"""),_display_(/*16.14*/pubMetadata/*16.25*/.Title),format.raw/*16.31*/("""</td>
        <td>"""),_display_(/*17.14*/pubMetadata/*17.25*/.Metadata),format.raw/*17.34*/("""</td>
    </tr>

</table>
</body>
</html>"""))
      }
    }
  }

  def render(pubMetadata:Publication): play.twirl.api.HtmlFormat.Appendable = apply(pubMetadata)

  def f:((Publication) => play.twirl.api.HtmlFormat.Appendable) = (pubMetadata) => apply(pubMetadata)

  def ref: this.type = this

}


}

/**/
object pub extends pub_Scope0.pub
              /*
                  -- GENERATED --
                  DATE: Mon Mar 01 21:26:28 CST 2021
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/Back/Lab-2-backend/app/views/pub.scala.html
                  HASH: 6c4a4e8013a6e60da668b9c1189d5744084afc72
                  MATRIX: 746->1|867->27|895->29|1095->202|1115->213|1140->217|1186->236|1206->247|1233->253|1279->272|1299->283|1329->292
                  LINES: 27->1|32->1|34->3|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17
                  -- GENERATED --
              */
          