package Monday260922;

import java.util.*;  
import java.util.ResourceBundle;  
public class LocaleExample {  
public static void main(String[] args) {  
Locale locale=Locale.getDefault();  
//Locale locale=new Locale("fr","fr");//for the specific locale   
Locale.setDefault(new Locale("sa", "in")); 

System.out.println(locale.getDisplayCountry());  
System.out.println(locale.getDisplayLanguage());  
System.out.println(locale.getDisplayName());  
//System.out.println(locale.getISO3Country());  
//System.out.println(locale.getISO3Language());  
//System.out.println(locale.getLanguage());  
//System.out.println(locale.getCountry());  
// New PRG 
        Locale enLocale = new Locale("en", "US");  
        Locale frLocale = new Locale("hi", "en");  
        Locale esLocale = new Locale("sa", "ES");  
        System.out.println("English language name (default): " +   
                            enLocale.getDisplayLanguage());  
  
        System.out.println("English language name in French: " +   
                            enLocale.getDisplayLanguage(frLocale));  
        System.out.println("English language name in spanish: " +   
                enLocale.getDisplayLanguage(esLocale));  
    }  
  
 
}  