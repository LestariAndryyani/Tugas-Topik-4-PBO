class Buku{
    private String judul;
    private String pengarang;
    private double harga;

    public Buku(String judul, String pengarang, double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    void setJudul(String judul){
        this.judul = judul;
    }
    void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    void setHarga(double harga){
        this.harga = harga;
    }
    String getJudul(){
        return judul;
    }
    String getPengarang(){
        return pengarang;
    }
    double getHarga(){
        return harga;
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K Rowling", 300000);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000);

        System.out.println("Buku 1 Judul = " +buku1.getJudul()+ "; Pengarang = " + buku1.getPengarang()+ "; Harga = " + buku1.getHarga());
        System.out.println("Buku 2 Judul = " +buku2.getJudul()+ "; Pengarang = " + buku2.getPengarang()+ "; Harga = " + buku2.getHarga());
    }
}
