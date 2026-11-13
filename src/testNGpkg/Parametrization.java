package testNGpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	
	@Parameters("Vi")
	@Test
	public void main(String V) {
		System.out.println("value is :"+V);

}
}