public class CeilingFan extends Fan{
    private int numBulbs;
    CeilingFan(int speed, boolean on, double radius, String color, int numBulbs){
        super(speed, on, raidus, color);
        this.numBulbs = numBulbs;
    }
}
