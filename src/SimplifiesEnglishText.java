import java.util.*;

public class SimplifiesEnglishText {

    public static String removeC(String text){
         text = text.replaceAll("cc", "kc");
         text = text.replaceAll("ci", "si");
         text = text.replaceAll("ce", "se");
         text = text.replaceAll("ck", "k");
         text = text.replaceAll("c", "k");
         return text;
    }

    public static String removeDoubleLetter(String text){
         text = text.replaceAll("ee", "i");
         text = text.replaceAll("oo", "u");

         ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(text.split("")));
         int count = 0;
         int arrayListSize = arrayList.size() - 1;
         while (true){
             if(arrayListSize == count){
                 break;
             }
             if(arrayList.get(count).equals(arrayList.get(count + 1))){
                 arrayList.remove(count);
                 arrayListSize--;
                 continue;
             }
             count++;
         }

         String newText = "";
         for(String s : arrayList){
             newText = newText + s;
         }
         return newText;
    }

    public static String removeLetterE(String text){

        List<String> stringList = new ArrayList<>();
        String arrString[] = text.split("\\s+");
        Collections.addAll(stringList, arrString);

        String string = "";
        String tempStringSymbol = "";
        String tempStringWord = "";

        for(String s : arrString){
            tempStringSymbol = s.replaceAll("\\w", "");
            tempStringWord = s.replaceAll("\\W", "");
            if(tempStringWord.length() > 1 && tempStringWord.charAt(tempStringWord.length() - 1) == 'e'){
                string = string + tempStringWord.substring(0, tempStringWord.length() - 1) + tempStringSymbol + " ";
                continue;
            }
            string = string + s + " ";
        }
         return string;
    }

    public static String removeArticles(String text){
         text = text.replaceAll("\\ba\\b|\\ban\\b|\\bth\\b|\\bthe\\b\\s+", "");
         return text;
    }

    public static String runAllMethods(String text){
         String string = removeC(text);
         string = removeDoubleLetter(string);
         string = removeLetterE(string);
         string = removeArticles(string);
         return string;
    }
}
