public class Unidades{
  private int limite;
  private int valor;
  
  public void setValor(int valor){
    this.valor=valor;
  }
  public int getValor(){
    return valor;
  }
  public void setLimite(int limite){
    this.limite=limite;
  }
  public int getLimite(){
    return limite;
  }
  
  public Unidades(){
    this.valor=0;
    this.limite=0;
  }

  public Unidades(int valor,int limite){
    this.valor=valor;
    this.limite=limite;
  }

  public int avanzar(){
    valor++;
    if(valor>=limite){
      valor=0;
    }
    return valor;
  }
  
}