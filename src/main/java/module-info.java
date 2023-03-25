module vidmot.fitness {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;


    opens vidmot.fitness to javafx.fxml;
    exports vidmot.fitness;
}
