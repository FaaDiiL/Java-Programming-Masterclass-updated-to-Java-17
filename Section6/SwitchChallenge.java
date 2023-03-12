package Section6;

public class SwitchChallenge {
    public static void main(String[] args) {
     char natoAlphabet = 'A';
     switch (natoAlphabet){
         case 'A':
             System.out.println(natoAlphabet+ " is Able");
             break;
         case 'B':
             System.out.println(natoAlphabet+ " is Baker");
             break;
         case 'C':
             System.out.println(natoAlphabet+ " is Charlie");
             break;
         case 'D':
             System.out.println(natoAlphabet+ " is Dog");
             break;
         case 'E':
             System.out.println(natoAlphabet+ " is Easy");
             break;
         default:
             System.out.println("Letter " + natoAlphabet + " was not found in the switch");
             break;

     }
    }
}
