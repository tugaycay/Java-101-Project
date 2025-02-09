package Java101.Abstract_Class.CustomerDb;

public class Main   {
    public static void main(String[]args){
        CustomerManager customerManager =new CustomerManager();
        customerManager.tugi= new SqlServerDataBaseManager();
        customerManager.getCustomer();
    }
}
