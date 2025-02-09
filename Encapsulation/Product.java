package Java101.Encapsulation;

public class Product {
    private int id;
    private String name;
    private String lastname;
    private String kod;

    public void setName(String name){
        this.name=name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getKod() {
        System.out.println(this.name.substring(0,4)+id);
        return this.name.substring(0,4)+id;
    }
}
