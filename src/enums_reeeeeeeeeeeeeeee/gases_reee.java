package enums_reeeeeeeeeeeeeeee;

public enum gases_reee {
	
	AIR(1.29, 1.01), 
	O2(1.43, 0.92), 
	OXYGEN(1.43, 0.92)
	;

	double density;
	double heatCapacity;

	gases_reee(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}
}
