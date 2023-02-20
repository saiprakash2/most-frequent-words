import java.io.FileReader;
import java.util.*;

public class FrequentWords2 {
    public static void main(String[] args) throws Exception {

        List<String> stringFile = new ArrayList<>();

        //to scan the file
        Scanner sc = new Scanner(new FileReader("filename"));         //enter the file path here
        while (sc.hasNext()) {
            String str;
            str = sc.next();
            stringFile.add(str);
        }

        System.out.println(frequentWords(stringFile));

    }

    //function to calculate the frequent Words
    public static List<String> frequentWords(List<String> words)  {

            HashMap<String, Integer> freqWordsMap = new HashMap<>();

            //for loop to count the words
            for(int i = 0; i < words.size(); i++) {
                freqWordsMap.put(words.get(i), freqWordsMap.getOrDefault(words.get(i),0) + 1);
            }

            List<String> wordList= new ArrayList<>(freqWordsMap.keySet());

            //to sort the words by frequency and lexiographically
            wordList.sort((a,b) -> freqWordsMap.get(a) == freqWordsMap.get(b) ? a.compareTo(b): freqWordsMap.get(b) - freqWordsMap.get(a));

            return wordList.subList(0,2);

    }

}
