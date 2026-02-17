public class Usecase1 {
    public static void main(String[] args) {
        // Defining segments for better modularity
        String outerO = " *** ";
        String innerO = "* *";
        String topP   = "**** ";
        String midP   = "* * ";
        String lowP   = "* ";
        String sLine  = "**** ";

        // Using String.join to build the lines efficiently
        System.out.println(String.join("  ", outerO, outerO, topP,  sLine));
        System.out.println(String.join("  ", innerO, innerO, midP,  "* "));
        System.out.println(String.join("  ", innerO, innerO, "**** ", sLine));
        System.out.println(String.join("  ", innerO, innerO, lowP,  "    *"));
        System.out.println(String.join("  ", outerO, outerO, lowP,  "**** "));
    }
}
