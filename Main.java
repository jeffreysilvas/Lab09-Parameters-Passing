// PARTNER NAME: 
// PARTNER NAME: 
// CS111 SECTION #: 
// DATE: 
 
public class Main
{
	static final double AVG_HOUSEHOLD_SIZE = 2.57;

	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		double mpg = 21.6;
		double avgMilesDriven = 11398.0;

		double natGasConsumption = 5500;
		double natGasEF = 119.58;

		double fuelOilConsumption = 46;
		double emissionFactorPerGallon = 22.61;

		double monthlyPropaneConsumption = 39;
		double propaneEF = 12.43;

		double monthlyelectricityConsumption = 943;
		double electricityEF = 119.58;
    
		//OUTPUT SECTION
		System.out.println(calcVehicleEmissions(mpg, avgMilesDriven));
		System.out.println(calcNaturalGasEmissions(natGasConsumption, natGasEF));
		System.out.println(calcFuelOilEmissions(fuelOilConsumption, emissionFactorPerGallon));
		System.out.println(calcPropaneEmissions(monthlyPropaneConsumption, propaneEF));
		System.out.println(calcElectricityEmissions(monthlyelectricityConsumption, electricityEF));
		
	}

	/* your methods here */
	public static int calcVehicleEmissions(double mpg, double avgMilesDriven)
	{
		final double CO2_PER_GALLON = 19.6;
		final double NON_CO2_GAS_RATIO = 100 / 98.65;

		double avgVehicleEmissions =  (1 / mpg) * avgMilesDriven * CO2_PER_GALLON * NON_CO2_GAS_RATIO;
		return (int)avgVehicleEmissions;
	}

	public static int calcNaturalGasEmissions(double natGasConsumption, double natGasEF)
	{
		final double GAS_COST = 10.68;

		double natGasEmissions = natGasConsumption / AVG_HOUSEHOLD_SIZE  * GAS_COST / 1000;
		return (int)natGasEmissions;
	}

	public static int calcFuelOilEmissions(double fuelOilConsumption, double emissionFactorPerGallon)
	{
		final double OIL_PRICE = 4.02;
		double fuelOilEmissions = fuelOilConsumption / AVG_HOUSEHOLD_SIZE * OIL_PRICE;
		return (int)fuelOilEmissions;
	}

	public static int calcPropaneEmissions(double monthlyPropaneConsumption, double propaneEF)
	{
		final double PROPANE_PRICE = 2.47;
		double propaneEmissions = monthlyPropaneConsumption / AVG_HOUSEHOLD_SIZE * PROPANE_PRICE;
		return (int)propaneEmissions;
	}

	public static int calcElectricityEmissions(double monthlyElectricityConsumption, double electricityEF)
	{
		final double ELEC_PRICE = 0.1188;
		double electricityEmissions = monthlyElectricityConsumption / AVG_HOUSEHOLD_SIZE * ELEC_PRICE;
		return (int)electricityEmissions;
	}


}