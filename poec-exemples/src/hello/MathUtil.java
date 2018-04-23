package hello;

public class MathUtil {
	
	/** 
	 * @param a
	 * @param b
	 * @return
	 * @throws Exception if b == 0;
	 */
	public static int divide(int a, int b) throws Exception {
		if(b == 0) {
			//throw new IllegalArgumentsException("b must be != 0"); uncheked exceptio
			throw new Exception("b must be !=0");// checked exception
		}
		return a / b;
	}

}
