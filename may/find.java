package may;
public class find{
      public boolean ValidCorner(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            List<Integer> rowOnes = new ArrayList<>();
            for (int j = 0; j < mat[0].length; j++) {
                
                if (mat[i][j] == 1) {
                    boolean onesFound = false;
                    
                    for (int k = i + 1; k < mat.length; k++) {
                        if (mat[k][j] == 1) {
                            onesFound = true;
                            for (int col: rowOnes) {
                                if (mat[k][col] == 1) return true;
                            }
                        }
                    }
                    
                    if (onesFound) rowOnes.add(j);
                }
            }
        }
        
        return false;
    }
     public static void main(String[] args) {
          
     }
}