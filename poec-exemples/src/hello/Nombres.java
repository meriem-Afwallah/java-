package hello;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Nombres {

	public static void main(String[] args) {
		System.out.println("coucou");
		int i0 = 1;
		Integer i1 = new Integer (1);// déprécié, utiliser plutôt valuOf
		i1.parseInt("123");
		Double d1 = new Double(1);
		
		int i2 = Integer.parseInt("123");
		System.out.println(i2);
		// int i3 = Integer.parseInt("123abc"); //exception		
		System.out.println(Integer.toHexString(225));
		System.out.println(Integer.valueOf(225));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
				
		BigInteger bi1 = new BigInteger("1234569000000000000000000000");
		BigInteger bi2 = new BigInteger("1234897522222222222222222222");
		System.out.println(bi1.add(bi2));
		
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		System.out.println(bd1.add(bd2));
		System.out.println(0.1 + 0.2);
		
		System.out.println(Math.cos(1));
		
		System.out.println(Math.random());
		
		Random rand = new Random();
		System.out.println(rand.nextInt(50));
		
		//conversion nombre vers string
		Integer.valueOf(123).toString();
		String.valueOf(123);
		
		//conversion string vers nombre
		Integer.parseInt("123");
	}

}
