// Program ini dibuat oleh kelompok 100

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu = -1;

        Set<String> listMenu = new HashSet<>();

        while (menu != 0) {

            System.out.println("\nMenu Aplikasi\n==========");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Hapus Pesanana");
            System.out.println("3. Tampilkan Pesanan");
            System.out.println("4. Keluar\n");
            System.out.print("Pilih menu : ");

            menu = in.nextInt();
            switch (menu){
                case 1:
                    System.out.print("\nMasukkan nama menu yang ingin ditambah: ");
                    String namaMenu = in.next();
                    listMenu.add(namaMenu);
                    break;

                case 2:
                    System.out.print("\nMasukkan nama menu yang inin dihapus: ");
                    String namaMenuDihapus = in.next();
                    listMenu.remove(namaMenuDihapus);
                    break;

                case 3:
                    System.out.println("\nTampilkan pesanan");
                    System.out.println("==================");

                    for (Iterator it = listMenu.iterator(); it.hasNext(); ) {
                        System.out.println("Menu Dipesan : "+it.next());
                    }

                    break;

                case 4:
                    System.out.println("Exit");
                    menu = 0;
                    break;

                    default:
                        System.out.println("Menu tidak tersedia");
                        break;
            }
        }
    }
}