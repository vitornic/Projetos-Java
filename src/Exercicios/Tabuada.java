
public class Tabuada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte mult, tabuada = 1;
		do{
			mult = 1;
			System.out.println("Tabuada do " + tabuada);
			do{
				System.out.println(tabuada + "x" +mult + "=" + tabuada*mult);
				mult++;
			}
			while(mult <= 10);
			tabuada++;
			}
		    while (tabuada < 10);
	}

}
