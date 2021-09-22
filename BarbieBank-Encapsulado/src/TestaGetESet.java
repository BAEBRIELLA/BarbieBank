
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta Mariah = new Conta (1337,2446);
		Mariah.setNumero(1337);
	    
		System.out.println(Mariah.getNumero());
		
		Cliente doja = new Cliente();
		doja.setNome("Amala Diamani");
		
		Conta.setTitular(doja);
		
	System.out.println(Conta.getTitular().getNome());
	Conta.getTitular().setProfissao("dona do mundo");
	
     System.out.println(doja);
     System.out.println(Conta.getTitular());
	
	}

}


///babyisyourdream