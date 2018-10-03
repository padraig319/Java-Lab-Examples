public class Pay{
    public static void main (String [] args){
        
        //(int)(Math.random() * ((max - min) + 1)) + min
        double payPerHour = 11.75;
        int hoursWorked = (int)(Math.random() * ((40 - 20) + 1)) + 20;
        double grossPay = (payPerHour * hoursWorked);
        double tax = ((grossPay / 100)* 27);
        double netPay = (grossPay - tax);
        
        System.out.println ("Pay Per Hour Worked = " + payPerHour);
        System.out.println ("Hours Worked = " + hoursWorked);
        System.out.println ("Gross Pay = " + grossPay);
        System.out.println ("Net Pay = " + netPay);
        
    }
}