package Java101.Inheritance.Company;

public class Main {
 /*
 * Customer ve Employee sınıflarına baktığımızda ikiside ortak özelliklere sahip.
 *  int id;
    String firstName;
    String lastName;
    int age;
    *
    *yani kendimizi tekrarlamak yerine   başka bir ortak sınıf açıyoruz (person adında) ortak değerleri yazıyoruz.
    * sonra sınıf çağrırken  'extends ' ile  onu dahil edicez buna miras deniyor.
    *

 * */
    public static void main(String[]args){
        Customer customer = new Customer();
        Employee employee = new Employee();
         // customer.age; fark ettiyseniz customer sınıfında age değeri yok ama miras olayında  dolayı gözüküyor.
        EmployeeManager employeeManager =new EmployeeManager();
        CustomerManger customerManger =new CustomerManger();


        customer.id = 1;
        customer.firstName = "Ali";
        customer.lastName = "Veli";
        customer.age = 30;

        employee.id = 2;
        employee.firstName = "Mehmet";
        employee.lastName = "Kaya";
        employee.age = 35;
        employee.salary = 5000.0;
        employeeManager.bestEmployee(); //buda ekrana yazdırır.

        System.out.println(customer.firstName);

    }




}
