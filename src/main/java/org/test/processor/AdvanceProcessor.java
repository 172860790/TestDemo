package org.test.processor;

public class AdvanceProcessor extends BasicProcessor implements ProcessService{

    private static final String Alphabet = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public String execute(String input) {
        while(null!= getConsecutiveChar(input)){
            String consecutiveChar = getConsecutiveChar(input);
            String replaceStr =getReplaceChar(consecutiveChar);
            if(null!=replaceStr){
                input = input.replace(consecutiveChar,replaceStr);
                System.out.println(input+", "+consecutiveChar+" is replaced by "+replaceStr);
            }
        }
        System.out.println(input);
        return input;
    }

    public String getReplaceChar(String consecutiveChar){
        if(null!=consecutiveChar && !consecutiveChar.isBlank() ){
            int currentIndex =  Alphabet.indexOf(consecutiveChar.charAt(0));
            if(currentIndex>0){
                return Alphabet.substring(currentIndex-1,currentIndex);
            }else if(currentIndex==0){
                return "";
            }
        }
        return null;
    }
}
