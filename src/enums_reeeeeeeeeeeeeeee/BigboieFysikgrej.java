package enums_reeeeeeeeeeeeeeee;

public class BigboieFysikgrej {
	public static void main(String[] args) {
		double deeep = 10;
		double fluidpressure=0;
		System.out.println(fluidpressure);
	}
	

	public static double fahrenheittocelsius(double fahrenheit) {

		double fahrenheit2 = (fahrenheit - 32) / 1.8;
		return fahrenheit2;

	}

	public static double kelvintocelsius(double kelvin) {
		double celsius = kelvin - 273.15;
		return celsius;
	}

	public static double fluidpressure(fluids_reee fluid, double deep, double fluidpressure) {
		return fluidpressure = fluid.density * 9.82 * deep;
	}
	public static double pressureunderwater(double deep) {
		double pressureunderwater = 997*9.82*deep;
		return pressureunderwater;
	}
	public static double kineticenergy(double mass, double velocity) {
		double kineticenergy =  mass*velocity;
		return kineticenergy;
	}
	public static double potentialenergy(double mass, double height) {
		double potentialenergy = mass*height*9.82;
		return potentialenergy;
	}
	
	// big
}
