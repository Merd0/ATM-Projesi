import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String userName, password;
        int balance = 1500;
        int select;
        int right = 3;

        while (right > 0) {
            System.out.print("Kullanıcı Adınızı giriniz :");
            userName = inp.nextLine();
            System.out.print("Şifrenizi giriniz :");
            password = inp.nextLine();

            if (userName.equals("Merdo") && password.equals("1357")) {
                System.out.println("Merhaba,Kodluyoruz Bankasına Hoş Geldiniz!");

                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    System.out.println("Lütfen Yapmak İstediğiniz işlemi seçiniz :");
                    select = inp.nextInt();

                    switch (select) {
                        case 1 -> {
                            System.out.print("Yatırmak İstediğiniz Tutar :");
                            int price = inp.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Çekmek İstediğiniz Tutar :");
                            int price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz Bakiye");
                            } else {}
                            balance -= price;
                        }
                        case 3 -> {
                            System.out.println("Güncel Bakiyeniz :" + balance );
                        }
                    }

                } while (select != 4); {
                    System.out.println("Görüşmek Üzere :)");
                    break;
                }

            } else {
                right--;
                System.out.println("Yanlış Kullanıcı Adı ve ya Şifre! Lütfen Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloklanmıştır. Lütfen En Yakın Zamanda Bankayla İletişime Geçiniz!");
                } else {
                    System.out.println("Kalan Hak: " + right);
                }
            }
        }

    }
}