public class Nomor2{
    public static void main(String[] args){
             

        Scanner scanner = new Scanner(System.in);
        System.err.print("pilih supir : beliau,mereka,kita = "); 
        String Karyawan = scanner.next().toUpperCase();
        double lamatrip ;
        double biayatripsekilo = 13000;

        switch (Karyawan) {
            case "beliau":
                lamatrip = 4;
                break;

            case " mereka":
                lamatrip = 5;
                break;

            case  "kita" :
                lamatrip = 2;
                break;

        
            default:

                break;
        }

    }
}
