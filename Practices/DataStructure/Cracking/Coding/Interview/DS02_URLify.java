package Practices.DataStructure.Cracking.Coding.Interview;

public class DS02_URLify {

    public String createURLify(String word, int trueLength) {


        StringBuilder finalString = new StringBuilder();


        for (int i = 0; i < trueLength; i++) {
            if (word.charAt(i) == ' ') {
                finalString.append("%20");
            } else {
                finalString.append(word.charAt(i));
            }
        }
        return finalString.toString();
    }

    public String createURLifySecond(char[] wordSecond, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (wordSecond[i] == ' ') {
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount * 2;

        for (int i = trueLength-1; i > 0; i--) {
            if(trueLength<wordSecond.length)wordSecond[trueLength]='\0';

            if (wordSecond[i] == ' ') {
                wordSecond[index-1] = '0';
                wordSecond[index - 2] = '2';
                wordSecond[index - 3] = '%';
                index=index-3;
            }else {
                wordSecond[index-1]=wordSecond[i];//Have moved the character using the total index with space.
                index--;
            }
        }
        return wordSecond.toString();
    }
}