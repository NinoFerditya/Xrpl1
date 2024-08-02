import javax.swing.JOptionPane;

public class prakteknino {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "-------Selamat Datang Di Tempat Dealer Anak Sukses-------");
        JOptionPane.showMessageDialog(null, "=======Tersedia Sepeda Motor======= \n1. Honda CBR 15 : Rp. 2.000.000 \n2. Honda Vario 150 : Rp. 1.500.000 \n3. Honda Vario 160 : Rp. 2.500.000 \n4. Yamaha CR 200 : Rp. 3.500.000 \n5. Yamaha BR 250 : Rp. 4.500.000 \n6. Yamaha AR 190 : Rp. 3.900.000 \n7. Yamaha CBR 300 : Rp. 6.000.000 \n8. Honda Beat 125 : Rp. 2.500.000 \n9. Honda MioJI 100 : Rp. 1.500.000 \n10. Mitsibutsi LM 240 : Rp. 4.500.000 \n11. Honda Supra 125 : Rp. 2.000.000 \n12. Yamaha Astrea 120 : Rp. 2.500.000 \n13. Sepeda Listrik 130 : Rp. 10.000.000");
        
        int jumlah     = 0;
        int total      = 0;
        String JawababUser; 
        int bayar      = 0;
        int kembalian  = 0;

        do{int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "============Pilihan Menu============ \n" + "\n" +"1. Honda CBR 15 : Rp. 2.000.000 \n" + "2. Honda Vario 150 : Rp. 1.500.000 \n" + "3. Honda Vario 160 : Rp. 2.500.000 \n" +"4. Yamaha CR 200 : Rp. 3.500.000 \n" + "5. Yamaha BR 250 : Rp. 4.500.000 \n" + "6. Yamaha AR 190 : Rp. 3.900.000 \n" + "7. Yamaha CBR 300 : Rp. 6.000.000 \n" + "8. Honda Beat 125 : Rp. 2.500.000 \n" + "9. Honda MioJI 100 : Rp. 1.500.000 \n" + "10. Mitsibutsi LM 240 : Rp. 4.500.000 \n" + "11. Honda Supra 125 : Rp. 2.000.000 \n" + "12. Yamaha Astrea 120 : Rp. 2.500.000 \n" + "13. Sepeda Listrik 130 : Rp. 10.000.000 \n" + "\n========Silahkan Dipilih Menu Diatas======="));

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
    
            switch (menu) {
            case 1:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null,"Anda Memilih Menu 1 \nHonda CBR 15 Rp. 2.000.000 \nBeli Berapa : "));
              total = a*jumlah; 
              break;
            case 2:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 2 \nHonda Vario 150 Rp. 1.500.000 \nBeli Berapa : "));
              total = b*jumlah; 
                break;      
            case 3: 
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 3 \nHonda Vario 160 Rp. 2.500.000 \nBeli Berapa : "));
              total = c*jumlah;                            
                break;
            case 4:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 4 \nYamaha CR 200 Rp. 3.500.000 \nBeli Berapa : "));
              total = d*jumlah; 
                break;
            case 5:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 5 \nYamaha BR 250 Rp. 4.500.000 \nBeli Berapa : "));
              total = e*jumlah; 
                break;
            case 6:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 6 \nYamaha AR 190 Rp. 3.900.000 \nBeli Berapa : "));
              total = f*jumlah; 
                break;
            case 7:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 7 \nYamaha CBR 300 Rp. 6.000.000 \nBeli Berapa : "));
              total = g*jumlah; 
                break;
            case 8:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 8 \nHonda Beat 125 Rp. 2.500.000 \nBeli Berapa : "));
              total = h*jumlah; 
                break;
            case 9:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 9 \nHonda MioJI 100 Rp. 1.500.000 \nBeli Berapa : "));
              total = i*jumlah; 
                break;
            case 10:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 10 \n Mitsibutsi LM 240 Rp. 4.500.000 \nBeli Berapa : "));
              total = j*jumlah; 
                break;
            case 11:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 11 \nHonda Supra 125 Rp. 2.000.000 \nBeli Berapa : "));
              total = k*jumlah; 
                break;
            case 12:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 12 \nYamaha Astrea 120 Rp. 2.500.000 \nBeli Berapa : "));
              total = l*jumlah; 
                break;
            case 13:
              jumlah += Integer.parseInt(JOptionPane.showInputDialog(null, "Anda Memilih Menu 13 \nSepeda Listrik 130 Rp. 10.000.000 \nBeli Berapa : "));
              total = m*jumlah; 
                break;
            case 0:
              JOptionPane.showMessageDialog(null, "======Terima Kasih Telah Mampir Sepeda Motor Di Tempat Dealer Anak Sukses======");
                System.exit(0);
            default:
               JOptionPane.showMessageDialog(null, "======Terima Kasih Telah Mampir Sepeda Motor Di Tempat Dealer Anak Sukses======");
                break;

        } JawababUser = JOptionPane.showInputDialog(null, "Apakah Anda Ingin Membeli Lagi? (Ya/Tidak)");
        } while (JawababUser.equalsIgnoreCase("Ya")); 

        do{ JOptionPane.showMessageDialog(null, "Total Pembelian : Rp. " + total);
            bayar = Integer.parseInt(JOptionPane.showInputDialog(null, "Totalnya : Rp. " + total + "\nMasukan Uang Pembayaran : "));
            if (bayar < total) {
                JOptionPane.showMessageDialog(null, "Uang Yang Anda Masukan Kurang Silahkan Inputkan Uang Anda Kembali");
            }else{
                kembalian = bayar-total;
            }
        }while (bayar < total);
        JOptionPane.showMessageDialog(null, "susuk e su : Rp. " + kembalian);
            JOptionPane.showMessageDialog(null, "=======NOTA PEMBELIAN=======" + "\nSepeda Di Beli        : " + jumlah + " Sepeda Motor" + "\nTotal Pembelian     : Rp. " + total + "\nUang Pembayaran : Rp. " + bayar + "\nUang Kembalian     : Rp. " + kembalian);
            JOptionPane.showMessageDialog(null, "======Terima Kasih Sudah Membeli Sepeda Motor Di Tempat Dealer Anak Sukses======");
            
    }
}
