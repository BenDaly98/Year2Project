
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("About Us", user)/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""
	"""),format.raw/*3.2*/("""<h1>About us</h1>
	<h3>We are a new phone selling company, Aiming to take over the phone selling market. We have every new phone on the market and we promise to not dissapoint.</h3>
	<h3>We are highly ambitious, and expect to grow our company so eveyone in the country thinks of us when they need or want a new phone! With over 10 years of knowledge, we have picked up skills and different techniques to continuously provide our customers with jaw dropping prices and top quality services.</h3>
	<h3>We hope you are happy with our service. Please dont hesitate to give any feedback, and enjoy your visit to BestPhones.ie</h3>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 29 13:59:12 IST 2019
                  SOURCE: /home/wdd/Year2project/app/views/about.scala.html
                  HASH: 9b34a32ecf9bb588e3e041c7d55108998b518990
                  MATRIX: 959->1|1079->26|1107->29|1137->51|1176->53|1205->56
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3
                  -- GENERATED --
              */
          