package Java101.Abstract_Class.CustomerDb;

public class CustomerManager {

    BaseDatabaseManager tugi ;
    public void getCustomer(){
        tugi.getData();
        /*
        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
         oracleDatabaseManager.getData();  // new yaparsak bağamlı oluruz. class içinde new yapmayı sevmeyiz.
           */
    }
}

