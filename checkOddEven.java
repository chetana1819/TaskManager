// import java.util.*;

class EvenOdd{
    public int evenOdd(int a){
        int ans=0;

        if(a%2==0) {
            ans=1;
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd.");
        }
        return ans;
    }
}