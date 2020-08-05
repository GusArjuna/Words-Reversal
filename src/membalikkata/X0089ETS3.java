// Copyright M. Taufan Ma'ruf 1461900089
package membalikkata;
import java.util.Scanner;
public class X0089ETS3 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String kalimat;
    
    System.out.print("Masukkan Kalimat : ");
    kalimat=in.nextLine();
    String[] balik=kalimat.split(" ");
    for(int a=0;a<balik.length;a++){
        StringBuffer balik2=new StringBuffer(balik[a]);
        System.out.print(balik2.reverse()+" ");
    }
    }
}
