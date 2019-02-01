package enums_reeeeeeeeeeeeeeee;

import java.util.Scanner;
public class encoded{

    public static void main(String[] args) {
        
        Scanner Blyat = new Scanner(System.in);
        int testcases = Blyat.nextInt();
        Blyat.nextLine();
        
        for (int zax = 0; zax < testcases; zax++){
            String str = Blyat.nextLine();
            int len = (int)Math.sqrt(str.length());
        
            for (int j = 0; j < len; j++)
            	for (int i = len - 1; i < str.length(); i += len)
            		System.out.print(str.charAt(i - j));
            	System.out.println();
        }

    Blyat.close();

    }
        

    
}
