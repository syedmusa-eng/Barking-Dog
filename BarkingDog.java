public class BarkingDog {

    //Creating a method
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean value = false;

        //conditions for waking up
        if (hourOfDay < 0 || hourOfDay > 23) {
            value = false;
        } else if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            value = true;
        } else {
            value = false;
        }

        //printing the boolean result to get the message
        System.out.println(value);
        return value;
    }
}
