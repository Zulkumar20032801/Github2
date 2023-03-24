import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//     System.out.println(arg(1,2,3,4,5,6,7,8));
//
//
//    }
//   static int  arg(int ...ar){
//      int a=0;
//       for (int i = 0; i < ar.length ; i++) {
//           a+=ar[i];
//
//       }return a;


//
//       art();
//   }
//   static void art() {
//       String[] name = {"Java", "Frontend", "Backend", "Python", "JavaScript"};
//       for (String i : name){
//           System.out.println("мен сени жакшы кором "+i);
//       }
        soz();
    }
    static void soz (){
        Scanner scan =new Scanner(System.in);
        String soz= scan.nextLine();
        System.out.println((soz.toUpperCase()));
        System.out.println((soz.trim()));
        if(soz.contains("a")){
            System.out.println(soz.substring(0));
        }else{
            System.out.println("жок");
        }
    }
}