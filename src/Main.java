
public class Main {
    public static void main(String[] args) {
        System.out.println(SimplifiesEnglishText.removeC("success"));
        System.out.println(SimplifiesEnglishText.removeDoubleLetter("oo oo ou ieeddddd"));
        System.out.println(SimplifiesEnglishText.removeLetterE("The, the!, will be"));
        System.out.println(SimplifiesEnglishText.removeArticles("an apple, a house, the table"));
        System.out.println(SimplifiesEnglishText.runAllMethods("cacao and coffee"));
    }
}
