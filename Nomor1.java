public class Nomor1{
    public static void main(String[] args){
        int jam =1;
        int totaljam =12 ;
        double honorlembur = 0 ;

        totaljam = jam;
        
        if (totaljam <= 16) {
            honorlembur = 160000 + 15000*4;
            System.out.println("honor lembur selama 20 jam adalah" + honorlembur*totaljam );
        }
        else if (totaljam > 16) {
            honorlembur = 10000*12; //perjam
            System.out.println("honor lembur dibawah 12 jam adalah" + honorlembur*totaljam );
            
            
        }
        

    }
}
