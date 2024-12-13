module ma.ensa.javaproject.controlejava {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    opens ma.ensa.javaproject.controlejava to javafx.fxml;
    exports ma.ensa.javaproject.controlejava;
    exports ma.ensa.javaproject.controlejava.DAO;
    opens ma.ensa.javaproject.controlejava.DAO to javafx.fxml;
    exports ma.ensa.javaproject.controlejava.Controller;
    opens ma.ensa.javaproject.controlejava.Controller to javafx.fxml;
}