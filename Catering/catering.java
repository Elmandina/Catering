public class catering{
   
   public static void main(String[] args) {

        Event.event();    
        Event.llogaritje();
        double totalKosto=Event.kostoSherbim+Event.kostoUshqim;
        double depozita=(25*totalKosto)/100;

        System.out.println("\n===========================Miresevini!==========================");
        System.out.println("\nTipi i eventit: "+ Event.emer);
        System.out.println("Eventi do te organizohet nga: "+Event.emerPrenotuesi);
        System.out.println("Numri i kamariereve: "+Event.nrKamariereve);
        System.out.println("Kostoja per kamarier: Euro "+Event.kostoKamarieri);
        System.out.println("Total kosto per ushqim: Euro "+Event.kostoUshqim);
        System.out.println("Total kosto per sherbim: Euro "+Event.kostoSherbim);
        System.out.println("\n\nTotali i kostos: Euro "+totalKosto);
        System.out.println("Ju lutem depozitoni nje shume prej 25% te kostos totale per te rezervuar eventin.");
        System.out.println("Depozita qe nevojitet eshte: Euro "+depozita);
        System.out.println("\n===================Faleminderit qe na zgjodhet ne!========================");
    }
        
}

