import java.util.Scanner;
public class Truck extends Auto{
    private String model;
    private int power;
    private Boolean trailer;

    public Truck(){
        super();
        model="";
        power=0;
        trailer=false;
    }

    public Truck(String firma, int speed, String num, String name, int n, Boolean f){
        super(firma,speed,num);
        model=name;
        power=n;
        trailer=f;
    }

    public void setModel(String name){
        model=name;
    }
    public String getModel(){
        return model;
    }

    public void setPower(int n){
        power=n;
    }
    public int getPower(){
        return power;
    }

    public void setTrailer(Boolean b){
        trailer=b;
    }
    public Boolean isTrailer(){
        return trailer;
    }

    public void setAllInfo(){

        Scanner in = new Scanner(System.in);

        System.out.print("Vvedite proizvoditelya gruzovogo auto: ");
        String nazv=in.next();
        setFirm(nazv);

        System.out.print("Vvedite max skorost gruzovogo auto: ");
        int s=in.nextInt();
        setMaxSpeed(s);


        System.out.print("Vvedite gos.nomer gruzovogo auto: ");
        String n=in.next();
        setGosNum(n);

        System.out.print("Vvedite model gruzovogo auto: ");
        model=in.next();

        System.out.print("Vvedite moshnost gruzovogo auto: ");
        power=in.nextInt();

        System.out.print("Vvedite priznak pricepa gruzovogo auto (true/false): ");
        trailer=in.nextBoolean();

        System.out.println();
    }

    public String toString(){
        return "\n\tGruzovik"+"\n\t"+"Firm: "+getFirm()+"\n\t"+"Max skorost: "
                +getMaxSpeed()+ "\n\t"+"Gos.nomer: "+getGosNum()+"\n\t"+"Model: "+model+"\n\t"+"Moshnost: "+power+"\n\t"+"Priznak pricepa: "
                +trailer+"\n";
    }
}
