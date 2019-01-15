package com.kemesoft.scalajs.mui.core.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait SimplePaletteColorOptions extends js.Object {
    def light: js.UndefOr[String] = js.native
    def main: String = js.native
    def dark: js.UndefOr[String] = js.native
    def contrastText: js.UndefOr[String] = js.native
}

object SimplePaletteColorOptions {
    def apply(light: Option[String] = None,
              main: String,
              dark: Option[String] = None,
              contrastText: Option[String] = None) = {
        val o: Map[String, Any] = Seq(
            light.map("light" -> _),
            Some("main" -> main),
            dark.map("dark" -> _),
            contrastText.map("contrastText" -> _),
        ).flatten.toMap
        o.toJSDictionary.asInstanceOf[js.Object].asInstanceOf[SimplePaletteColorOptions]
    }
}
