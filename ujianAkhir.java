import javax.swing.JOptionPane;

public class ujianAkhir {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "-------Selamat Datang DiTempat Dealer Barokah-------");
        JOptionPane.showMessageDialog(null, "=======Tersedia Sepeda Motor======= \n1. Honda CBR 15 : Rp. 2.000.000 \n2. Honda Vario 150 : Rp. 1.500.000 \n3. Honda Vario 160 : Rp. 2.500.000 \n4. Yamaha CR 200 : Rp. 3.500.000 \n5. Yamaha BR 250 : Rp. 4.500.000 \n6. Yamaha AR 190 : Rp. 3.900.000 \n7. Yamaha CBR 300 : Rp. 6.000.000 \n8. Honda Beat 125 : Rp. 2.500.000 \n9. Honda MioJI 100 : Rp. 1.500.000 \n10. Mitsibutsi LM 240 : Rp. 4.500.000 \n11. Honda Supra 125 : Rp. 2.000.000 \n12. Yamaha Astrea 120 : Rp. 2.500.000 \n13. Sepeda Listrik 130 : Rp. 10.000.000");
        int menu = Integer.parseInt(JOptionPane.showInputDialog(
            null, "============Pilihan Menu============ \n" + "\n" +
                    "1. Honda CBR 15 : Rp. 2.000.000 \n" + 
                    "2. Honda Vario 150 : Rp. 1.500.000 \n" + 
                    "3. Honda Vario 160 : Rp. 2.500.000 \n" +
                    "4. Yamaha CR 200 : Rp. 3.500.000 \n" + 
                    "5. Yamaha BR 250 : Rp. 4.500.000 \n" + 
                    "6. Yamaha AR 190 : Rp. 3.900.000 \n" + 
                    "7. Yamaha CBR 300 : Rp. 6.000.000 \n" + 
                    "8. Honda Beat 125 : Rp. 2.500.000 \n" + 
                    "9. Honda MioJI 100 : Rp. 1.500.000 \n" + 
                    "10. Mitsibutsi LM 240 : Rp. 4.500.000 \n" + 
                    "11. Honda Supra 125 : Rp. 2.000.000 \n" +
                    "12. Yamaha Astrea 120 : Rp. 2.500.000 \n" +
                    "13. Sepeda Listrik 130 : Rp. 10.000.000 \n" +
                    "21. ...................Tidak Jadi Beli.................. \n" + "\n" +
                    "========Pilih Sesuai Pilihan Menu======="));
        int a = 2000000;
        int b = 1500000;
        int c = 2500000;
        int d = 3500000;
        int e = 4500000;
        int f = 3900000;
        int g = 6000000;
        int h = 2500000;
        int i = 1500000;
        int j = 4500000;
        int k = 2000000;
        int l = 2500000;
        int m = 10000000;
        int jumlah = 0;
        int total = 0;
        String JawababUser; 
        int bayar = 0;
        int kembalian = 0;
        
        switch (menu) {
            case 1:
            do {  
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null,"Anda Memilih Menu 1 \nHonda CBR 15 Rp. 2.000.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya"));
              total = a*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah=====");
                break;
            case 2:
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 2 \nHonda Vario 150 Rp. 1.500.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = b*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah=====");
                break;      
            case 3: 
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 3 \nHonda Vario 160 Rp. 2.500.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = c*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah=====");
                break;
            case 4:
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 4 \nYamaha CR 200 Rp. 3.500.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = d*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah====="); 
                break;
            case 5:
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 5 \nYamaha BR 250 Rp. 4.500.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = e*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah====="); 
                break;
            case 6:
            do{
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 6 \nYamaha AR 190 Rp. 3.900.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = f*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah=====");  
                break;
            case 7:
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 7 \nYamaha CBR 300 Rp. 6.000.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = g*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah=====");   
                break;
            case 8:
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 8 \nHonda Beat 125 Rp. 2.500.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = h*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah====="); 
                break;
            case 9:
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 9 \nHonda MioJI 100 Rp. 1.500.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = i*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah====="); 
                break;
            case 10:
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 10 \n Mitsibutsi LM 240 Rp. 4.500.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = j*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah====="); 
                break;
            case 11:
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 11 \nHonda Supra 125 Rp. 2.000.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = k*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah====="); 
                break;
            case 12:
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 12 \nYamaha Astrea 120 Rp. 2.500.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = l*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah====="); 
                break;
            case 13:
            do {
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 13 \nSepeda Listrik 130 Rp. 10.000.000 \nBeli Berapa : "));
              JawababUser = JOptionPane.showInputDialog(null, "Apakah Ingin Membeli Lagi? (Ya/Tidak)");
            }while (JawababUser.equalsIgnoreCase("Ya")); 
              total = m*jumlah;
              JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
              bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
              kembalian = bayar-total;
              JOptionPane.showMessageDialog(null, "Uang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=======Nota Pembelian=======" + "\nSepeda Yang Dibeli : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian : Rp. " + kembalian);
              JOptionPane.showMessageDialog(null, "=====Terima Kasih Sudah Membeli Sepeda Motor DiDealer Barokah=====");   
                break;
             default:
             JOptionPane.showMessageDialog(null, "------Terima Kasih Sudah Mampir DiDealer Barokah------");
        }
    }
} 