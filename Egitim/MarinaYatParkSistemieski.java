package Egitim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MarinaYatParkSistemieski extends JFrame {
    private JButton giristusu, cikistusu, listelemetusu;

    private HashMap<String, YatBilgisieski> marina = new HashMap<>();

    public MarinaYatParkSistemieski() {
        setTitle("Marina Yat Park Sistemi");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        giristusu = new JButton("Giriş Yap");
        cikistusu = new JButton("Çıkış Yap");
        listelemetusu = new JButton("Yatları Listele");

        giristusu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yatGirisYap();
            }
        });

        cikistusu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yatCikisYap();
            }
        });

        listelemetusu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yatlariListele();
            }
        });

        panel.add(giristusu);
        panel.add(cikistusu);
        panel.add(listelemetusu);

        add(panel);

        setVisible(true);

        Denemekayitlari();

    }
    public void Denemekayitlari() {

        try {
            SimpleDateFormat tarihformati = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

            marina.put("34ZAP944", new YatBilgisieski("24.5", "Ahmet akarca", "+905455673210", tarihformati.parse("5-3-2023 08:39:13")));
            marina.put("ZR3788", new YatBilgisieski("9", "Adina Lorens ", "+451234567891", tarihformati.parse("1-2-2023 09:45:37")));
            marina.put("GH789", new YatBilgisieski("14.3", "Bill Guorgini", "+01674587628", tarihformati.parse("7-4-2023 10:15:00")));
            marina.put("35JKL012", new YatBilgisieski("36.4", "Süleyman Demir", "+905444146953", tarihformati.parse("8-4-2023 11:30:19")));
            marina.put("MNO345", new YatBilgisieski("42", "John Affrold", "+464718293", tarihformati.parse("3-9-2023 12:45:48")));
            marina.put("PR678", new YatBilgisieski("8", "Ludgozky Malentin", "+901234567895", tarihformati.parse("4-10-2023 14:59:54")));
            marina.put("ST901", new YatBilgisieski("14", "Ludmilla Kratiskov", "+7288790543", tarihformati.parse("24-12-2023 22:15:18")));
            marina.put("01FFT234", new YatBilgisieski("19.8", "Aleyna Çelik", "+905436780912", tarihformati.parse("9-12-2023 16:30:23")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }




    private void yatGirisYap() {
        String ruhsatnum = JOptionPane.showInputDialog(this, "Yat Ruhsat numarası:");
        String uzunluk = JOptionPane.showInputDialog(this, "Yat Uzunluğu:");
        String ad = JOptionPane.showInputDialog(this, "Yat Sahibinin adı:");
        String telefon = JOptionPane.showInputDialog(this, "Yat Sahibinin Telefonu:");

        if (ruhsatnum == null || uzunluk == null || ad == null || telefon == null) {
            return; // Kullanıcı pencereyi kapattı veya iptal etti
        }

        if (ruhsatnum.isEmpty() || uzunluk.isEmpty() || ad.isEmpty() || telefon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurun!");
        } else {
            if (!marina.containsKey(ruhsatnum)) {
                Date girisSaati = new Date();
                SimpleDateFormat tarihformati = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String girisSaatiStr = tarihformati.format(girisSaati);

                marina.put(ruhsatnum, new YatBilgisieski(uzunluk, ad, telefon, girisSaati));

                JOptionPane.showMessageDialog(this, "Yat Giriş Yaptı!\nYat Ruhsat numarası: " + ruhsatnum +
                        "\nYat uzunlugu: " + uzunluk + "\nYat Sahibinin Adı: " + ad + "\nYat Sahibinin Telefonu: " + telefon +
                        "\nGiriş Saati: " + girisSaatiStr);
            } else {
                JOptionPane.showMessageDialog(this, "Bu numaraya sahip yat zaten marinada");
            }
        }
    }

    private void yatCikisYap() {
        String ruhsatnum = JOptionPane.showInputDialog(this, " Yat Ruhsat Numarası:");
        String yakit = JOptionPane.showInputDialog(this, "Yakıt (Litre):");

        if (ruhsatnum == null || yakit == null) {
            return; // Kullanıcı pencereyi kapattı veya iptal etti
        }

        if (ruhsatnum.isEmpty() || yakit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen ruhsat numarasını ve yakıt bilgilerini doldurun!");
        } else {
            if (marina.containsKey(ruhsatnum)) {
                YatBilgisieski yat = marina.get(ruhsatnum);
                Date cikisSaati = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String cikisSaatiStr = dateFormat.format(cikisSaati);

                double ekUcret = 0;
                try {

                    double yakitMiktari = Double.parseDouble(yakit);

                    int uzunluk = Integer.parseInt(yat.getuzunluk());
                    double saatlikUcret;

                    if (uzunluk < 15) {
                        saatlikUcret = 7.0;
                    } else if (uzunluk > 15 && uzunluk <= 25) {
                        saatlikUcret = 12.5;
                    } else {
                        saatlikUcret = 16.0;
                    }


                    ekUcret = (cikisSaati.getTime() - yat.getGirisSaati().getTime()) / (1000 * 60 * 60.0) * saatlikUcret + yakitMiktari * 35.45;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Geçerli bir yakıt miktarı girin!");
                    return;
                }

                String bicimlendirilmisucret = String.format("%.2f", ekUcret);
                System.out.println(bicimlendirilmisucret);

                // Çıkış bilgilerini göster
                JOptionPane.showMessageDialog(this, "Yat Çıkış Yapti \nYat ruhsat numarası: " + ruhsatnum +
                        "\nYat Uzunluğu: " + yat.getuzunluk() + "\nYat Sahibinin Adı: " + yat.getAd() +
                        "\nGiriş Saati: " + yat.getGirisSaatiStr() + "\nÇıkış Saati: " + cikisSaatiStr +
                        "\nYakıt Miktarı: " + yakit + " litre" + "\nÜcret: " +bicimlendirilmisucret + " TL");

                // Marina kaydını sil
                marina.remove(ruhsatnum);
            } else {
                JOptionPane.showMessageDialog(this, "Marinada bu numaraya sahip bir kayıt yok.");
            }
        }
    }

    private void yatlariListele() {
        if (marina.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Marinada kayıtlı yat bulunmamaktadır.");
            return;
        }

        StringBuilder yatListesi = new StringBuilder("Marinadaki Yatlar:\n");
        for (Map.Entry<String, YatBilgisieski> entry : marina.entrySet()) {
            YatBilgisieski yat = entry.getValue();
            yatListesi.append("Yat Ruhsat Numarası: ").append(entry.getKey()).append(", Yat uzunluğu: ").append(yat.getuzunluk())
                    .append(", Yat Sahibinin Adı: ").append(yat.getAd()).append(", Giriş Saati: ").append(yat.getGirisSaatiStr())
                    .append("\n");
        }

        JOptionPane.showMessageDialog(this, yatListesi.toString());
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MarinaYatParkSistemieski();
            }
        });
    }


}

class YatBilgisieski {
    private String uzunluk;
    private String ad;
    private String telefon;
    private Date girisSaati;

    public YatBilgisieski(String uzunluk, String ad, String telefon, Date girisSaati) {
        this.uzunluk = uzunluk;
        this.ad = ad;
        this.telefon = telefon;
        this.girisSaati = girisSaati;
    }

    public String getuzunluk() {
        return uzunluk;
    }

    public String getAd() {
        return ad;
    }

    public String getTelefon() {
        return telefon;
    }

    public Date getGirisSaati() {
        return girisSaati;
    }

    public String getGirisSaatiStr() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return dateFormat.format(girisSaati);
    }
}
