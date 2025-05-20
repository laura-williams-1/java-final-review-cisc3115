public class CeilingFan extends Fan{
    private int numBulbs;
    CeilingFan(int speed, boolean on, double radius, String color, int numBulbs){
        super(speed, on, radius, color);
        this.numBulbs = numBulbs;
    }

    CeilingFan(){
        super(0,false,0.00,"Unknown");
        this.numBulbs = 0;
    }

    @Override
    public boolean equals(CeilingFan c){
        if (c == null) return false;
        if (c.getClass() != this.getClass()) return false;
        CeilingFan cf = CeilingFan(c); // casting done
        return super.equals(cf) && c.numBulbs == this.numBulbs; // using super equals method and comparing new private instance
        // super.equals already compares the instance fields from fan to the other ceiling fan
    }


}
