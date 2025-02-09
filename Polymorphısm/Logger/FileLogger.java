package Java101.Polymorphısm.Logger;

public class FileLogger extends BaseLogger {
    public void log(String mesaj){
        System.out.println("File Bağlantısı : "+mesaj); // mesaj yapmtığımada main kısımında mesaj yazarsam onu getirir.
    }
}
