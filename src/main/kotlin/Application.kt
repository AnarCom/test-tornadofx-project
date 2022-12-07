import javafx.stage.Stage
import tornadofx.*

class Application: App(MainView::class){
    override fun start(stage: Stage) {
        super.start(stage)
        stage.width = 800.0
        stage.height = 800.0
//        stage.scene.stylesheets.add("index.css")
    }
}