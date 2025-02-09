package Java101.Polymorphısm.Logger;

public class DatabaseLogger extends BaseLogger {
    public void log(String mesaj){
        System.out.println("VeriTabanı Bağlantısı : "+mesaj); // mesaj yapmtığımada main kısımında mesaj yazarsam onu getirir.
    }
}
