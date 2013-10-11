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
  
  @Test
  public void testGetValue () {
	  double desiredValue = 15;
	  Temperature.Units desiredUnit = Temperature.Units.KELVIN;
	  Temperature testTemperature = new Temperature (desiredValue, desiredUnit);
	  double getvalueResult = testTemperature.getValue();
	  assertEquals(desiredValue, getvalueResult, .1);
  }
  
  @Test
  public void testGetUnits () {
	  double desiredValue = 15;
	  Temperature.Units desiredUnit = Temperature.Units.KELVIN;
	  Temperature testTemperature = new Temperature (desiredValue, desiredUnit);
	  Temperature.Units getUnitsResult = testTemperature.getUnits();
	  assertEquals(desiredUnit, getUnitsResult);
  }
}