import java.util.ArrayList;

public class GarageCar {
    private ArrayList<Auto> masCar=new ArrayList<Auto>();

    public void addCar(Auto m){
        masCar.add(m);
    }

    public void removeCar(Auto m){
        masCar.remove(m);
    }

    public GarageCar (){
    }

    public Boolean findCar(Auto m){
        return masCar.contains(m);
    }

    public GarageCar(ArrayList<Auto> n){
        masCar=n;
    }

    public void printGarage() {
        System.out.println("V garaje: ");
        for (Auto a:masCar){
            System.out.println(" "+a.toString());
            if (a instanceof Car) {
                System.out.println("Eto legkovaya mashina");
                System.out.println();
            }
            if (a instanceof Truck) {
                System.out.println("Eto gruzovaya mashina");
                System.out.println();
            }
        }
    }
}