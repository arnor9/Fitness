module vidmot.fitness {
    requires javafx.controls;
    requires javafx.fxml;
    //requires javafx.web;
    requires javafx.media;
    requires java.desktop;


    opens vidmot.fitness to javafx.fxml;
    exports vidmot.fitness;
}
