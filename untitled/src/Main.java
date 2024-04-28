import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel Rootpanel;
    private JTabbedPane TabbedAlbums;
    private JPanel ObladaetTab;
    private JPanel PlatinaTab;
    private JPanel krystalTab;
    private JComboBox ComboBoxPlatina;
    private JComboBox ComboBoxKrystal;
    private JComboBox ComboBoxObla;
    private JButton OblaLink;
    private JLabel oblaLabel;
    private JLabel LinkPlaceObla;
    private JLabel OblaList;
    private JLabel KrystalLabel;
    private JButton KrystalLink;
    private JLabel LinkPlaceKrystal;
    private JLabel KrystalList;
    private JLabel PlatinaLabel;
    private JButton PlatinaLink;
    private JLabel LinkPlacePlatina;
    private JLabel PlatinaList;
    private JLabel plat_label;

    public static void main(String[] args) {

        JFrame frame = new JFrame("AlbumsReader");
        frame.setContentPane(new Main().Rootpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);






    }


    public Main(){

        ComboBoxObla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = ComboBoxObla.getSelectedItem().toString() + " Album:";
                oblaLabel.setText(data);
                if (ComboBoxObla.getSelectedItem().toString().equals("PLAYERS CLUB")) {
                    OblaList.setText("<html>BLIND ZONE <br>" +
                            "1 000 000 <br>" +
                            "SHINOBI <br>" +
                            "DEF JOINT 2 <br>" +
                            "Wi-Fi (Ft. Jordon Wi-Fi, Last Night In Paris, Reezy Rye & Taurean Roye) <br>" +
                            "FOR MULA <br>" +
                            "DAVID BECKHAM <br>" +
                            "RANDOM <br>" +
                            "NHL MONEY (Ft. THRILL PILL) <br>" +
                            "DAVID BECKHAM (Remix) (Ft. V9) <br>" +
                            "666 PRADA <br>" +
                            "BOSS SHIT (Ft. Polyana) <br>" +
                            "POSLEVKUSIE <br>" +
                            "DEF JOINT FREESTYLE 1 <br>");
                }
                if (ComboBoxObla.getSelectedItem().toString().equals("PLAYERS CLUB 2")) {
                    OblaList.setText("<html>HARLEQUIN <br>" +
                            "BOO! <br>" +
                            "PROKLYATIE <br>" +
                            "SKI ANORAK <br>" +
                            "BRITNEY <br>" +
                            "MMM <br>" +
                            "GP$ <br>" +
                            "GLOBA <br>" +
                            "MONSTER TRAKK <br>" +
                            "INVESTOR<br>" +
                            "MUTANT <br>" +
                            "BOLSHOI BRAT <br>" +
                            "ДОМ С ПРИВИДЕНИЯМИ <br>" +
                            "PRAYERS <br>"+
                            "MB <br>"+
                            "BABOCHKI <br>"+
                            "735 PROBLEMS <br>");
                }
                if (ComboBoxObla.getSelectedItem().toString().equals("Files")) {
                    OblaList.setText("<html>" +
                            "DOOR <br>" +
                            "FILES (feat. MARKUL)<br>" +
                            "SWEATSHIRT <br>" +
                            "THEMARKET <br>" +
                            "I AM <br>" +
                            "KATANA (feat. STED.D) <br>" +
                            "CHAINS <br>" +
                            "FLAME <br>");
                }
                if (ComboBoxObla.getSelectedItem().toString().equals("Double Tap")) {
                    OblaList.setText("<html>" +
                            "TIMELAPSE / MASK <br>" +
                            "00:00 <br>" +
                            "DOWNSHIFTING <br>" +
                            "FASHION TV (feat. ATL) <br>" +
                            "UNIVERSE (feat. Illumate) <br>" +
                            "I DON'T TRUST (feat. Krestall Kidd) <br>" +
                            "RIDIN' <br>" +
                            "DOUBLE TAP <br>");
                }
            }
        });
        OblaLink.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ComboBoxObla.getSelectedItem().toString().equals("PLAYERS CLUB")) {
                LinkPlaceObla.setText("https://open.spotify.com/album/5sw0ehyM0UI5NX7BwPQlXI?si=cFDNUo6MQn6r3fYUN_hpmg");
                }
                if (ComboBoxObla.getSelectedItem().toString().equals("PLAYERS CLUB 2")) {
                    LinkPlaceObla.setText("https://open.spotify.com/album/3o51VRcH2HTGCW0HXVZP5e?si=ZSSiZlkKSMWpX-c6xegTnQ");
                }
                if (ComboBoxObla.getSelectedItem().toString().equals("Files")) {
                    LinkPlaceObla.setText("https://open.spotify.com/album/6X4zZpgFQRGQciwnYdmQ21?si=86FH7c13S8WQV-IBq1gB_Q");
                }
                if (ComboBoxObla.getSelectedItem().toString().equals("Double Tap")) {
                    LinkPlaceObla.setText("https://open.spotify.com/album/4Jb3t0caas9kyYZ2YoV8K3?si=-yYNYhyuREKgYObv2lp3zg");
                }

            }
        });

        ComboBoxKrystal.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String data = ComboBoxKrystal.getSelectedItem().toString() + " Album:";
            KrystalLabel.setText(data);
            if (ComboBoxKrystal.getSelectedItem().toString().equals("NO LABEL")) {
                KrystalList.setText("<html>Тик так <br>" +
                        "Лондон <br>" +
                        "Кукла <br>" +
                        "Дикий Запад <br>" +
                        "Клик <br>" +
                        "Каждый день <br>" +
                        "Снег <br>" +
                        "Air Force 1<br>" +
                        "Факбой<br>" +
                        "Пачки <br>" +
                        "Патек (feat. LIL MORTY) <br>" +
                        "Скам (feat. OG Buda)<br>" +
                        "Burberry<br>"+
                        "Братик (feat. Платина)<br>"+
                        "Крик<br>"+
                        "Крутая (feat. FEDUK)<br>"+
                        "7 дней (feat. Big Baby Tape)<br>");
            }
            if (ComboBoxKrystal.getSelectedItem().toString().equals("lil krystalll")) {
                KrystalList.setText("<html> <br>" +
                        "Витон <br>" +
                        "Х <br>" +
                        "Биг бой <br>" +
                        "Сука босс <br>" +
                        "Гуччи деним (feat. Платина) <br>" +
                        "Чек <br>" +
                        "Моли вода <br>" +
                        "Баблгам (feat. Nino Triggz) <br>" +
                        "2 бара<br>");
            }
            if (ComboBoxKrystal.getSelectedItem().toString().equals("KRISTINA")) {
                KrystalList.setText("<html>NOVIKOV <br>" +
                        "Кристина<br>" +
                        "Холод<br>" +
                        "Скажи мне<br>" +
                        "Birkin <br>" +
                        "Первый класс<br>" +
                        "Октябрь <br>" +
                        "Кобра <br>" +
                        "Коллекция <br>"+
                        "Джек Рипер <br>"+
                        "CSM <br>"+
                        "Мой черёд <br>"+
                        "Друзья <br>"+
                        "City Boy <br>"+
                        "NY Girl <br>"+
                        "K-love <br>"+
                        "Три буквы <br>"+
                        "Я БУДУ <br>");
            }
            if (ComboBoxKrystal.getSelectedItem().toString().equals("Brat 3")) {
                KrystalList.setText("<html>Первый <br>" +
                        "Блеск<br>" +
                        "Ты Сосёшь! <br>" +
                        "Бум Бум <br>" +
                        "Орбит <br>" +
                        "Попсикл <br>" +
                        "Малыш<br>" );
            }
        }
    });
        KrystalLink.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (ComboBoxKrystal.getSelectedItem().toString().equals("NO LABEL")) {
                LinkPlaceKrystal.setText("https://open.spotify.com/album/7m5njRmBpYanS2lH2fEKMs?si=R2ifc9P1SFSkDbS2mG3-Kg");
            }
            if (ComboBoxKrystal.getSelectedItem().toString().equals("lil krystalll")) {
                LinkPlaceKrystal.setText("https://open.spotify.com/album/6wTGyS6ct0oHQXRXlv9da5?si=imQHAQpiRJyh_CZTQx5Mfg");
            }
            if (ComboBoxKrystal.getSelectedItem().toString().equals("KRISTINA")) {
                LinkPlaceKrystal.setText("https://open.spotify.com/album/7xyrSebPj8sq4XuVTFdRVB?si=tIwBGsQHRVCt29EA6GBsGg");
            }
            if (ComboBoxKrystal.getSelectedItem().toString().equals("Brat 3")) {
                LinkPlaceKrystal.setText("https://open.spotify.com/album/49LfsYtLdDO2lXgGWqLsxI?si=DQCV0kmDTFqGph2qo_sx-w");
            }

        }
    });


        ComboBoxPlatina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = ComboBoxPlatina.getSelectedItem().toString() + " Album:";
                PlatinaLabel.setText(data);
                if (ComboBoxPlatina.getSelectedItem().toString().equals("Platina")) {
                    PlatinaList.setText("<html>Время на веселье <br>" +
                            "ХТТ <br>" +
                            "Бассок (feat. Voskresenskii) <br>" +
                            "Бетховен (feat. Scally Milano)<br>" +
                            "Самый свежий на бите <br>" +
                            "У меня свег, у меня стиль <br>" +
                            "Та самая.. <br>" +
                            "Я поверил ей..<br>" +
                            "Виновата сама..<br>" +
                            "В темноте (feat. BUSHIDO ZHO)<br>" +
                            "Баленсиага парень (Боттега Бой)<br>" +
                            "Плывут<br>" +
                            "Бритни Спирс<br>"+
                            "Грязный тип (Бомжи)<br>"+
                            "Гринч (feat. LOVV66)<br>"+
                            "Одна (feat. LOVV66)<br>"+
                            "Последнее свидание (feat. ЕГОР КРИД)<br>"+
                            "Твой любимый репер<br>"+
                            "Бейби<br>"+
                            "Завидуют<br>"+
                            "Завидуют (Версия 2)<br>"+
                            "Один Дома<br>"+
                            "Гоблин (Bonus)<br>");
                }
                if (ComboBoxPlatina.getSelectedItem().toString().equals("Sosa Muzik")) {
                    PlatinaList.setText("<html>В Клубе <br>" +
                            "За Меня <br>" +
                            "liga la sosa <br>" +
                            "На Грязном (Диана) <br>" +
                            "Булки (feat. LIL VAN) <br>" +
                            "Бригада <br>" +
                            "Сан Ларан<br>" +
                            "Самый классный парень (feat. PLOHOYPAREN)<br>" +
                            "Вопросов нету<br>" +
                            "Сердце для шалав<br>"+
                            "Веном (feat. Big Baby Tape) <br>"+
                            "Генг <br>"+
                            "Abu Dhabi Ba6y (feat. OG Buda, MAYOT)<br>"+
                            "Как до луны (Drizzy flow)<br>"+
                            "Все эти деньги сразу<br>");
                }
                if (ComboBoxPlatina.getSelectedItem().toString().equals("RNB CLUB")) {
                    PlatinaList.setText("<html>Биг Бой <br>" +
                            "Иней!<br>" +
                            "Это не любовь feat. OG Buda<br>" +
                            "Бандана<br>" +
                            "Бугимейн feat. ROCKET<br>" +
                            "У тебя большая жопа я влюблён<br>" +
                            "Заны и сироп<br>" +
                            "£20k feat. Lil Krystalll<br>" +
                            "Пусибой<br>");
                }
                if (ComboBoxPlatina.getSelectedItem().toString().equals("Opiaty Krug")) {
                    PlatinaList.setText("<html>Опиаты Круг<br>" +
                            "MJ<br>" +
                            "Трап Дом (feat. PLOHOYPAREN)<br>" +
                            "Большой Путь (feat. MellowBite)<br>" +
                            "Актриса (feat. lil krystalll)<br>" +
                            "Бэнтли, Бенз и Бумер (feat. OBLADAET)<br>" +
                            "Мокрый Асфальт<br>"+
                            "Санта Клаус<br>"+
                            "Айсберг<br>"+
                            "В темноте<br>"+
                            "Все цветы вокруг меня цветут (feat. 104)<br>"+
                            "Случайна<br>"+
                            "Навсегда (feat. White Punk)<br>"+
                            "Валентина<br>"+
                            "Ламбо (feat. FEDUK)<br>"+
                            "Питер Пэн<br>"+
                            "Попзвезда (feat. PLOHOYPAREN)<br>"+
                            "Нотр-Дам Париж<br>"+
                            "Как в первый раз<br>" );
                }
            }
        });
        PlatinaLink.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ComboBoxPlatina.getSelectedItem().toString().equals("RNB CLUB")) {
                    LinkPlacePlatina.setText("https://open.spotify.com/album/0k91OOXshS0RN2I9DJF5sF?si=cZKxhKYYTgK5OfOpJmm1Rw");
                }
                if (ComboBoxPlatina.getSelectedItem().toString().equals("Platina")) {
                    LinkPlacePlatina.setText("https://open.spotify.com/album/7knOFjfoZgvKFymD31Y7jN?si=k6iww9TxRsK-t805_aqdOw");
                }
                if (ComboBoxPlatina.getSelectedItem().toString().equals("Opiaty Krug")) {
                    LinkPlacePlatina.setText("https://open.spotify.com/album/1ZYBbWgad6ak0t30555eGV?si=31BHvb_8SDWBwIRcKfjhsg");
                }
                if (ComboBoxPlatina.getSelectedItem().toString().equals("Sosa Muzik")) {
                    LinkPlacePlatina.setText("https://open.spotify.com/album/2YAGIocNPp0fc29od97AKh?si=8Zys8QklQ527RH9PYpLP3g");
                }

            }
        });

    }
}