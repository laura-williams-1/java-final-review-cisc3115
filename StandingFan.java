public class StandingFan extends Fan implements Pluggable{
    private boolean pluggedIn = false;
    private int voltage = 110;

    @Override
    public boolean plugIn(int num){
        if (num == this.voltage) this.pluggedIn = true;
        this.pluggedIn = false;
        return this.pluggedIn;
    }

    @Override
    public void turnOn(){
       if( pluggedIn ){
           super.turnOn();
       }
    }


}
