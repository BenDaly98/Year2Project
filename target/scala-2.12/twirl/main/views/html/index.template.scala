
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Home", user)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
	"""),format.raw/*3.2*/("""<h1>Welcome to Best Phones</h1>
	<h3>The place where you can buy the best phones on the market at an unbeatable price!</h3>
	<div class="col-sm-4">
	</div>
	<div class="col-sm-5">
	<img src="https://i-cdn.phonearena.com/images/article/108802-two_lead/All-the-cool-new-iPhone-XS-Max-and-XR-features-you-mightve-missed.jpg" alt="iPhone" style="width:450px;height:480px;" class="centre" >   
	</div>
""")))}),format.raw/*10.2*/("""

"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 29 14:22:42 IST 2019
                  SOURCE: /home/wdd/Year2project/app/views/index.scala.html
                  HASH: 12a8cfd9f264a9255a29e52d4e04e8d2891f9a55
                  MATRIX: 959->1|1079->26|1107->29|1133->47|1171->48|1200->51|1635->456
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|42->10
                  -- GENERATED --
              */
          