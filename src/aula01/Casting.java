package aula01;

public class Casting {

	public static void main(String[] args) {
		byte nubyte = 100;
		short numshort = 2;
		int numint = 333333333;
		long numlong = 444444444;
		float numfloat = 55555555555555555555555555555555555555f;
		double numdouble = 555555555;
		char letrachar = 'p';
		boolean boleana = true;
		//Fazendo o casting
		int numeroint = (int)nubyte;
		float numerofloat = (float)numshort;
		double numerodouble = (double)numint;
		long numerolong = (long)numlong;
		byte numerobyte = (byte)numdouble;
		short numeroshort = (short)numlong;
		System.out.println(numeroint);
		System.out.println(numerofloat);
		System.out.println(numerofloat);
		System.out.println(numerodouble);
		System.out.println(numerolong);
		System.out.println(numerobyte);
		System.out.println(numeroshort);
	}

}
