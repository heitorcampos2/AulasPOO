public class Conta {
    
    //Criando os atributos
    double saldo;
    String numero;
    String titular;
    String agencia;
    boolean sacar;
    //cria metodo
        void depositar(double valor){
            this.saldo += valor; //this >> atributo da propria classe/ñ é obrigatorio colocar o this->apenas qnd o parametro tem msm nome do tributo
            
        //cria metodo
    boolean sacar(double valor){
        
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        
        return false;
    }
}
