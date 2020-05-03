public class testGarage {
    public static void main(String[] args) {
        GarageCar myGarage = new GarageCar();

        Car myCar1=new Car("Toyota", 180, "x777xx", "Mark2",4,false);

        myGarage.addCar(myCar1);

        myGarage.addCar(new Car("UAZ", 160,"c666cc", "Patriot", 4, true));

        Truck myTruck=new Truck("Volvo",200,"a999aa","FH16",700,true);

        myGarage.addCar(myTruck);

        myGarage.printGarage();

        if (myGarage.findCar(myCar1)) {
            System.out.println("Da");
        }
        else {
            System.out.println("Net");
        }

        System.out.println();
        System.out.println("Garaj posle udaleniya pervoi mashini");
        myGarage.removeCar(myCar1);
        myGarage.printGarage();
    }
}