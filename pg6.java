class StringFormatter {  
public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  
} 

public class pg6 {  
public static void main(String[] args) {  
    System.out.println(StringFormatter.reverseWord("Sree Narayana Gurukualam College Of Engineering"));  
    System.out.println(StringFormatter.reverseWord("Master of Computer Application"));    
    }  
}  