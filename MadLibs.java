import java.util.Scanner;
public class MadLibs{
   public static void main (String [] args){
   
   /* MAD LIBS GAME
   One (adjective) day, my best friend and I went to the (place). We decided to bring a/an (noun) with us because it can (verb) so 
   (adverb)! While we were there, we met a (adjective) (animal) who wanted to join us. In the end, we all had the most (adjective)
   time ever!
   */
   
   String adjective1, place, object, verb, adverb, adjective2, animal, adjective3;
   
   Scanner scanner = new Scanner(System.in);
   
   System.out.print("Enter an Adjective: ");
   adjective1 = scanner.nextLine();
   
   System.out.print("Enter a Place: ");
   place = scanner.nextLine();
   
   System.out.print("Enter an Object (Something You Can Bring): ");
   object = scanner.nextLine();
   
   System.out.print("Enter a Verb (Base Form): ");
   verb = scanner.nextLine();
   
   System.out.print("Enter an Adverb: ");
   adverb = scanner.nextLine();
   
   System.out.print("Enter an Adjective: ");
   adjective2 = scanner.nextLine();
 
   System.out.print("Enter an Animal: ");
   animal = scanner.nextLine();
  
   System.out.print("Enter an Adjective (Positive): ");
   adjective3 = scanner.nextLine();
   
   System.out.println("\n**MAD LIBS STORY**");
   System.out.println("===========================");
   System.out.println(
      "One " + adjective1 + " day, my best friend and I went to the " + place +
      ". We decided to bring a/an " + object + " with us because it can " + verb +
      " so " + adverb + "!\nWhile we were there, we met a/an " + adjective2 + " " + animal +
      " who wanted to join us. In the end, we all had the most " + adjective3 + " time ever!"
      );
   System.out.println("===========================");
   scanner.close();
   }
}