public class temperatureConvert {
    public static double[] convertTemperature(double Celsius) {
        double Kelvin = Celsius + 273.15;
        double Fahrenheit = Celsius * 1.80 + 32.00;
        return new double[]{Kelvin, Fahrenheit};
    }

    public static void main(String[] args) {
        double temperatureC = 27;
        double[] result = convertTemperature(temperatureC);
        System.out.println("the temperature in kelvin is: ");
        System.out.println(result[0]);
        System.out.println("the temperature in fahrenheit is: ");
        System.out.println(result[1]);
    }
}
