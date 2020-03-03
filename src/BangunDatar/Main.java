package BangunDatar;


public class Main {
    public static void main(String[] args){


        Persegi persegi = new Persegi();
        persegi.setSisi(15);
        System.out.println("============================== PERSEGI ==============================");
        System.out.println("Sisi\t\t: " + persegi.getSisi());
        System.out.println("Luas\t\t: " + persegi.Luas());
        //System.out.println("Luas Persegi : " + persegi.Luas(10)); // override
        System.out.println("Keliling\t: " + persegi.Keliling());


        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(14);
        System.out.println("============================== LINGKARAN ==============================");
        System.out.println("Jari Jari\t: " + lingkaran.getR());
        System.out.println("Luas\t\t: " + lingkaran.Luas());
        System.out.println("Keliling\t: " + lingkaran.Keliling());


        PersegiPanjang PP = new PersegiPanjang();
        PP.setLebar(20);
        PP.setPanjang(40);
        System.out.println("============================== PERSEGI PANJANG ==============================");
        System.out.println("Lebar\t\t: " + PP.getLebar());
        System.out.println("Panjang\t\t: " + PP.getPanjang());
        System.out.println("Luas\t\t: " + PP.Luas());
        System.out.println("Keliling\t: " + PP.Keliling());


        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(5);
        segitiga.setTinggi(10);
        System.out.println("============================== SEGITIGA ==============================");
        System.out.println("Alas\t\t: " + segitiga.getAlas());
        System.out.println("Tinggi\t\t: "+ segitiga.getTinggi());
        System.out.println("Luas\t\t: " + segitiga.Luas());
        System.out.println("Keliling\t: " + segitiga.Keliling());


        Kubus kubus = new Kubus();
        kubus.setSisi(20);
        System.out.println("============================== KUBUS ==============================");
        System.out.println("Sisi\t\t: " + kubus.getSisi());
        System.out.println("Volume\t\t: " + kubus.volume());



        Silinder silinder = new Silinder();
        silinder.setR((float)7);
        silinder.setTinggi(10);
        System.out.println("============================== SILINDER ==============================");
        System.out.println("Tinggi\t\t: " + silinder.getTinggi());
        System.out.println("Jari Jari\t: " + silinder.getR());
        System.out.println("Volume\t\t: " + silinder.volume());


        Balok balok = new Balok();
        balok.setPanjang(10);
        balok.setLebar(5);
        balok.setTinggi(20);
        System.out.println("============================== BALOK ==============================");
        System.out.println("Panjang\t\t: " + balok.getPanjang());
        System.out.println("Lebar\t\t: " + balok.getLebar());
        System.out.println("Tinggi\t\t: " + balok.getTinggi());
        System.out.println("Volume\t\t: " + balok.volume());


    }
}
