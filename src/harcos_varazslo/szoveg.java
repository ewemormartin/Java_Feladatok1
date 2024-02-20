package harcos_varazslo;

public class szoveg {
    
    public static void main(String[] args) {
        
        String eredeti = "abc.12x";
        String uj = eredeti.substring(1);
//        System.out.println(uj);
        
        
        String s = eredeti.substring(4, 6);
        System.out.println(eredeti);
        
        
        int szam = Integer.parseInt(uj);
        int hossz = eredeti.length();
        System.out.println("Első: " + s.charAt(0));
        
        System.out.println("abc-vel kezdődik " + s.startsWith("abc"));
        System.out.println("x-re végződik " + s.endsWith("x"));
        System.out.println("van benne ");
        System.out.println("replace" );
        
    }
    
}
