import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        cek_palindrome();
    }

    private static void cek_palindrome(){
        String kata_ori;
        StringBuilder kebalikan = new StringBuilder();

        System.out.print("Masukan Huruf/Angka Yang Ingin Dicek : ");
        kata_ori = input.nextLine().toLowerCase();
        int panjang = kata_ori.length();
        for(int i = panjang - 1;i >=0; i--){
            kebalikan.append(kata_ori.charAt(i));
        }
        if(kata_ori.equals(kebalikan.toString())){
            System.out.println(kata_ori + " Merupakan Palindrome Dari " + kebalikan);

        }
        else {
            System.out.println(kata_ori + " Bukan Merupakan Palindrome Dari " + kebalikan);
        }
        System.out.print("Ingin Mengulang Pengecekan? : ");
        String ulang = input.nextLine().toLowerCase();
        while(true){
            if(ulang.equals("y")) {
                cek_palindrome();
            }
            else if(ulang.equals("n")){
                System.out.println("Terimakasih");
                break;
            }
            else{
                System.out.println("Inputan Salah Sistem Terpakasa Berhenti");
                break;
            }
        }
        System.exit(0);
    }
}