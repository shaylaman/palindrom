import java.util.Scanner;

public class Main {
    static boolean isPalind(int number){
        int temp = number,reversenumber=0;
        for(int i =0 ; temp != 0 ;i++) {
            reversenumber = (reversenumber*10) + (temp%10);
            temp= temp/10;
        }
        if(number==reversenumber){
            System.out.println("Bu sayi bir Palindrom sayıdır!");
        }
        else {
            System.out.println("Palindrom değildir!");
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Herhangi bir sayı giriniz: ");
        int sayi = inp.nextInt();
        isPalind(sayi);

    }
}