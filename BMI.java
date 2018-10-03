
public class BMI{
    public static void main (String [] args){
        
        //(int)(Math.random() * ((max - min) + 1)) + min
        double weightKg = (int) (Math.random() * ((110 - 50) + 1)) + 50;
        double heightM = (int) (Math.random() * ((2.0 - 1.3) + 1)) + 1.3;
        double bmi = (weightKg) / ((int)Math.pow(heightM, 2));
        
        System.out.println ("Weight in Kgs = " + weightKg);
        System.out.println ("Height in Meters = " + heightM);
        System.out.println (" BMI = " + bmi);
        
        }
    }