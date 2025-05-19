public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    static int FAST;
    static int MEDIUM;
    static int SLOW;
    Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    Fan(){
        this(0,false,0.00,"Unknown");
    }

    public int getSpeed(){
        return this.speed;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public boolean isOn(){
        return on;
    }

}
