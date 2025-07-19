package kesehatan;

import java.util.ArrayList;

public class Input_User {
    ArrayList<Input_User> daftaruser = new ArrayList<>();
    
    private String id_user;
    private String username;
    private String password;

    // Constructor
    public Input_User(String id_user, String username, String password) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
    }

    // Getter
    public String getIdUser() {
        return id_user;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("ID User: " + id_user);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
