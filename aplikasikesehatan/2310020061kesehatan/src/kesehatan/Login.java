package kesehatan;

import java.util.Scanner;
import java.util.ArrayList;

public class Login {
    ArrayList<Input_User> login = new ArrayList<>();
    public static void main(String[] args) {
        
        String username, password;
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan Username Anda: ");
        username = inputan.nextLine();

        System.out.print("Masukkan Password Anda: ");
        password = inputan.nextLine();

        // Validasi sederhana
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login berhasil! Selamat datang, " + username + "!");
        } else {
            System.out.println("Login gagal! Username atau Password salah.");
        }
    }
}
