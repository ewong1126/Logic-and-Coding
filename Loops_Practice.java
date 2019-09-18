public class Loops_Practice {
    public static void main ( String[] args) {
        int i, cube;
        
        System.out.println();
        System.out.println("i\tcube i");
        for (i = 1; i <=10; i = i + 1) {
        cube = i * i * i;
        System.out.println(i + "\t" + cube) ;
}
        int j, odds;
        
        System.out.println();
        System.out.println("j");
        for (j = 99; j >= 1; j -= 2) {
           System.out.println(j) ;
}
        int k;
        
        String s = "The quick brown fox jumped over the lazy dog.";
        System.out.println();
        System.out.println("Characters\tk");
        System.out.println("The quick brown fox jumped over the lazy dog.");
        for (k = 0; k <= 44; k = k ++) {    
            k = s.length ();
            char n = s.charAt (0);
            System.out.println("\t"+"\t"+k);
        }
}
}