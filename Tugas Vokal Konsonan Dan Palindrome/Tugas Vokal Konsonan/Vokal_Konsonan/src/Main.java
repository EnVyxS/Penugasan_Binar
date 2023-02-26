import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vokal_Konsonan();
    }

    private static void Vokal_Konsonan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String inputan = input.nextLine().toLowerCase();

        int vokal = 0,konsonan = 0,karakter = 0,spasi = 0,koma = 0,titik = 0,tandaSeru = 0,kurungBuka = 0,kurungTutup = 0,
        titik_koma = 0, petik_dua = 0, petik_1 = 0, backslash = 0, slash = 0, titik_dua = 0, hashtag = 0, at = 0;
        int panjang = inputan.length();
        char huruf;
        int ascii_petik1 = 39; //untuk konvert ' karena tidak bisa di masukan di if
        char asciiToChar_petik1 = (char) ascii_petik1;

        int ascii_backslash = 92; //untuk konvert \ karena tidak bisa di masukan di if
        char asciiToChar_backslash = (char) ascii_backslash;


        for(int i = 0; i < panjang; i++) {
             huruf = inputan.charAt(i);

            if(huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u') {
                vokal++;
            } else if(huruf >= 'a' && huruf <= 'z') {
                konsonan++;
            }

            if(Character.isLetterOrDigit(huruf)) {
                karakter++;
            }

            if(huruf == ' ') {
                spasi++;
            }
            else if(huruf == ',') {
                koma++;
            }
            else if(huruf == '.') {
                titik++;
            }
            else if(huruf == '!') {
                tandaSeru++;
            }
            else if(huruf == '(') {
                kurungBuka++;
            }
            else if(huruf == ')') {
                kurungTutup++;
            }
            else if(huruf == ';') {
                titik_koma++;
            }
            else if(huruf == '"') {
                petik_dua++;
            }
            else if(huruf == asciiToChar_petik1) {
                petik_1++;
            }
            else if(huruf == asciiToChar_backslash ) {
                backslash++;
            }
            else if(huruf == '/') {
                slash++;
            }
            else if(huruf == ':') {
                titik_dua++;
            }
            else if(huruf == '#') {
                hashtag++;
            }
            else if(huruf == '@') {
                at++;
            }

        }

        System.out.println("Jumlah Huruf Vokal : " + vokal);
        System.out.println("Jumlah Huruf Konsonan : " + konsonan);
        System.out.println("Jumlah Karakter : " + karakter);
        System.out.println("Panjang Inputan : " + panjang);
        System.out.println("Jumlah Spasi : " + spasi);
        System.out.println("Jumlah Koma : " + koma);
        System.out.println("Jumlah Titik : " + titik);
        System.out.println("Jumlah Tanda Seru : " + tandaSeru);
        System.out.println("Jumlah Kurung Buka : " + kurungBuka);
        System.out.println("Jumlah Kurung Tutup : " + kurungTutup);

        System.out.println("Jumlah Titik Koma : " + titik_koma);
        System.out.println("Jumlah Petik Dua : " + petik_dua);
        System.out.println("Jumlah Petik 1 : " + petik_1);
        System.out.println("Jumlah Backslash : " + backslash);
        System.out.println("Jumlah Slash : " + slash);
        System.out.println("Jumlah Titik 2 : " + titik_dua);
        System.out.println("Jumlah # : " + hashtag);
        System.out.println("Jumlah @ : " + at);
        System.out.println("\n");

        System.out.println("Apakah Anda Ingin Mengulangi ? (Y/N)");
        inputan = input.nextLine().toLowerCase();
        while(true){
            if(inputan.equals("y")){
                Vokal_Konsonan();
            }
            else if(inputan.equals("n")){
                System.out.println("Terimakasih");
                break;
            }
            else{
                System.out.println("Inputan Error Program Terpaksa Berhenti");
                break;
            }
        }
        System.exit(0);
    }
}