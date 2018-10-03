public class yinYang{
    public static void main (String [] args) {
        
        int yin = 8;
        int yang = 19;
        
        yin = yin+yang;
        yang = yin - yang;
        yin = yin - yang;
        
        //System.out.println(yin);
        //System.out.println(yang);
        
        int yin2 = 31;
        int yang2 = 7;
        int t = yin2;
        
        yin2 = yang2;
        yang2 = t;
        
        System.out.println(yin2);
        System.out.println(yang2);
        
        
    }
}
       
        