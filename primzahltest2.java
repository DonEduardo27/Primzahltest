public class primzahltest2{
	public static void main(String[] args){
	int testzahl;

	System.out.println("wir berechnen primzahlen");
	System.out.print("Welche Zahl wollnse testen?");
	testzahl=Integer.parseInt(System.console().readLine());


	int i=0;
	int n=2;

	while(i%n!=0 && n<=i/2){
		n=n+1;
	}
	if(n>=i/2+1 &&i!=1){
		System.out.println(i+"ist ne Primzahl");
	}
	else System.out.println(i+"in keene Primzahl");
	}
}
