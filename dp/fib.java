// package dp;

public class fib {
public int fiban(int n){
    if(n<=1){
        return n;
    }
    return fiban(n-1)+fiban(n-2);
}
    
}