public class Auto {
    private String firm;
    private int maxSpeed;
    private String GosNum;

    public void setFirm(String firma){
        firm=firma;
    }

    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }

    public void setGosNum(String Num){
        GosNum = Num;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public String getFirm(){
        return firm;
    }

    public String getGosNum(){
        return GosNum;
    }


    public Auto(){
        firm="unknown";
        maxSpeed=0;
    }

    public Auto(String firma, int speed, String num){
        firm=firma;
        maxSpeed=speed;
        GosNum = num;
    }
}
