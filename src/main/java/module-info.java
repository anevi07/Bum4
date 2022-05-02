module eus.ehu.bum4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires okhttp3;
    requires com.google.gson;

    opens ui to javafx.fxml;
    exports ui;
    exports Controllers;
    opens Controllers to javafx.fxml;
}