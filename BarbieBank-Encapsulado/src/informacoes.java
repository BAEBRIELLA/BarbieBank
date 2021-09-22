class Conta {
    private double saldo;
    private int agencia = 42;
    private int numero;
    private static Cliente titular;
    double salario;
    private static int total; //statis e da classe, nao use pra objetos
    
    public Conta( int agencia, int numero) { 
    	total++;
    	System.out.println("o total de contas e " + total );
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma conta " + this.numero);
        System.out.println("estou criando uma agencia " + this.agencia);
    }//construtor 
    
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
    

    public double pegaSaldo() {
    	return this.saldo;
    	
    }
    	
    	  public int getNumero() { 
    	        return this.numero;
    	    }

    	    public void setNumero(int numero) { 
    	    	if (numero <= 0 ) {
    	    		System.out.println("nao pode valor <= 0");
    	    		return;
    	    	}
    	        this.numero = numero; // a pesar dos dois serem numeros, um e atributo o outro variavel baby, don`t forget
    	    }
    	    
    	    public int getAgencia() {
				return this.agencia;
			}
    	    
    	    public void setAgencia(int agencia) {
    	    	if(agencia <= 0 ) {
    	    		System.out.println("nao pode valor menor a 0");
    	    		return;
    	    	}
				this.agencia = agencia;
			}
    	    
    	    public static void setTitular(Cliente titular) {
				Conta.titular = titular; // a pesar dos dois serem titular, um e atributo o outro variavel baby, don`t forget
			}
    	    
    	    public static Cliente getTitular() {
				return titular;
			}
    	    
    	    public static int getTotal () {
    	    	return Conta.total;
    	    }
    	}


///babyisyourdream

