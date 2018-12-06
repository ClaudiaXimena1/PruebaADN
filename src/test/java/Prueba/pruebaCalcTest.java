package Prueba;

import static org.junit.Assert.*;
import org.junit.Test;

public class pruebaCalcTest {

	@Test
	public void calculoMethodTest(){
		pruebaCalc calc = new pruebaCalc();
		int resulcalc = 0;
		resulcalc = calc.calculoMethod(3, 5);
		assertTrue(resulcalc == 8);
	}

}
