package com.moppet;

/**   
 * ≤‚ ‘
 * @Title:  HosSysTest   
 * @since: 1.0.0
 */
import com.moppet.templete.abstractclass.TePprocess;
import com.moppet.templete.concreteclass.Patient;

public class HosSysTest {
	public static void main(String[] args) {
		
		TePprocess te = new Patient();
		te.process();
	}
}