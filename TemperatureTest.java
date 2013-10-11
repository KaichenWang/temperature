/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

	private Temperature temperature;
	private double testValue;
	private double resultValue;
	private double expectedConvertedValue;
	private Temperature.Units testUnit;
	private Temperature.Units conversionTestUnit;
	private Temperature.Units resultUnit;

	final double VALUE_PRECISION = 0.0001;
	
	/*
	 * In the following test cases,
	 * negative, positive, boundary (zero), and decimal values are used,
	 * because they cover a wide range of possible temperature values
	 */

	/* ---------------
	Tests for getValue
	--------------- */

	@Test
	public void testGetValueInCelsius () {
		// uses an arbitrary temperature value
		// tests if Celsius as units affects value stored
		testValue = 300;
		testUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		resultValue = temperature.getValue ();
		assertEquals (testValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testGetValueInFahrenheit () {
		// uses an arbitrary temperature value
		// tests if Fahrenheit as units affects value stored
		testValue = 300;
		testUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		resultValue = temperature.getValue ();
		assertEquals (testValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testGetValueInKelvin () {
		// uses an arbitrary temperature value
		// tests if Kelvin as units affects value stored
		testValue = 300;
		testUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		resultValue = temperature.getValue ();
		assertEquals (testValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testGetValueNegative () {
		// uses an arbitrary temperature unit
		// tests if a negative temperature value is properly stored
		testValue = -300;
		testUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		resultValue = temperature.getValue ();
		assertEquals (testValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testGetValueZero () {
		// uses an arbitrary temperature unit
		// tests if a zero value is properly stored
		testValue = 0;
		testUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		resultValue = temperature.getValue ();
		assertEquals (testValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testGetValueDecimal () {
		// uses an arbitrary temperature unit
		// tests if a decimal value is properly stored
		testValue = 0.4567;
		testUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		resultValue = temperature.getValue ();
		assertEquals (testValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testGetValueNegativeDecimal () {
		// uses an arbitrary temperature unit
		// tests if a negative decimal value is properly stored
		testValue = -0.4567;
		testUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		resultValue = temperature.getValue ();
		assertEquals (testValue, resultValue, VALUE_PRECISION);
	}

	/* ---------------
	Tests for getUnits
	--------------- */

	@Test
	public void testGetUnitsCelsius () {
		// uses an arbitrary positive temperature value
		// tests if Celsius as units is properly stored
		testValue = 300;
		testUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		resultUnit = temperature.getUnits();
		assertEquals (testUnit, resultUnit);
	}

	@Test
	public void testGetUnitsFahrenheit () {
		// uses an arbitrary positive temperature value
		// tests if Fahrenheit as units is properly stored
		testValue = 300;
		testUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		resultUnit = temperature.getUnits();
		assertEquals (testUnit, resultUnit);
	}

	@Test
	public void testGetUnitsKelvin () {
		// uses an arbitrary positive temperature value
		// tests if Kelvin as units is properly stored
		testValue = 300;
		testUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		resultUnit = temperature.getUnits();
		assertEquals (testUnit, resultUnit);
	}
	
	@Test
	public void testGetUnitsCelsiusNegative () {
		// uses an arbitrary negative temperature value
		// tests if Celsius as units is properly stored
		testValue = -300;
		testUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		resultUnit = temperature.getUnits();
		assertEquals (testUnit, resultUnit);
	}

	@Test
	public void testGetUnitsFahrenheitNegative () {
		// uses an arbitrary negative temperature value
		// tests if Fahrenheit as units is properly stored
		testValue = -300;
		testUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		resultUnit = temperature.getUnits();
		assertEquals (testUnit, resultUnit);
	}

	@Test
	public void testGetUnitsKelvinNegative () {
		// uses an arbitrary negative temperature value
		// tests if Kelvin as units is properly stored
		testValue = -300;
		testUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		resultUnit = temperature.getUnits();
		assertEquals (testUnit, resultUnit);
	}
	
	/* --------------------
	Tests for changeUnits
	(Celsius to Fahrenheit)
	-------------------- */

	@Test
	public void testChangeUnitsCeliusToFahrenheitPositive () {
		// uses positive celsius temperature value
		// tests conversion of celsius to fahrenheit
		testValue = 300;
		testUnit = Temperature.Units.CELSIUS;
		conversionTestUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 572;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsCeliusToFahrenheitNegative () {
		// uses negative celsius temperature value
		// tests conversion of celsius to fahrenheit
		testValue = -300;
		testUnit = Temperature.Units.CELSIUS;
		conversionTestUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -508;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsCeliusToFahrenheitZero () {
		// uses zero celsius temperature value
		// tests conversion of celsius to fahrenheit
		testValue = 0;
		testUnit = Temperature.Units.CELSIUS;
		conversionTestUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 32;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsCeliusToFahrenheitDecimal () {
		// uses decimal celsius temperature value
		// tests conversion of celsius to fahrenheit
		testValue = 0.4567;
		testUnit = Temperature.Units.CELSIUS;
		conversionTestUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 32.82206;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsCeliusToFahrenheitNegativeDecimal () {
		// uses negative decimal celsius temperature value
		// tests conversion of celsius to fahrenheit
		testValue = -0.4567;
		testUnit = Temperature.Units.CELSIUS;
		conversionTestUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 31.17794;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	/* ------------------
	Tests for changeUnits
	(Celsius to Kelvin)
	------------------ */
	
	@Test
	public void testChangeUnitsCeliusToKelvinPositive () {
		// uses positive celsius temperature value
		// tests conversion of celsius to kelvin
		testValue = 300;
		testUnit = Temperature.Units.CELSIUS;
		conversionTestUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 573.15;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsCeliusToKelvinNegative () {
		// uses negative celsius temperature value
		// tests conversion of celsius to kelvin
		testValue = -300;
		testUnit = Temperature.Units.CELSIUS;
		conversionTestUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -26.85;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsCeliusToKelvinZero () {
		// uses zero celsius temperature value
		// tests conversion of celsius to kelvin
		testValue = 0;
		testUnit = Temperature.Units.CELSIUS;
		conversionTestUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 273.15;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsCeliusToKelvinDecimal () {
		// uses decimal celsius temperature value
		// tests conversion of celsius to kelvin
		testValue = 0.4567;
		testUnit = Temperature.Units.CELSIUS;
		conversionTestUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 273.6067;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsCeliusToKelvinNegativeDecimal () {
		// uses negative decimal celsius temperature value
		// tests conversion of celsius to kelvin
		testValue = -0.4567;
		testUnit = Temperature.Units.CELSIUS;
		conversionTestUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 272.6933;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	/* --------------------
	Tests for changeUnits
	(Fahrenheit to Celsius)
	-------------------- */

	@Test
	public void testChangeUnitsFahrenheitToCeliusPositive () {
		// uses positive fahrenheit temperature value
		// tests conversion of fahrenheit to celsius
		testValue = 300;
		testUnit = Temperature.Units.FAHRENHEIT;
		conversionTestUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 148.8888889;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsFahrenheitToCeliusNegative () {
		// uses negative fahrenheit temperature value
		// tests conversion of fahrenheit to celsius
		testValue = -300;
		testUnit = Temperature.Units.FAHRENHEIT;
		conversionTestUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -184.444444;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsFahrenheitToCeliusZero () {
		// uses zero fahrenheit temperature value
		// tests conversion of fahrenheit to celsius
		testValue = 0;
		testUnit = Temperature.Units.FAHRENHEIT;
		conversionTestUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -17.77778;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsFahrenheitToCeliusDecimal () {
		// uses decimal fahrenheit temperature value
		// tests conversion of fahrenheit to celsius
		testValue = 0.4567;
		testUnit = Temperature.Units.FAHRENHEIT;
		conversionTestUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -17.52405556;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsFahrenheitToCeliusNegativeDecimal () {
		// uses negative decimal fahrenheit temperature value
		// tests conversion of fahrenheit to celsius
		testValue = -0.4567;
		testUnit = Temperature.Units.FAHRENHEIT;
		conversionTestUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -18.0315 ;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
	
	/* -------------------
	Tests for changeUnits
	(Fahrenheit to Kelvin)
	------------------- */

	@Test
	public void testChangeUnitsFahrenheitToKelvinPositive () {
		// uses positive fahrenheit temperature value
		// tests conversion of fahrenheit to kelvin
		testValue = 300;
		testUnit = Temperature.Units.FAHRENHEIT;
		conversionTestUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 422.0388889;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsFahrenheitToKelvinNegative () {
		// uses negative fahrenheit temperature value
		// tests conversion of fahrenheit to kelvin
		testValue = -300;
		testUnit = Temperature.Units.FAHRENHEIT;
		conversionTestUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 88.70555556;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsFahrenheitToKelvinZero () {
		// uses zero fahrenheit temperature value
		// tests conversion of fahrenheit to kelvin
		testValue = 0;
		testUnit = Temperature.Units.FAHRENHEIT;
		conversionTestUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 255.37222; 
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsFahrenheitToKelvinDecimal () {
		// uses decimal fahrenheit temperature value
		// tests conversion of fahrenheit to kelvin
		testValue = 0.4567;
		testUnit = Temperature.Units.FAHRENHEIT;
		conversionTestUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 255.62594;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}

	@Test
	public void testChangeUnitsFahrenheitToKelvinNegativeDecimal () {
		// uses negative decimal fahrenheit temperature value
		// tests conversion of fahrenheit to kelvin
		testValue = -0.4567;
		testUnit = Temperature.Units.FAHRENHEIT;
		conversionTestUnit = Temperature.Units.KELVIN;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 255.1185;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
	
	/* ------------------
	Tests for changeUnits
	(Kelvin to Celsius)
	------------------ */

	@Test
	public void testChangeUnitsKelvinToCelsiusPositive () {
		// uses positive kelvin temperature value
		// tests conversion of kelvin to celsius
		testValue = 300;
		testUnit = Temperature.Units.KELVIN;
		conversionTestUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 26.85;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
	
	@Test
	public void testChangeUnitsKelvinToCelsiusNegative () {
		// uses negative kelvin temperature value
		// tests conversion of kelvin to celsius
		testValue = -300;
		testUnit = Temperature.Units.KELVIN;
		conversionTestUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -573.15;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
	
	@Test
	public void testChangeUnitsKelvinToCelsiusZero () {
		// uses zero kelvin temperature value
		// tests conversion of kelvin to celsius
		testValue = 0;
		testUnit = Temperature.Units.KELVIN;
		conversionTestUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -273.15;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
	
	@Test
	public void testChangeUnitsKelvinToCelsiusDecimal () {
		// uses decimal kelvin temperature value
		// tests conversion of kelvin to celsius
		testValue = 0.4567;
		testUnit = Temperature.Units.KELVIN;
		conversionTestUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -272.6933;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
	
	@Test
	public void testChangeUnitsKelvinToCelsiusNegativeDecimal () {
		// uses negative decimal kelvin temperature value
		// tests conversion of kelvin to celsius
		testValue = -0.4567;
		testUnit = Temperature.Units.KELVIN;
		conversionTestUnit = Temperature.Units.CELSIUS;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -273.6067;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
		
	/* -------------------
	Tests for changeUnits
	(Kelvin to Fahrenheit)
	------------------- */

	@Test
	public void testChangeUnitsKelvinToFahrenheitPositive () {
		// uses positive kelvin temperature value
		// tests conversion of kelvin to fahrenheit
		testValue = 300;
		testUnit = Temperature.Units.KELVIN;
		conversionTestUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = 80.33;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
	
	@Test
	public void testChangeUnitsKelvinToFahrenheitNegative () {
		// uses negative kelvin temperature value
		// tests conversion of kelvin to fahrenheit
		testValue = -300;
		testUnit = Temperature.Units.KELVIN;
		conversionTestUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -999.67;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
	
	@Test
	public void testChangeUnitsKelvinToFahrenheitZero () {
		// uses zero kelvin temperature value
		// tests conversion of kelvin to fahrenheit
		testValue = 0;
		testUnit = Temperature.Units.KELVIN;
		conversionTestUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -459.67;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
	
	@Test
	public void testChangeUnitsKelvinToFahrenheitDecimal () {
		// uses decimal kelvin temperature value
		// tests conversion of kelvin to fahrenheit
		testValue = 0.4567;
		testUnit = Temperature.Units.KELVIN;
		conversionTestUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -458.84794;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
	
	@Test
	public void testChangeUnitsKelvinToFahrenheitNegativeDecimal () {
		// uses negative decimal kelvin temperature value
		// tests conversion of kelvin to fahrenheit
		testValue = -0.4567;
		testUnit = Temperature.Units.KELVIN;
		conversionTestUnit = Temperature.Units.FAHRENHEIT;
		temperature = new Temperature (testValue, testUnit);
		temperature.changeUnits(conversionTestUnit);
		resultValue = temperature.getValue();
		expectedConvertedValue = -460.49206;
		assertEquals (expectedConvertedValue, resultValue, VALUE_PRECISION);
	}
}