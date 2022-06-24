import java.util.ArrayList;
import java.util.List;

public class Digits {

    static String[] oneDigitNumbers={"","one","two","three","four","five","six","seven","eight","nine"};
    static String[] twoDigits={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    static String[] twoDigitsAbove={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    static String[] powers={"","thousand","million","billion","trillion"};



    public static void main(String[] args){
        getWords("12345670");
    }

    public static String getWords(String num){
        String newNum="";
        if(num.length()%3==0){

        }
        else{
            int remainder=num.length()%3;
            for(int i=0;i<3-remainder;i++){
                newNum+="0";
            }
            newNum+=num;

            List<String> numList=getHundreds(newNum);


            String data=convertToWord(numList);
            System.out.println(data);



        }
        return "";

    }

    public static List<String> getHundreds(String num){
        List<String> hundreds=new ArrayList<>();
        String newNum="";
        for(int i=1;i<=num.length();i++){
            newNum+=String.valueOf(num.charAt(i-1));
            if(i%3==0){
                hundreds.add(newNum);
                newNum="";
            }
        }
        return hundreds;


    }

    public static String convertToWord(List<String> numList){
        String word="";
        for(int i=0;i<numList.size();i++){
            String data=convertToHundred(numList.get(i));
            word=word+" "+ data + " "+powers[numList.size()-1-i];
        }
        return word;
    }

    public static String convertToHundred(String num){
        String val="";
        int hundreds=Integer.parseInt(String.valueOf(num.charAt(0)));
        int tens=Integer.parseInt(String.valueOf(num.charAt(1)));
        int ones=Integer.parseInt(String.valueOf(num.charAt(2)));

        if(hundreds!=0){
            val+=oneDigitNumbers[hundreds] + " hundred ";
        }

        if(tens!=0){
            if(tens==1){
                val+=twoDigits[ones];
            }
            else{
                val+=twoDigitsAbove[tens-2]+" "+oneDigitNumbers[ones];
            }
        }

        else if(tens==0){
            val+=oneDigitNumbers[ones];
        }

        return val;


    }






}
