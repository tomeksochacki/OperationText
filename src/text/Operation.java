package text;

public class Operation {
    public static void main(String[] args) {

        String text1 = "Tomek";
        String text2 = addSochacki(text1);

        System.out.println(text1);
        System.out.println(text2);
    }

    public static String addSochacki(String text1){
        return text1 + " Sochacki";
    }
}
