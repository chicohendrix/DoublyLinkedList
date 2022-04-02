import java.util.Scanner;

public class Song {
    String title,artist;
    int length;
    public Song(String t,String a,int m,int s) {
        title=t;
        artist=a;
        length=m*60+s;
    }
    public void display(){
        System.out.println(title+" - "+artist+" ("+length/60+":"+length%60+")");
    }
}
