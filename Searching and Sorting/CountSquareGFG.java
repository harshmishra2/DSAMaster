class CountSquaresGFG {
    static int countSquares(int n) {
        
        int res=0;
        
        for(int i=1; i<n; i++){
            if(i*i<n){
                res++;
            }
            else if (i*i>n){
                break;
            }
        }
        return res;
        
    }
}

//https://www.geeksforgeeks.org/problems/count-squares3649/1
