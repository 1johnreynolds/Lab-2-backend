
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

class publist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Publication],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pubList: List[models.Publication]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<body>

<table border="1">
    <tr>
        <th>Publication ID</th>
        <th>Title</th>
        <th>Metadata</th>
    </tr>
    """),_display_(/*13.6*/for(pubMetadata <- pubList) yield /*13.33*/ {_display_(Seq[Any](format.raw/*13.35*/("""
    """),format.raw/*14.5*/("""<tr>
        <td>"""),_display_(/*15.14*/pubMetadata/*15.25*/.pid),format.raw/*15.29*/("""</td>
        <td>"""),_display_(/*16.14*/pubMetadata/*16.25*/.Title),format.raw/*16.31*/("""</td>
        <td>"""),_display_(/*17.14*/pubMetadata/*17.25*/.Metadata),format.raw/*17.34*/("""</td>
    </tr>
    """)))}),format.raw/*19.6*/("""
"""),format.raw/*20.1*/("""</table>
</body>
</html>"""))
      }
    }
  }

  def render(pubList:List[models.Publication]): play.twirl.api.HtmlFormat.Appendable = apply(pubList)

  def f:((List[models.Publication]) => play.twirl.api.HtmlFormat.Appendable) = (pubList) => apply(pubList)

  def ref: this.type = this

}


}

/**/
object publist extends publist_Scope0.publist
              /*
                  -- GENERATED --
                  DATE: Mon Mar 01 21:26:28 CST 2021
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/Back/Lab-2-backend/app/views/publist.scala.html
                  HASH: a3a7f6a8cefe0a566df0ae228542613f3d0417b1
                  MATRIX: 767->1|897->36|925->38|1106->193|1149->220|1189->222|1221->227|1266->245|1286->256|1311->260|1357->279|1377->290|1404->296|1450->315|1470->326|1500->335|1551->356|1579->357
                  LINES: 27->1|32->1|34->3|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|50->19|51->20
                  -- GENERATED --
              */
          