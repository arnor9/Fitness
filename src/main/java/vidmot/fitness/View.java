package vidmot.fitness;

public enum View {
    LOGIN("login-view.fxml"),
    MAIN("main-view.fxml"),
    MUSCLES("muscles-view.fxml"),
    RUNNING("running-view.fxml"),
    WEIGHTLOSS("weightloss-view.fxml"),
    YOGA("yoga-view.fxml"),
    ENERGY("energywalk-view.fxml"),
    STRETCH("stretch-view.fxml"),
    WARMUP("warmup-view.fxml"),
    RUN("run-view.fxml");

    private String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
