public class varargs {
    public static void main(String[] args) {
        // learn the triple dots
        leith(10,20,50,30,70);
        leith(50,20);
    }
    private static void leith (int... a){
        System.out.println("Number of arguments = " + a.length);
        for (int recapitulate: a){
            System.out.print(recapitulate + " ");
        }
        System.out.println("\n");
    }
}
