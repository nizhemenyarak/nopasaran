public class Car extends Auto {
    private String model;
    private int numDoors;
    private Boolean fullTime;

    public Car() {
        super();
        model = "";
        numDoors = 4;
        fullTime = false;
    }

    public Car(String firma, int speed, String num, String name, int n, Boolean f) {
        super(firma, speed, num);
        this.model = name;
        this.numDoors = n;
        this.fullTime = f;
    }

    public void setModel(String name) {
        this.model = name;
    }

    public String getModel() {
        return model;
    }

    public void setNumDoors(int n) {
        numDoors = n;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setFullTime(Boolean b) {
        this.fullTime = b;
    }

    public Boolean isFullTime() {
        return fullTime;
    }

    public String toString() {
        return getFirm() + " " + getMaxSpeed() + " " + getGosNum() + " " + model + " " + numDoors + " " + fullTime;
    }
}
