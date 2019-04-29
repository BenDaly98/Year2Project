
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="icon" type="image/png" href=""""),_display_(/*8.43*/routes/*8.49*/.Assets.versioned("images/favicon.png")),format.raw/*8.88*/("""">
	<style>
	 .footer """),format.raw/*10.11*/("""{"""),format.raw/*10.12*/(""" """),format.raw/*10.13*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*10.71*/("""}"""),format.raw/*10.72*/("""
	 """),format.raw/*11.3*/(""".sidecol """),format.raw/*11.12*/("""{"""),format.raw/*11.13*/(""" """),format.raw/*11.14*/("""font-weight: bold; background-color: black; color: white; """),format.raw/*11.72*/("""}"""),format.raw/*11.73*/("""
	 """),format.raw/*12.3*/(""".sidecol h2 """),format.raw/*12.15*/("""{"""),format.raw/*12.16*/(""" """),format.raw/*12.17*/("""font-weight: bold; """),format.raw/*12.36*/("""}"""),format.raw/*12.37*/("""
	 """),format.raw/*13.3*/(""".midcol h1 """),format.raw/*13.14*/("""{"""),format.raw/*13.15*/(""" """),format.raw/*13.16*/("""text-align: center; font-weight: bold; """),format.raw/*13.55*/("""}"""),format.raw/*13.56*/("""
	 """),format.raw/*14.3*/(""".midcol h3 """),format.raw/*14.14*/("""{"""),format.raw/*14.15*/(""" """),format.raw/*14.16*/("""text-align: center; color: black;)
	</style>
	<title>BestPhones.ie """),_display_(/*16.24*/pagename),format.raw/*16.32*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">BestPhones</a>
		</div>
		<ul class="nav navbar-nav">
		    <li """),_display_(/*25.12*/if(pagename == "Home")/*25.34*/{_display_(Seq[Any](format.raw/*25.35*/("""class="active"""")))}),format.raw/*25.50*/("""><a href=""""),_display_(/*25.61*/routes/*25.67*/.HomeController.index()),format.raw/*25.90*/("""">Home</a></li>
		    <li """),_display_(/*26.12*/if(pagename == "On Sale")/*26.37*/{_display_(Seq[Any](format.raw/*26.38*/("""class="active"""")))}),format.raw/*26.53*/("""><a href=""""),_display_(/*26.64*/routes/*26.70*/.HomeController.onsale()),format.raw/*26.94*/("""">On Sale</a></li>
		    <li """),_display_(/*27.12*/if(pagename == "About Us")/*27.38*/{_display_(Seq[Any](format.raw/*27.39*/("""class="active"""")))}),format.raw/*27.54*/("""><a href=""""),_display_(/*27.65*/routes/*27.71*/.HomeController.about()),format.raw/*27.94*/("""">About us</a></li>
		    <li """),_display_(/*28.12*/if(pagename == "Log In")/*28.36*/{_display_(Seq[Any](format.raw/*28.37*/("""class="active"""")))}),format.raw/*28.52*/(""">
				"""),_display_(/*29.6*/if(user != null)/*29.22*/ {_display_(Seq[Any](format.raw/*29.24*/("""
					"""),format.raw/*30.6*/("""<a href=""""),_display_(/*30.16*/routes/*30.22*/.LoginController.logout()),format.raw/*30.47*/("""">Log Out</a>
				""")))}/*31.7*/else/*31.12*/{_display_(Seq[Any](format.raw/*31.13*/("""
					"""),format.raw/*32.6*/("""<a href=""""),_display_(/*32.16*/routes/*32.22*/.LoginController.login()),format.raw/*32.46*/("""">Log In</a>
				""")))}),format.raw/*33.6*/("""					
			"""),format.raw/*34.4*/("""</li>
		</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>FLASH SALE</h2>
			<h3>Switch to Bill-Pay and Save 35%!</h3>
			</p>Switch to bill pay today and and save 35% on the first 6 months of your contract on selected phones. **LIMITED TIME ONLY** </p>		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
                """),_display_(/*49.18*/content),format.raw/*49.25*/("""
            """),format.raw/*50.13*/("""</div>
		</div>
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>1st birthday of Best Phones</h3>
			<p>Switch to bill pay today and and save 35% on the first 6 months of your contract on selected phones. **LIMITED TIME ONLY**</p>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			<h5>Website created by Ben Daly, Lubo Kitov, Liam Yambao.</h5>
		    </div>
		</div>
	    </div>
	</div>
	<script src=""""),_display_(/*68.16*/routes/*68.22*/.Assets.versioned("javascripts/main.js")),format.raw/*68.62*/(""""></script>
    </body>
</html>


	 """),format.raw/*73.3*/("""}"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 29 13:59:12 IST 2019
                  SOURCE: /home/wdd/Year2project/app/views/main.scala.html
                  HASH: bb919f8c1f192d5e9795d9209a7f89ae57801b2f
                  MATRIX: 970->1|1122->60|1423->335|1437->341|1496->380|1546->402|1575->403|1604->404|1690->462|1719->463|1749->466|1786->475|1815->476|1844->477|1930->535|1959->536|1989->539|2029->551|2058->552|2087->553|2134->572|2163->573|2193->576|2232->587|2261->588|2290->589|2357->628|2386->629|2416->632|2455->643|2484->644|2513->645|2608->713|2637->721|2902->959|2933->981|2972->982|3018->997|3056->1008|3071->1014|3115->1037|3169->1064|3203->1089|3242->1090|3288->1105|3326->1116|3341->1122|3386->1146|3443->1176|3478->1202|3517->1203|3563->1218|3601->1229|3616->1235|3660->1258|3718->1289|3751->1313|3790->1314|3836->1329|3869->1336|3894->1352|3934->1354|3967->1360|4004->1370|4019->1376|4065->1401|4102->1421|4115->1426|4154->1427|4187->1433|4224->1443|4239->1449|4284->1473|4332->1491|4368->1500|4835->1940|4863->1947|4904->1960|5435->2464|5450->2470|5511->2510|5574->2546
                  LINES: 28->1|33->2|39->8|39->8|39->8|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|47->16|47->16|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|63->32|64->33|65->34|80->49|80->49|81->50|99->68|99->68|99->68|104->73
                  -- GENERATED --
              */
          