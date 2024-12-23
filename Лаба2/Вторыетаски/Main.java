public class Main { 

    public static void main(String [] args){ 
        System.out.println();
    }

    public static String duplicateChars(String x, String y){
        char[] charX = x.toCharArray();
        char[] charY = y.toCharArray();
        char[] charZ = new char[4]; 
        boolean s = true;
        for (int i = 0; i < charX.length; i++){
            for (int j = 0; j < charY.length; j++){
                if (charX[i] == charY[j]){
                    s = false;
                    continue;
                }
            }
            if (s){
                charZ.add(charX[i]);
            }
        } 
    
    }
            
        
}