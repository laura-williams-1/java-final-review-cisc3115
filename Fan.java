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

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    void setColor(String color){
        this.color = color;
    }
    public void turnOn(){
        this.on = true;
    }
    public void turnOff(){
        this.on = false;
    }
    @Override
    public boolean equals(Fan f) {
        return this.speed == f.speed && this.on == f.on &&
                this.radius == f.radius && this.color.equals(f.color);
    }
    @Override
    public String toString() {
        return "Fan[speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
    }

    public static Fan read(java.util.Scanner sc) {
        int speed = sc.nextInt();
        boolean on = sc.nextBoolean();
        double radius = sc.nextDouble();
        String color = sc.next();
        return new Fan(speed, on, radius, color);
    }



}
