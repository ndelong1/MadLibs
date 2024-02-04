/*
Once upon a midnight dreary, while I pondered, weak and weary,
Over many a quaint and curious volume of forgotten lore—
    While I nodded, nearly napping, suddenly there came a tapping,
As of some one gently rapping, rapping at my chamber door.
“’Tis some visitor,” I muttered, “tapping at my chamber door—
            Only this and nothing more.”
*/
import java.util.Scanner;

public class madlib{
    public static void main(String[] args){
        String nounOne;
        String pastTenseVerbOne;
        String adjectiveOne;
        String adjectiveTwo;
        String nounTwo; //PLURAL NOUN
        String pastTenseVerbTwo;
        String verbOne;
        String verbTwo;
        String nounThree;
        String pronounOne;
        String adjectiveThree;
        String userName;

        Scanner input = new Scanner(System.in);

        System.out.print("What is your username you would like to use? >> ");
        userName = input.nextLine();

        System.out.print("Input a noun >> ");
        nounOne = input.nextLine();
        
        System.out.print("\nInput a past tense verb >> ");
        pastTenseVerbOne = input.nextLine();

        System.out.print("\nInput an adjective (1) >> ");
        adjectiveOne = input.nextLine();

        System.out.print("\nInput an adjective (2) >> ");
        adjectiveTwo = input.nextLine();

        System.out.print("\nInput a plural noun >> ");
        nounTwo = input.nextLine();

        System.out.print("\nInput a past tense verb >> ");
        pastTenseVerbTwo = input.nextLine();

        System.out.print("\nInput a verb (1) >> ");
        verbOne = input.nextLine();

        System.out.print("\nInput a verb (2) >> ");
        verbTwo = input.nextLine();

        System.out.print("\nInput a noun >> ");
        nounThree = input.nextLine();

        System.out.print("\nInput a pronoun >> ");
        pronounOne = input.nextLine();

        System.out.print("\nInput an adjective >> ");
        adjectiveThree = input.nextLine();

        System.out.println("The Raven - Edgar Allen Poe & " + userName);
        System.out.println("Once upon a " + nounOne +  " dreary, \nwhile I " + pastTenseVerbOne + ", " + adjectiveOne + " and " + adjectiveTwo + ", \nOver many a quaint and curious volume of forgotten " + nounTwo + "\nWhile I " + pastTenseVerbTwo + ", " + verbOne + ", suddenly there came a " + verbTwo + ",\nAs of some one gently rapping, rapping at my " + nounThree + " door.\n'Tis some visitor,' I muttered, 'tapping at my chamber door—\nOnly " + pronounOne + " and nothing " + adjectiveThree + ".'");
    }
}

        