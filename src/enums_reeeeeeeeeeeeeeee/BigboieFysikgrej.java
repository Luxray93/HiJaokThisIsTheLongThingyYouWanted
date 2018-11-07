package enums_reeeeeeeeeeeeeeee;

public class BigboieFysikgrej {
	public static void main(String[] args) {
		
	}
	

	public static double fahrenheittocelsius(double fahrenheit) {

		double fahrenheit2 = (fahrenheit - 32) / 1.8;
		return fahrenheit2;

	}

	public static double kelvintocelsius(double kelvin) {
		double celsius = kelvin - 273.15;
		return celsius;
	}

	public static double fluidpressure(fluids_reee fluid, double deep) {
		double fluidpressure = fluid.density * 9.82 * deep;
		return fluidpressure;
	}
	public static double pressureunderwater(double deep) {
		double pressureunderwater = 998*9.82*deep;
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
	public static double fallspeed(double height) {
		double fallspeed = 9.82*2*height;
		return fallspeed;
	}
	public static double delta(double first, double last) {
		double delta = first-last;
		return delta;
	}
	public static double volumetomass(fluids_reee fluids, double volume) {
		double volumetomass = fluids.WATER.density*1000*volume;
		return volumetomass;
	}
	public static double volumetomass2(gases_reee gases, double volume) {
		double volumetomass2 = gases_reee.AIR.density*volume;
		return volumetomass2;
	}
	public static double volumetomass3(solids_reee solids, double volume) {
		double volumetomass3 = solids_reee.IRON.density*1000*volume;
		return volumetomass3;
	}
	public static double svtvelocity(double distance, double time) {
		double svtvelocity = distance/time;
		return svtvelocity;
	}
	public static double svtdistance(double velocity, double time) {
		double svtdistance = velocity*time;
		return svtdistance;
	}
	public static double svtime(double distance, double velocity) {
		double svtime = distance/velocity;
		return svtime;
	}
	public static double work(double force, double distance) {
		double work = force*distance;
		return work;
	}
	public static double power(double work, double time) {
		double power = work/time;
		return power;
	}
	public static double heat(solids_reee solids, double mass, double deltaT) {
		double heat = solids.heatCapacity*mass*deltaT;
		return heat;
	}
	
	// big
}



















