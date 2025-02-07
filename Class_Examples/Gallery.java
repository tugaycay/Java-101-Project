package Java101.Class_Examples;
public class Gallery {
    public static void main(String[]arguments){
    Cars tugay =new Cars();
    tugay.name="bmw";
    tugay.description="Hızlı bir araba."   ;
    tugay.price =6000000;
    tugay.stock=3;

    GalleryManager tugi = new GalleryManager();
    tugi.Add(tugay );
    }
}
