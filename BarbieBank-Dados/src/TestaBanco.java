
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente kitty = new Cliente();
		kitty.nome = "Ariana Grande";
		kitty.cpf = "222.222.222-22";
		kitty.profissao = "deusa";
		
		Conta contadakitty = new Conta();
		contadakitty.deposito(100);
		
		contadakitty.titular = kitty;
		
		System.out.println(contadakitty.titular.nome);
	}

}

///babyisyourdream