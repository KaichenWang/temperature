/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

	// Add multiple tests to check all functions of
	// {@Code Temperature} class.

	private Temperature temperature;
	private double testValue;
	private double resultValue;
	private Temperature.Units testUnit;
	private Temperature.Units conversionTestUnit;
	private Temperature.Units resultUnit;

	final double ERROR = 0.1;

	@Before
	public void setUp () throws Exception {	
		System.out.println("-TEST");
	}

	//Tests for getValue
	@Test
	public void testGetValue1 () {
		this.testValue = 15;
		this.testUnit = Temperature.Units.KELVIN;
		this.temperature = new Temperature (this.testValue, this.testUnit);
		this.resultValue = this.temperature.getValue ();
		assertEquals (this.testValue, this.resultValue, ERROR);
	}

	//Tests for getUnits
	@Test
	public void testGetUnits1 () {
		this.testValue = 15;
		this.testUnit = Temperature.Units.FAHRENHEIT;
		this.temperature = new Temperature (this.testValue, this.testUnit);
		this.resultUnit = this.temperature.getUnits();
		assertEquals(this.testUnit, this.resultUnit);
	}

	//Tests for changeUnits
	@Test
	public void testChangeUnits1 () {
		this.testValue = 0;
		this.testUnit = Temperature.Units.FAHRENHEIT;
		this.conversionTestUnit = Temperature.Units.CELSIUS;
		this.temperature = new Temperature (this.testValue, this.testUnit);
		this.temperature.changeUnits(conversionTestUnit);
		this.resultUnit = this.temperature.getUnits();
		assertEquals(this.conversionTestUnit, this.resultUnit);
	}
}