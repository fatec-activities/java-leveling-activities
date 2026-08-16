public class UnitConverter {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public double metersToKilometers(double meters) {
        return meters / 1000.0;
    }

    public double kilometersToMeters(double kilometers) {
        return kilometers * 1000.0;
    }

    public double degreesToRadians(double degrees) {
        return degrees * Math.PI / 180.0;
    }

    public double radiansToDegrees(double radians) {
        return radians * 180.0 / Math.PI;
    }
}