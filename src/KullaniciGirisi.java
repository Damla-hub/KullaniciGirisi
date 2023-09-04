import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,newPassword,tPassword="java123",tuserName="patika";
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName=input.nextLine();
        System.out.print("Şifreniz: ");
        password=input.nextLine();
        if(userName.equals(tuserName)) {
            if(password.equals(tPassword)){
                System.out.print("Giriş yaptınız!");
            }
            else{
                System.out.print("Şifreniz yanlış,şifrenizi sıfırlamak ister misiniz?");
                System.out.println("\n1-Evet\n2-Hayır");
                int karar;
                karar=input.nextInt();
                switch(karar) {
                    case 1 :
                        System.out.print("Yeni şifrenizi giriniz: ");
                        Scanner inp=new Scanner(System.in);
                        newPassword=inp.nextLine();
                        if(newPassword.equals(tPassword)){
                            System.out.print("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                        }
                        else{
                            System.out.print("Şifre oluşturuldu.");
                        }
                        break;
                    case 2 :
                        System.out.print("Şifreniz hatalı tekrar  giriş yapmayı deneyiniz.");
                        break;
                    default:
                        System.out.print("Hatalı sayı girdiniz tekrar deneyiniz.");
                        break;
                }

            }


        }else{
            System.out.print("Kullanıcı adınız hatalı.");

        }
    }
}
