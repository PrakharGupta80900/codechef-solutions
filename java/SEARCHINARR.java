public static String solve(int N, int X, int[] A) {
    boolean bool=false;
    for(int i=0;i<A.length;i++){
        if(A[i]==X){
            bool=true;
        }
    }
    if(bool){
        return "YES";
    }
    return "NO";
    
}