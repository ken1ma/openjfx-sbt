import scala.util.Properties
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

// followed https://docs.oracle.com/javase/8/javafx/get-started-tutorial/hello_world.htm
// also see https://docs.oracle.com/javase/8/javafx/get-started-tutorial/index.html

class HelloWorld extends Application {
	override def start(primaryStage: Stage) {
		val button = new Button
		button.setText("Hello 世界")
		button.setOnAction(ev => println(s"Hello 世界"))

		val root = new StackPane
		root.getChildren.add(button)

		val scene = new Scene(root, 300, 250)
		primaryStage.setTitle("Hello 世界")
		primaryStage.setScene(scene)
		primaryStage.show
	}
}

object HelloWorld extends App {
	import Properties.{javaVendor, javaVersion, javaVmVendor, javaVmName, javaVmVersion, javaVmInfo, javaHome, osName}
	println(s"javaVendor = $javaVendor, javaVersion = $javaVersion")
	println(s"javaVmVendor = $javaVmVendor, javaVmName = $javaVmName, javaVmVersion = $javaVmVersion, javaVmInfo = $javaVmInfo")

	Application.launch(classOf[HelloWorld], args: _*)
}
