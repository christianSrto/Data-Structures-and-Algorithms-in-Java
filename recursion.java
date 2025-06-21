public class recursion {
    // recursion = apply the result of a procedure, to a procedure.
    //             A reursive method calls itself. Can be a substitute for iteration
    //             Divide a problem into sub-problems of the same type as the original.
    //             Commonly used with advancing sorting algos and navigating trees
    //             pros: easier to write, easier to debug
    //             cons: slower, uses more memory as it adds to the call stack each time a function is called recursively (LIFO)
    public static void main(String[] args) {
        
        walk(5);

        System.out.println(factorial(7));

        System.out.println(power(2,8));
    }           

    private static void walk(int steps){
        if(steps < 1) 
        return; // base case
        System.out.println(" You take a step");
        walk(steps - 1); // recursive
    }

    private static int factorial(int num){
        if(num < 1) return 1;//base case
        return num * factorial(num-1); //recursive
    }

    private static int power(int base, int exponent){
        if(exponent <1) return 1;
        return base * power(base, exponent-1);
    }
}
