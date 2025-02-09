package Java101.Polymorphısm.Logger;

public class Main {
    public static void main(String[]args){
        FileLogger baseLogger = new FileLogger();
        DatabaseLogger databaseLogger =new DatabaseLogger();
        baseLogger.log("BAŞARILI");
        databaseLogger.log("BAŞARILI");
        System.out.println("--------------------------------");
        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DatabaseLogger() , new EmailLogger()};
        //extends olduğu için yazabiliyoruz . int [] sayi = new int[] {1,2,3,""} bu hata verir. ama exteds yaptığımız için bunların hepsi baselogger oldu.
        for(BaseLogger logger :loggers){
            logger.log("tugay");
        }
        System.out.println("--------------------------------");
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();

    }
}
