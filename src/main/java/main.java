import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.SQLOutput;
import java.util.*;

public class main {
    static Scanner input = new Scanner(System.in);
    static Reader inputCr = new InputStreamReader(System.in);

    static ArrayList<Wisata> wisatas = new ArrayList<Wisata>(
            List.of(
                    new Wisata(
                            "Dunia Fantasy Ancol",
                            "Mencari wahana bermain yang enggak jauh dari rumahmu? \nuk Lepas penatmu dengan bermain di Dunia Fantasi (Dufan) Ancol.\nBanyak wahana asyik yang ada di Dufan dan terbagi menjadi empat kategori,\nyakni Children Rides, Family Ride, Water Ride, dan Thrill Ride.",
                            327600,
                            50,
                            "Jakarta"
                    ),
                    new Wisata(
                            "Playtopia Gandaria City",
                            "Wahana di Playtopia Playground\n" +
                                    "\n" +
                                    "Area trampolin\n" +
                                    "Kolam bola\n" +
                                    "Giant plastic bubble\n",
                            125000,
                            10,
                            "Jakarta"
                    ),
                    new Wisata(
                            "Bounce Street Asia Trampoline Park ",
                            "Permukaan arena di sini sudah didesain agar saling berhubungan dengan spons sirkus,\n" +
                                    "pegas, dan kantung udara supaya menjadi alas yang aman dan sempurna untuk\n" +
                                    "berbagai kegiatan trampolin.\n" +
                                    "\n" + "Selain trampolin, ada juga arena lain yang tak kalah menyenangkan,\n" +
                                    "seperti basket, dodgeball, area mendaki, zona lompatan,\n" +
                                    "dan area bermain khusus anak-anak.",
                            130000,
                            5,
                            "Jakarta"
                    ),
                    new Wisata(
                            "Trans Studio Bandung",
                            "Bandung Trans Studio bisa jadi pilihan yang tepat untuk kamu yang\n" +
                                    "memiliki sejumlah wahana asyik yang cocok untuk semua usia. Berlokasi\n" +
                                    "di Jalan Gatot Subroto, ini merupakan pusat perbelanjaan terbesar di Kota Bandung.\n" +
                                    "Objek wisata ini dilengkapi dengan berbagai permainan yang cocok untuk si kecil\n" +
                                    "hingga yang memacu adrenalin.\n" +
                                    "\n" +
                                    "Untuk para remaja atau dewasa muda, Trans Studio Bandung memiliki banyak titik foto menarik\n" +
                                    "yang akan membuat pengalaman belanjamu semakin seru. Selain itu,\n" +
                                    "terdapat bioskop TSM XXI yang dilengkapi berbagai film nasional\n" +
                                    "maupun internasional terbaru",
                            300000,
                            10,
                            "Bandung"
                    ),
                    new Wisata(
                            "Lembang Park And Zoo",
                            "Lembang Park Zoo adalah kebun binatang Lembang yang\n" +
                                    "banyak diminati oleh wisatawan untuk menghabiskan waktu bersama keluarga.\n" +
                                    "Fun fact, kebun binatang ini adalah kebun binatang terbesar di Bandung,\n" +
                                    "lho! Nah, buat kamu yang udah jenuh dengan pemandangan kota yang menyesakkan,\n" +
                                    "Lembang Park Zoo adalah pilihan yang tepat untuk dikunjungi!",
                            100000,
                            7,
                            "Bandung"
                    ),
                    new Wisata(
                            "Kawah Putih",
                            "Liburan ke kawah putih emang cocok banget buat untuk keluarga atau bersama teman-temanmu. Melihat secara langsung keindahan kawah yang spektakuler tentunya bakal jadi pengalaman yang tak terlupakan. Berjarak sekitar 50 kilometer dari selatan Kota Bandung, Kawah Putih merupakan danau yang terletak di kawah gunung berapi yang tidak aktif. Danau ini terkenal akan warnanya yang putih kehijauan.",
                            26000,
                            4,
                            "Bandung"
                    ),
                    new Wisata(
                            "Monkey Forest Ubud",
                            "Jalan-jalan ke Bali belum lengkap rasanya kalau belum ke Ubud Monkey Forest!\nYup, sesuai namanya, tempat ini adalah tempat wisata outdoor yang\nmerupakan pura sekaligus rumah bagi ribuan monyet ekor panjang Bali.\nKamu bisa melihat langsung megahnya pura Hindu yang berusia ratusah tahun ini\nsekaligus berinteraksi langsung dengan monyet-monyet lucu yang sedang saling menyisir,\nmelompat dari satu pohon ke yang lainnya, atau sedang makan di sini.",
                            39000,
                            20,
                            "Bali"
                    ),
                    new Wisata(
                            "Blockbuster Museum",
                            "Kalau kamu pecinta film, sudah pasti kamu bakal suka dengan\nBlockbuster Museum Surabaya! Tempat ini memamerkan berbagai macam figurin\ndan memorabilia karakter-karakter film favoritmu. Properti film-film terkenal juga ada, loh! Mulai dari helm Captain America, pajangan karakter Star Wars: Rogue One, hingga properti dari dunia Harry Potter.",
                            68000,
                            10,
                            "Surabaya"
                    )
            )

    );

    public static void tampilKota(){

        ArrayList<String> listKota = new ArrayList<String>();

        ArrayList<String> kotas = new ArrayList<>();

        for ( Wisata wisata : wisatas
        ) {
            kotas.add(wisata.getKota());
        }

        Set<String> listKotaAll = new LinkedHashSet<>(kotas);

        listKota.clear();
        listKota.addAll(listKotaAll);

        System.out.println("");
        System.out.println("Pilihan Kota");

        for(int i = 0; i < listKota.size(); i++ ){
            System.out.println(i + ". " + listKota.get(i));
        }

        System.out.println("");
        System.out.print("Pilih : ");
        String pilih = listKota.get(input.nextInt());

        ArrayList<Wisata> listWisataNew = new ArrayList<Wisata>(wisatas);

        listWisataNew.removeIf(s -> !s.getKota().contains(pilih));

        for(int i = 0; i < listWisataNew.size(); i++ ){
            System.out.println(i + ". " + listWisataNew.get(i).getName());
        }

        System.out.println("");
        System.out.print("Pilihan : ");
        int pilih2 = input.nextInt();

        System.out.println("");
        System.out.println("");

        System.out.println("====================================================");
        System.out.println("=>   " + wisatas.get(pilih2).getName());
        System.out.println("====================================================");

        System.out.println("Detail Tempat : ");
        System.out.println(wisatas.get(pilih2).getDescription());

        System.out.println("");
        System.out.println("Berada di Kota " + wisatas.get(pilih2).getKota());

        System.out.println("");
        System.out.println("Harga " + "Rp. " + wisatas.get(pilih2).getHarga());

        pesanTiket(wisatas.get(pilih2));


    }

    public static void tampilWisata(){
        ArrayList<String> listName = new ArrayList<>();
        ArrayList<String> destination = new ArrayList<>();

        for ( Wisata wisata : wisatas
        ) {
            destination.add(wisata.getName());
        }

        Set<String> listDestionationAll = new LinkedHashSet<>(destination);

        listName.clear();
        listName.addAll(listDestionationAll);

        System.out.println("");
        System.out.println("List Pilihan Tempat Wisata");

        for(int i = 0; i < listName.size(); i++ ){
            System.out.println(i  + ". " + listName.get(i));
        }

        System.out.println("");
        System.out.print("Pilihan : ");
        int pilih = input.nextInt();

        System.out.println("");
        System.out.println("");

        System.out.println("====================================================");
        System.out.println("=>   " + wisatas.get(pilih).getName());
        System.out.println("====================================================");

        System.out.println("Detail Tempat : ");
        System.out.println(wisatas.get(pilih).getDescription());

        System.out.println("");
        System.out.println("Berada di Kota " + wisatas.get(pilih).getKota());

        System.out.println("");
        System.out.println("Harga " + "Rp. " + wisatas.get(pilih).getHarga());



        pesanTiket(wisatas.get(pilih));
    }

    public static void pesanTiket(Wisata wisata){

        System.out.println("");
        System.out.println("====================================================");
        System.out.println("Stock Tiket Tersedia : "+ wisata.getStock());
        System.out.println("====================================================");

        while(true) {
            System.out.println("");
            System.out.println("");

            System.out.println("Beli tiket ini? \n1. Ya\n2. Tidak");
            System.out.print("Masukan : ");
            int pilih = input.nextInt();

            if (pilih == 1) {

                System.out.println("");

                System.out.print("Masukan Nama Anda : ");
                String name = input.next();

                System.out.print("Masukan Jumlah Tiket : ");
                int in = input.nextInt();

                if(wisata.getStock() < in) {
                    System.out.println("");
                    System.out.println("Maaf Stock Tiket Kurang");
                    continue;
                }

                if (wisata.getStock() <= 0) {
                    System.out.println("");
                    System.out.println("Tiket Habis");
                    break;
                } else {
                    wisata.setStock(wisata.getStock() - in);

                    double totalHarga = wisata.getHarga() * in;


                    System.out.println("");
                    System.out.println("Total Harga Tiket : " + totalHarga);
                    System.out.print("Masukan Jumlah Bayar : ");
                    double jumlahBayar = input.nextInt();

                    double kembalian = jumlahBayar - totalHarga;

                    if(jumlahBayar < totalHarga) {
                        System.out.println("");
                        System.out.println("Maaf Uang Anda Kurang");
                        break;
                    } else {
                        System.out.println("");

                        System.out.println("Tiket Berhasil Dibeli");

                        System.out.println("");
                        System.out.println("====================================================");
                        System.out.println("STRUK PEMBELIAN TIKET");
                        System.out.println("====MUMTAZ WISATA====");
                        System.out.println("====================================================");
                        System.out.println("Tanggal : 1 Juli 2022");
                        System.out.println("Customer : " + name);
                        System.out.println("Tiket Masuk : " + wisata.getName() + " " + in + "x");
                        System.out.println("Harga Tiket " + wisata.getHarga());
                        System.out.println("Harga Total " + totalHarga);
                        System.out.println("Uang Bayar " + jumlahBayar);
                        System.out.println("Uang Kembalian " + kembalian);
                        System.out.println("====================================================");
                        System.out.println("TERIMAKASIH");
                        System.out.println("====================================================");
                        break;
                    }
                }
            } else if (pilih== 2)   {
                break;
            } else {
                System.out.println(("Keyword yang anda masukan tidak ditemukan"));
            }
        }
    }

    public static void searchWisata(){
        System.out.print("Cari :  ");
        String cari = input.next();

        ArrayList<Wisata> listSearch = new ArrayList<Wisata>(wisatas);

        listSearch.removeIf(s -> !s.getName().contains(cari));

        if (listSearch.size() <= 0) {
            System.out.println("Data Tidak Ada");
            return;
        }

        for(int h = 0; h < listSearch.size(); h++){
            System.out.println(h + 1 + ". " + listSearch.get(h).getName());
            System.out.println(listSearch.get(h).getDescription());
            System.out.println(listSearch.get(h).getKota());
            pesanTiket(wisatas.get(h));

        }

    }

    public static void main(String[] args) {

        int menu = 0;

        Scanner getData = new Scanner(System.in);

        System.out.println("\n" +
                "   _____                 __                   __      __.__                __          \n" +
                "  /     \\  __ __  ______/  |______  ________ /  \\    /  \\__| ___________ _/  |______   \n" +
                " /  \\ /  \\|  |  \\/     \\   __\\__  \\ \\___   / \\   \\/\\/   /  |/  ___/\\__  \\\\   __\\__  \\  \n" +
                "/    Y    \\  |  /  Y Y  \\  |  / __ \\_/    /   \\        /|  |\\___ \\  / __ \\|  |  / __ \\_\n" +
                "\\____|__  /____/|__|_|  /__| (____  /_____ \\   \\__/\\  / |__/____  >(____  /__| (____  /\n" +
                "        \\/            \\/          \\/      \\/        \\/          \\/      \\/          \\/ \n");
        System.out.println("Selamat Datang di Mumtaz Wisata");

        while (menu!=4){
            System.out.println("");
            System.out.println("");
            System.out.print("Menu Utama: \n1. List Kota\n2. List Tempat Wisata\n3. Cari\n4. Exit\n Pilih : ");
            menu = input.nextInt();

            if(menu==1){
                tampilKota();
            }else if (menu==2){
                tampilWisata();
            } else if (menu==3){
                searchWisata();
            } else if(menu==4){
                System.out.println("Keluar");
            }else {
                System.out.println("Menu tidak tersedia");
            }
        }
    }
}
