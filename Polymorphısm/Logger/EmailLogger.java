package Java101.Polymorphısm.Logger;

public class EmailLogger extends BaseLogger {
    public void log(String mesaj){
        System.out.println("Email Bağlantısı : "+mesaj); // mesaj yapmtığımada main kısımında mesaj yazarsam onu getirir.
    }

}
