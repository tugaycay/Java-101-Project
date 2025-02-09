package Java101.Polymorphısm.Logger;

public class CustomerManager {
    private BaseLogger tugi;
    public CustomerManager(BaseLogger  tugi){
         this.tugi= tugi;
    }
public void add(){
     System.out.println("Müşteri Eklendi");
     this.tugi.log("log mesajı ");
    }
} /*
Bir classsın içinde başka bir classı newlemeyin...
şunu yapabilirsiniz.
main.java kısımında  newleyin
CustomerManager customerManager = new CustomerManager(new DatabaseLogger);
*/
