package todoapp

import kotlinx.browser.document
import kotlinx.html.dom.create
import kotlinx.html.h1
import kotlinx.html.js.div
import react.create
import react.dom.client.createRoot
import todoapp.ui.App
import todoapp.ui.welcome.WelcomePage

/**
 * 클라이언트 애플리케이션 진입점(entry point)
 *
 * @author springrunner.kr@gmail.com
 */
fun main() {
    val container = document.getElementById("root") ?: error("Couldn't find root container!")

    createRoot(container = container).render(
        App.create()
    )
}
