
public class TestaValores {

	public static void main(String[] args) {
		Conta Ashley = new Conta (1337, 2446);
		
		//valores Null
		Ashley.setAgencia(-0777);
		Ashley.setNumero(-7777);
		
		Conta Hillary = new Conta (1658, 2488);
		
		System.out.println(Conta.getTotal());
	}
}

///babyisyourdream