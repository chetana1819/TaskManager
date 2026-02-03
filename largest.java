// import java.util.*;

class LargestNumber{
    public int findlargest(int a, int b){
        if(a>b){
            System.out.println(a+"is largest");
            return a;
        }
        else{
            System.out.println(b+"is largest");
            return b;
        }
    }
}