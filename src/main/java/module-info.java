module vidmot.fitness {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens vidmot.fitness to javafx.fxml;
    exports vidmot.fitness;
}