public class RecursionRevision{
    public static void main(String args[]){
        RecursionBasic rb = new RecursionBasic();
        // rb.printDecrease(5);
        Factorial fact = new Factorial();
        // System.out.print(fact.printFactorial(5));

        // System.out.print(printSum(20));
        int arr[] = {10, 30,40,20};
        // findIndices(arr, 1, 0);
        
        String name = "level";
        // stringRecursion(name, 'a', 0);
        // System.out.print(stringReverse(name, 0));
        // System.out.print(palindromeString(name, 0, name.length()-1));
        // System.out.print(lastOccur(arr, 8, 0));
        

        String xname[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int n = 1023;
        // pp(xname, n);

        System.out.print(frogJump(arr, 0));
    } 


    static int frogJump(int arr[], int i){
        if( i == arr.length-1){
            return 0;
        }

        int x = Math.abs(arr[i+1] - arr[i]) +  frogJump(arr, i+1);
        if(i == arr.length-2){
            return x;
        }

        int y =Math.abs(arr[i+2] - arr[i]) +  frogJump(arr, i+2) ;
        return Math.min(y,x);
    }



    static void pp(String name[], int n){
        if( n == 0){
            return;
        }

        int x = n%10;
        pp(name, n/10);
        System.out.print(name[x] + " ");
    }
    static boolean palindromeString(String name, int li, int ri){
        
        if( li == ri ){
            return true;
        }

        if( name.charAt(li) != name.charAt(ri)){
            // System.out.print("Not a Palindrome");
            return false;
        }
        return palindromeString(name, li+1, ri-1);
    }

    static String stringReverse(String name, int idx){
        if( idx == name.length()){
            return "";
        }
        String ans = stringReverse(name, idx+1);
        return ans+name.charAt(idx);
    }
    static void stringRecursion(String name, char x, int idx){
        if( idx == name.length()){
            return;
        }

        if( name.charAt(idx) != x){
            System.out.print(name.charAt(idx));
        }

        stringRecursion(name, x, idx+1);
    }

    static int lastOccur(int arr[], int target, int idx){

        if( idx == arr.length ){
            return -1;
        }
        int ans = lastOccur(arr, target, idx+1);

        if(arr[idx] == target && ans == -1){
            return idx;
        }

        return ans;
    }


    static void findIndices(int arr[], int target, int idx){
        if( idx == arr.length){
            return;
        }

        if(arr[idx] == target){
            System.out.print(idx + " ");
        }

        findIndices(arr, target, idx+1);
    }

    static void array(int arr[], int idx){
        if( idx == arr.length){
            return;
        }
        System.out.print(arr[idx]);
        array(arr, idx+1);
    }
    
    
    static int commonDividor(int n, int y){ // comman divisor
     
     if( y == 0){
        return n;
     }
     return commonDividor(y, n%y);
    }
    
 
    
    static int printSum(int n){
        if(n == 1){
            return n;
        }
        if(n%2 == 0){
            return printSum(n-1) - n;
        }
       return printSum(n-1) + n;
        
    }
    
    static int countDigit(int n){
        // base case
        if(n/10 == 0 || n == 0) {
            return 1;
        }
        return countDigit(n/10)+1;
    }
    
static int power(int n, int pow){
    if( pow == 0){
        return 1;
    }
    int ans = power(n, pow/2);
    if( pow%2 == 0){
        return ans*ans;
    }
        return ans*ans*n;
}

static void kMultiple(int n, int k){
    if(k == 1){
        System.out.print(n + " ");
        return;
    }
   
    kMultiple(n, k-1);
    System.out.print(n*k + " ");
}

}

class Factorial{
    int printFactorial(int n){
        if(n == 0){
            return 1;
        }
        int small = printFactorial(n-1);
        int ans = n* small;
        return ans;
 
    }
}

class RecursionBasic{
    
    void printIncrease(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        printIncrease(n-1);
        System.out.print(n);
    }

    void printDecrease(int n){
        
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n);
        printDecrease(n-1);
    }
    
}

