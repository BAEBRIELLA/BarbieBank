class Conta {
    double saldo;
    int agencia = 42;
    int numero;
    String titular;
    String cpf;
    int cep;
    double salario;
    
    public void deposito(double valor) {
    	this.saldo += valor;
    	
    	}
    
    public boolean saca(Double valor) {
    		if(this.saldo >= valor) {
    			this.saldo -= valor;
    			return true;
    		}else {
    			return false;
    		}
    	}
    
    public boolean transfere(double valor, Conta destino) { 
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.deposito(valor);
    		return true;
    	}
    		return false;
    	}
    }

///babyisyourdream

