package Egitim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class OtoparkUygulamasi2 extends JFrame {
    private JButton girisButton, cikisButton, listeleButton;

    private HashMap<String, AracBilgisi> otopark = new HashMap<>();

    public OtoparkUygulamasi2() {
        setTitle("Otopark Uygulaması");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        girisButton = new JButton("Giriş Yap");
        cikisButton = new JButton("Çıkış Yap");
        listeleButton = new JButton("Araçları Listele");

        girisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aracGirisYap();
            }
        });

        cikisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aracCikisYap();
            }
        });

        listeleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                araclariListele();
            }
        });

        panel.add(girisButton);
        panel.add(cikisButton);
        panel.add(listeleButton);

        add(panel);

        setVisible(true);
    }

    private void aracGirisYap() {
        String plaka = JOptionPane.showInputDialog(this, "Plaka:");
        String model = JOptionPane.showInputDialog(this, "Model:");
        String ad = JOptionPane.showInputDialog(this, "Ad:");
        String telefon = JOptionPane.showInputDialog(this, "Telefon:");

        if (plaka == null || model == null || ad == null || telefon == null) {
            return; // Kullanıcı pencereyi kapattı veya iptal etti
        }

        if (plaka.isEmpty() || model.isEmpty() || ad.isEmpty() || telefon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurun!");
        } else {
            if (!otopark.containsKey(plaka)) {
                Date girisSaati = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String girisSaatiStr = dateFormat.format(girisSaati);

                otopark.put(plaka, new AracBilgisi(model, ad, telefon, girisSaati));

                JOptionPane.showMessageDialog(this, "Araç Giriş Yaptı!\nPlaka: " + plaka +
                        "\nModel: " + model + "\nAd: " + ad + "\nTelefon: " + telefon + "\nGiriş Saati: " + girisSaatiStr);
            } else {
                JOptionPane.showMessageDialog(this, "Bu plakaya sahip araç zaten otoparkta!");
            }
        }
    }

    private void aracCikisYap() {
        String plaka = JOptionPane.showInputDialog(this, "Plaka:");
        String yakit = JOptionPane.showInputDialog(this, "Yakıt (Litre):");

        if (plaka == null || yakit == null) {
            return; // Kullanıcı pencereyi kapattı veya iptal etti
        }

        if (plaka.isEmpty() || yakit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen plaka ve yakıt bilgilerini doldurun!");
        } else {
            if (otopark.containsKey(plaka)) {
                AracBilgisi arac = otopark.get(plaka);
                Date cikisSaati = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String cikisSaatiStr = dateFormat.format(cikisSaati);

                double ekUcret = 0;
                try {
                    double yakitMiktari = Double.parseDouble(yakit);
                    // Örnek olarak 7 TL/saatlik ek ücret hesapla
                    ekUcret = (cikisSaati.getTime() - arac.getGirisSaati().getTime()) / (1000 * 60 * 60.0) * 7 * yakitMiktari + yakitMiktari * 35.45;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Geçerli bir yakıt miktarı girin!");
                    return;
                }

                // Çıkış bilgilerini göster
                JOptionPane.showMessageDialog(this, "Araç Çıkış Yaptı!\nPlaka: " + plaka +
                        "\nModel: " + arac.getModel() + "\nAd: " + arac.getAd() +
                        "\nGiriş Saati: " + arac.getGirisSaatiStr() + "\nÇıkış Saati: " + cikisSaatiStr +
                        "\nYakıt Miktarı: " + yakit + " litre" + "\nEk Ücret: " + ekUcret + " TL");

                // Otopark kaydını sil
                otopark.remove(plaka);
            } else {
                JOptionPane.showMessageDialog(this, "Bu plakaya sahip araç otoparkta değil!");
            }
        }
    }

    private void araclariListele() {
        if (otopark.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Otoparkta araç bulunmamaktadır.");
            return;
        }

        StringBuilder aracListesi = new StringBuilder("Otoparktaki Araçlar:\n");
        for (Map.Entry<String, AracBilgisi> entry : otopark.entrySet()) {
            AracBilgisi arac = entry.getValue();
            aracListesi.append("Plaka: ").append(entry.getKey()).append(", Model: ").append(arac.getModel())
                    .append(", Ad: ").append(arac.getAd()).append(", Giriş Saati: ").append(arac.getGirisSaatiStr())
                    .append("\n");
        }

        JOptionPane.showMessageDialog(this, aracListesi.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OtoparkUygulamasi2();
            }
        });
    }
}

class AracBilgisi {
    private String model;
    private String ad;
    private String telefon;
    private Date girisSaati;

    public AracBilgisi(String model, String ad, String telefon, Date girisSaati) {
        this.model = model;
        this.ad = ad;
        this.telefon = telefon;
        this.girisSaati = girisSaati;
    }

    public String getModel() {
        return model;
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

