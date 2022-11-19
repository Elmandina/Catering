import java.util.Scanner;

public class Event {
    
    public static int nrPjesemarresve;
    public static int totalmin;
    public static double kostoSherbim;
    public static String emer;
    public static String emerPrenotuesi;
    public static int nrKamariereve = 1;
    public static double kostoKamarieri;
    public static double kostoUshqim;
    
    
    public static void event(){
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Fusni emrin e eventit ");
                emer = input.nextLine();
               
            System.out.println("Fusni kredencialet e klientit (Emer - Mbiemer)");
                emerPrenotuesi = input.nextLine();

            System.out.println("Fusni numrin e pjesemarresve ");
                 nrPjesemarresve = input.nextInt();

            System.out.println("\nFusni kohezgjatjen (ne minuta) te parashikuar per eventin");
                 totalmin = input.nextInt();
        }
        
    }


    public static void llogaritje(){
       // nrKamariereve=1;
        int min = Event.totalmin % 60;
        int hrs = Event.totalmin / 60;

        kostoKamarieri = (18.50 * hrs) + (0.40 * min);
        kostoUshqim = 20.70 * Event.nrPjesemarresve;
        if(Event.nrPjesemarresve <= 20){
            nrKamariereve = 1;
            kostoKamarieri = kostoSherbim * nrKamariereve;
        }
        else if((Event.nrPjesemarresve > 20) && (Event.nrPjesemarresve <= 40)){
            nrKamariereve = nrKamariereve + 1;
            kostoSherbim = kostoKamarieri * nrKamariereve;
        }
        else if((Event.nrPjesemarresve > 40) && (Event.nrPjesemarresve <= 60)){
            nrKamariereve =nrKamariereve + 2;
            kostoSherbim = kostoKamarieri * nrKamariereve;
        }
        else if((Event.nrPjesemarresve > 60) && (Event.nrPjesemarresve <= 80)){
            nrKamariereve =nrKamariereve + 3;
            kostoSherbim = kostoKamarieri * nrKamariereve;
        }
        else if((Event.nrPjesemarresve > 80) && (Event.nrPjesemarresve <= 100)){
            nrKamariereve = nrKamariereve + 4;
            kostoSherbim = kostoKamarieri * nrKamariereve;
        }
        else{
            nrKamariereve = nrKamariereve + 5;
            kostoSherbim = kostoKamarieri * nrKamariereve;
        }

        
        

    }
    

}
