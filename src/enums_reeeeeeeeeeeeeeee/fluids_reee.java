package enums_reeeeeeeeeeeeeeee;
	
public enum fluids_reee {
	
	

		H20(0.998, 4.19, 0, 100, 2260), 
		WATER(0.998, 4.19, 0, 100, 2260),
		H2SO4(1.84, 1.38, 10, 336, 511)
		;

		double density;
		double heatCapacity;
		double meltPoint;
		double boilPoint;
		double steamEntalpy;
		
		fluids_reee(double d, double hc, double sp, double bp, double se) {
			density = d * 1E3;
			heatCapacity = hc * 1E3;
			meltPoint = sp;
			boilPoint = bp;
			steamEntalpy = se * 1E3;
		}

	}


