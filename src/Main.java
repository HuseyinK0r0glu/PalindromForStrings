import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string you want to check" );
        String word = scan.nextLine();
        int i = 0;
        int t = word.length()-1;

        while(i<=t){
            if(word.charAt(i)==word.charAt(t)){
                i++;
                t--;

            }else{
                System.out.println("not palindrom");
                break;
            }
            if(i==t||t>i){
                System.out.println("palindrom");
                break;
            }
        }

    }
}