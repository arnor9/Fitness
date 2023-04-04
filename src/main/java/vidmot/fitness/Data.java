package vidmot.fitness;

public class Data {
    private static final Data instance = new Data();

    private String username;
    private String weight;
    private String height;
    private String weightbutton;
    private String musclebutton;

    private Data() {
    }

    public static Data getInstance() {
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getWeightbutton() {
        return weightbutton;
    }

    public String getMusclebutton() {
        return musclebutton;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setWeightbutton(String weightbutton) {
        this.weightbutton = weightbutton;
    }

    public void setMusclebutton(String musclebutton) {
        this.musclebutton = musclebutton;
    }
}
