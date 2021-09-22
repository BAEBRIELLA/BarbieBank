
public class TestaMetodos {

	public static void main(String[] args) {
		Conta contadababy = new Conta();
		contadababy.saldo = 100;
		contadababy.deposito(50);
		System.out.println(contadababy.saldo);
		boolean ConseguiuRetirar = contadababy.saca ((double) 20);
		System.out.println(contadababy.saldo);
		System.out.println(ConseguiuRetirar);
		
		Conta contadakitty = new Conta();
		contadakitty.deposito(1000);
		
		boolean sucessoTransferencia = 
				contadakitty.transfere(300, contadababy);
		if(sucessoTransferencia) {
			System.out.println("Transferencia feita com sucesso");
		}else {
			System.out.println("Sem valor para a operacao bancaria");
		}
		
		System.out.println(contadakitty.saldo);
		System.out.println(contadababy.saldo);
		
		contadababy.titular = ("Gabriela Barbosa");
		System.out.println(contadababy.titular);
	}
}

///babyisyourdream
