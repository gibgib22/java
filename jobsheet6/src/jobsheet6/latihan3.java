package jobsheet6;
    import java.io.Console;
public class latihan3 {
    public static void main (String [] args){
        String nama;
        int usia;
        String alamat;
        
        Console con = System.console();
        
        System.out.print("inputkan nama anda: ");
        nama = con.readLine();
        System.out.print("inputkan usia: ");
        usia = Integer.parseInt(con.readLine());
        System.out.print("inputkan alamat anda: ");
        alamat = con.readLine();
        
        System.out.println("nama kamu adalah: " +nama);
        System.out.println("saat ini berusia: " +usia+ "tahun");
        System.out.println("alamat kamu berada di: " +alamat);
        
    }
}
