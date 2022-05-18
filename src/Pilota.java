public class Pilota extends Thread{
    private static int numero; 
    private int nPilota;
    private int tem;
    private Semaforo spogliatoio;
    private String n;
    private Gara g;
    
    public Pilota(String n,Semaforo spogliatoio){
         
        this.n=n;
        this.spogliatoio=spogliatoio;
        this.nPilota=tem;
        tem++;
        this.n=n;
        g=new Gara();
    }

    public int gettem(){
        return tem;
    }
    public void settem(int tem){
        this.tem=tem;
    }

    public void run(){
        spogliatoio.P();
    
        try{
            Thread.sleep((long)(Math.random()*10));

        }catch(InterruptedException e){
            e.printStackTrace();
        }
        spogliatoio.V();
        
        long start=System.nanoTime();
        for(int i=0;i<15;i++){
            try{
                Thread.sleep((long)(Math.random()*100));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        long stop=System.nanoTime();
        
        settem((int)(stop-start)/1000000);
        
        CompitoC.g.aggiungiRisultati(this);

        spogliatoio.P();

        try{
            Thread.sleep((int)(Math.random())*10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        spogliatoio.V();
    }

}
