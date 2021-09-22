
public class TesteNegativado {
    public static void main(String[] args) {
        Conta Nicki = new Conta();
        Nicki.deposito(100);
        System.out.println(Nicki.saca((double) 200));
        System.out.println(Nicki.saldo);
        
        
        //proibido
        Nicki.saldo = Nicki.saldo - 101;
        System.out.println(Nicki.saldo);
        
    }
}

///babyisyourdream