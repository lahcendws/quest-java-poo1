package questpoo;

public class Classeroom extends Wilder {

	public Classeroom(String firstName, Boolean aware) {
		super(firstName, aware);
		
	}

	public static void main(String[] args) {
	Wilder wilder1 = new Wilder("rodolf",true);
	Wilder wilder2 = new Wilder("karim",true);
	Wilder wilder3 = new Wilder("jean",false);
	Wilder wilder4 = new Wilder("mambel",false);
	
	Wilder[] table = {wilder1,wilder2,wilder3,wilder4};
	for(int i=0;i < table.length;i++) {
		System.out.println(table[i].whoAmI());
	}
	
	}

}
