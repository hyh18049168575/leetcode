public class No861 {
    public static int matrixScore(int[][] A) {
        int result=0;
        int count =0;
        int m =A[0].length;
        int n =A.length;
        for (int i=0;i<n;i++){
            if(A[i][0]==0){
                for(int a=0;a<m;a++){
                    A[i][a]=reverse(A[i][a]);
                }
            }
        }
        result= (int) Math.pow(2, m-1)*n;
        for(int i=1;i<m;i++){
            for(int a=0;a<n;a++){
                count+=A[a][i];
            }
            if (count<=n/2){
                count=n-count;
                result+=(int)Math.pow(2,m-i-1)*count;
                count=0;
            }
            else {
                result+=(int)Math.pow(2,m-i-1)*count;
                count=0;
            }
        }
        return result;
    }
    public static int reverse(int a){
        if (a==1){
            a =0;
        }
        else if(a==0) {
            a =1;
        }
       return a;
    }
}
