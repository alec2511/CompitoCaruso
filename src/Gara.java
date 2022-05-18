import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Gara {
  public ArrayList<Pilota> riscontro;
  
  public Gara(){
      riscontro=new ArrayList<>();
  }
  public static class classifica implements Comparator<Pilota>{
      public int compare(Pilota p1,Pilota p2){
          int t=0;
          t=p1.gettem()-p2.gettem();
          return t;
      }
   
  }
  synchronized public void aggiungiRisultati(Pilota p){
      riscontro.add(p);
      if(riscontro.size()==0){
        Collections.sort(riscontro,new Gara.classifica());
       for(int i=0;i<8;i++){
           System.out.println("posizione"+(i+1)+riscontro.get(i).getName()+"tempo"+riscontro.get(i).gettem()+"ms");
       }
    }
  }

}

