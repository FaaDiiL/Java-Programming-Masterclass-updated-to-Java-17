package Sections1To5;

public class PlayingCatChallenge {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        /*System.out.println(isCatPlaying(true, 25));
        System.out.println(isCatPlaying(true, 45));
        System.out.println(isCatPlaying(true, 46));

        System.out.println(isCatPlaying(false, 24));
        System.out.println(isCatPlaying(false, 25));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 36));*/
    }
    public static boolean isCatPlaying(boolean isSummer, int temperature){
        if (isSummer == true && temperature >= 25 && temperature <= 45){
            return isSummer == true && temperature >= 25 && temperature <= 45;
        }
        else if (!isSummer && temperature >= 25 && temperature <= 35) {
            return !isSummer && temperature >= 25 && temperature <= 35;
        }else {
            return false;
        }
    }
}
