
import java.util.ArrayList;

class Words{
    public String word;
    public int count;

    public Words(String word){
        this.word=word;
        this.count=1;
    }

    public void increaseCount(){
        this.count++;
    }

    public String getWord(){
        return this.word;
    }

    public int getCount(){
        return this.count;
    }

}


public class Duplicate {
    public static ArrayList<Words> collection=new ArrayList<>();

    public static void main(String[] args){

        countDuplicate("Hello world world is a better place with hello");
        printCollection();

    }

    public static void countDuplicate(String sentence){
        String[] words=sentence.split(" ");
        for (String word:words){
            int collectionIndex=isInCollection(word);
            if(collectionIndex==-1){
                Words newWord=new Words(word);
                collection.add(newWord);
            }
            else {
                collection.get(collectionIndex).increaseCount();
            }

        }
    }

    public static int isInCollection(String word){
        String wordToBeChecked=word.toLowerCase();
        for(int i=0;i< collection.size();i++){
            String currentWord=collection.get(i).getWord().toLowerCase();
            if (currentWord.equals(wordToBeChecked) )return i;
        }
        return -1;
    }

    public static void printCollection(){
        for(int i=0;i<collection.size();i++){
            Words word=collection.get(i);
            System.out.printf("%s -> %d\n",word.getWord(),word.getCount());
        }
    }







}
