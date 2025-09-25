import java.util.Scanner;
public class VowelCounter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Enter the string: ");
        String word = scanner.nextLine(); 

        vowelCount(word);

    }
    
    public static void vowelCount(String word) {
        String vowels = "aeiouAEIOU";

            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }
            System.out.println("Number of vowels: " + count);


    }
        
        
    

        
        
    }
        
    
