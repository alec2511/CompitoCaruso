public class CompitoC {
    protected static int numeroFriend=8;
   protected  static Gara g;

    public static void main(String[] args) throws Exception {
        
     g=new Gara();

     Semaforo spogliatoio=new Semaforo(2);
     
     Pilota p1=new Pilota("alessia",spogliatoio);
     Pilota p2=new Pilota("dfeded",spogliatoio);
     Pilota p3=new Pilota("dddg",spogliatoio);
     Pilota p4=new Pilota("ggvbv",spogliatoio);
     Pilota p5=new Pilota("cffccc",spogliatoio);
     Pilota p6=new Pilota("ddd",spogliatoio);
     Pilota p7=new Pilota("vcvgv",spogliatoio);
     Pilota p8=new Pilota("dfdf",spogliatoio);

    p1.start();
    p2.start();
    p3.start();
    p4.start();
    p5.start();
    p6.start();
    p7.start();
    p8.start();


     }

     
          
      }
    }
}
