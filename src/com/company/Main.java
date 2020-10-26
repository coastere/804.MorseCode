package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] words = {"gin", "zen", "gig", "msg"};

        String[] transformed = new String[words.length];

        for (int i = 0; i < words.length; i++) {
           transformed[i]=transform(words[i]);
        }

        int uniq=0;
        if(transformed.length>0) uniq=1;

        for (int i = 1; i <transformed.length ; i++) {
            boolean isuniq=true;
            for (int j = 0; j <i ; j++) {
               // System.out.println("i:"+i+" "+transformed[i]+" j:"+j+" "+transformed[j]);
                if (transformed[i].equals(transformed[j])) {
                    isuniq=false;
                    continue;
                }
            }
            if (isuniq) {
                uniq++;
            }
        }
        System.out.println(uniq);

    }

    public static String transform(String str) {
        String [] code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char [] cchar =str.toCharArray();
        String result="";

        for (int i = 0; i <cchar.length ; i++) {
            result+=code[(int)(cchar[i]-'a')];
        }
//        System.out.println("return for :"+result );
        return result;
    }
}
