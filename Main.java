package BTVN_Buoi5_Bai2_4_5_6;
import java.util.Scanner;
public class Main {
    public static void demSoLanKyTu(){
        String str = "Hello world";
        for(int i =0; i<str.length();i++){
            int count =0;
            boolean isRuned = false;
            for (int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    isRuned = true;
                    break;
                }
            }
            if(isRuned){
                continue;
            }
            else{
                for (int k = i; k<str.length();k++){
                    if(str.charAt(i)==str.charAt(k)){
                        count++;
                    }
                }
            }
            System.out.println(str.charAt(i)+" xuat hien: "+ count+ " lan");
        }
    }
    public static void changeChar(){
        String str = "restart";
        String str2 = "";
        char a = str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(a==str.charAt(i)){
                str2+='$';
            }
            else str2+=str.charAt(i);
        }
        System.out.println(a+str2);
    }
    public static void swapFirstTwoChar(){
        String a = "abc";
        String b = "xyz";
        String c = a.replace(a.charAt(0),b.charAt(0));
        String d = c.replace(a.charAt(1),b.charAt(1));
        String e = b.replace(b.charAt(0),a.charAt(0));
        String f = e.replace(b.charAt(1),a.charAt(1));
        System.out.println(d+" "+f);
    }
    public static void addIngOrLy(){
        Scanner scan = new Scanner(System.in);
        String a;
        System.out.println("Nhap mot chuoi: ");
        a = scan.nextLine();
        while (a.length()<3){
            System.out.println("ban can nhap lai chuoi");
            a = scan.nextLine();
        }
        String b = "ing";
        String c = "ly";
        String d = a.substring(a.length()-3,a.length());
        if(d.equals("ing")){
            a=a.concat(c);
        }
        else {
            a = a.concat(b);
        }
        System.out.println("new String = "+a);
    }
    public static void main(String[] args) {
        System.out.println("Bai 2.");
        Main.demSoLanKyTu();
        System.out.println("----------------");
        System.out.println("Bai 4.");
        Main.changeChar();
        System.out.println("----------------");
        System.out.println("Bai 5.");
        Main.swapFirstTwoChar();
        System.out.println("----------------");
        System.out.println("Bai 6.");
        Main.addIngOrLy();
    }
}
