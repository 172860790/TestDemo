package org.test.processor;

public class BasicProcessor implements ProcessService{

    private static final Integer RepeatLimit = 3;
    private static final String ReplaceStr = "";

    @Override
    public String execute(String input) {
        while(null!= getConsecutiveChar(input)){
            String consecutiveChar = getConsecutiveChar(input);
            input = input.replace(consecutiveChar,ReplaceStr);
            System.out.println(input);
        }
        return input;
    }

    public String getConsecutiveChar(String input){
        if(null==input || input.isBlank()){
            return null;
        }
        Character preChar=null ;
        Character currentChar = null ;
        int startIndex = 0;
        int repeatCount = 1;
        for(int i=0;i<input.length();i++){
            currentChar = input.charAt(i);
            if(null!=preChar && preChar.equals(currentChar)){
                repeatCount ++;
                if(startIndex!=0 && startIndex!=i-2){
                    startIndex = i-1;
                }
            }else{
                repeatCount = 1;
            }
            if(repeatCount>=RepeatLimit){
                StringBuilder builder = new StringBuilder(preChar);
                for(int repeatIndex=0;repeatIndex<RepeatLimit;repeatIndex++){
                    builder.append(currentChar);
                }
                return builder.toString();
            }
            preChar = input.charAt(i);
        }
        return null;
    }

}
