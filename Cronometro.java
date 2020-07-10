import java.util.Timer;
import java.util.TimerTask;

public class Cronometro extends TimerTask{
  
  private Hora h = new Hora (0,24);
  private Minuto m = new Minuto(0,60);
  private Segundo s = new Segundo(0,60);
  private Timer t;

  public Cronometro(){
    this.h = new Hora(0,24);
    this.m = new Minuto(0,60);
    this.s = new Seg(0,60);
  }

  public void run(){
    s.avanzar();
    if(s.getValor()==0){
      m.avanzar();
    if(m.getValor()==0){
      h.avanzar();
    }}
  }

  public void Temporizador(){
    Cronometro tarea = new Cronometro();
    t = new Timer();
    t.scheduleAtFixedRate(tarea,0,1000);
  }

  public String actualizar() {
    String text=String.valueOf(h.getValor()<=9?"0":"")+h.getValor()+":"+(m.getValor()<=9?"0":"")+m.getValor()+":"+(s.getValor()<=9?"0":"")+s.getValor();
    return text;
  }
}