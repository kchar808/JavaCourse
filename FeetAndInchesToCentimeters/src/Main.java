public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double centimeters = inches * 2.54 + ((feet * 12) * 2.54);
        System.out.println((int) feet + " ft and " + (int) inches + " in = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " and " + remainingInches + " inches" );
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
