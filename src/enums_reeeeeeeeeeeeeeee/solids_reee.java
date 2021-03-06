package enums_reeeeeeeeeeeeeeee;

public enum solids_reee {
	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276)
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double meltEntalpy;
	
	solids_reee(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		meltEntalpy = se * 1E3;
	}
}
