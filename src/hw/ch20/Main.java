package hw.ch20;

public class Main {
   
    static final String RED     = "\u001B[31m";
    static final String GREEN   = "\u001B[32m";
    static final String YELLOW  = "\u001B[33m";
    static final String BLUE    = "\u001B[34m";
    static final String MAGENTA = "\u001B[35m";
    static final String CYAN    = "\u001B[36m";
    static final String RESET   = "\u001B[0m";

    public static void main(String[] args) {
        String input;
        
        if (args.length == 0) {
            input = "1212123";
        } else {
            input = args[0];
        }

        BigString bs = new BigString(input);

        // 1(RED) 2(BLUE) 1(GREEN) 2(MAGENTA) 1(CYAN) 2(YELLOW) 3(BLUE)
        if (input.equals("1212123")) {
            String[] colors = { RED, BLUE, GREEN, MAGENTA, CYAN, YELLOW, BLUE };
            bs.print(colors);
        } else {
            bs.print();
        }
    }
}