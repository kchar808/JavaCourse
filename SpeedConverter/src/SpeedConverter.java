public class SpeedConverter {

    public static void main(String[] args) {
        toMilesPerHour(-10);
        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long roundedMilesPerHour = Math.round(kilometersPerHour / 1.609);
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return roundedMilesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

}
