public class Runway{
    public static void main (String [] args) {
         
        //(int)(Math.random() * ((max - min) + 1)) + min
        int takeOffSpeed = (int) (Math.random() * ((180 - 150) + 1)) + 150;
        double acceleration = (int) (Math.random() * ((5 - 3.5) + 1)) + 3.5;
        //Math.pow(i, 2)
        double minimumLength = ((int)Math.pow(takeOffSpeed,2) / (2 * acceleration));
        
        System.out.println ("Take Off Speed = " + takeOffSpeed);
        System.out.println ("Acceleration = " + acceleration);
        System.out.println ("The Minimum Length Of Runway Needed For Take Off = " + minimumLength);
        
    }
}
