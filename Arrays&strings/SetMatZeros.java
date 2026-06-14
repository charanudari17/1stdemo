public class SetMatZeros {

        public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;
        for(int i=0;i<cols;i++){
            if(matrix[0][i]==0){
                firstRowZero = true;
            }

        }
        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){
                firstColZero = true;
            }

        }
        for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++){
            if(matrix[i][j]==0){
                matrix[i][0]=0;
                matrix[0][j]=0;

            }
           }

        }
    for(int i=1;i<rows;i++){
        for(int j=1;j<cols;j++){
            if(matrix[i][0]==0||matrix[0][j]==0){
                matrix[i][j]=0;
            }

        }
    }
     for(int i=0;i<cols;i++){
            if(firstRowZero){
                matrix[0][i]=0;
                
            }

        }
        for(int j=0;j<rows;j++){
            if(firstColZero){
               matrix[j][0]=0;
            }
    }
}
}