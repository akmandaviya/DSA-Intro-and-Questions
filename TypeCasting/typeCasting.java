package TypeCasting;

public class typeCasting {
public static void main(String[] args) {
	 byte b = 10;
	 short s = 15;
	 int i = 25;
	 long l = 50;
	 
	 //b=s error as byte is smaller than short
	 b=(byte)s; // no correct as we have specified byte datatype
	 s=b; //no error as short is bigger than byte
	 
	 //s=i;
	 s=(byte)i;
	 
	 //long id bigger than all.
	 l=b;
	 l=s;
	 l=i;
	 
	 b=100;
	 b=125;
	 //b=128; // here error as it out of limit of byte
	 
}
}
