public class SUV extends Car{

    public SUV(String name, boolean isManuel) {
        super(name, 4, 4, 6, isManuel, "SUV");
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        /*
         *speed = 0 : gear 1
         * spead
         */
        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        } else if (newSpeed > 30 && newSpeed <= 50) {
            changeGear(4);
        } else if (newSpeed > 50 && newSpeed <= 70) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
