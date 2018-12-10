module gui {
	requires javafx.controls;

	// avoid java.lang.IllegalAccessException: class com.sun.javafx.application.LauncherImpl (in module javafx.graphics) cannot access class gui.HelloWorld (in module gui) because module gui does not export gui to module javafx.graphics
	opens gui to javafx.graphics;
}
