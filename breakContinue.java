public class breakContinue {
    public static void main(String[] args) {

        //breaks out of loop at 5 (STOP loop)
        for (int i = 0; i < 10; i++) {
            if (i == 5) {

                break;
            }
            System.out.print(i+" ");
        }

        System.out.println();

        //skips 5 and continues loop (SKIP loop)
        for (int i = 0; i < 10; i++) {
            if (i == 5) {

                continue;
            }
            System.out.print(i+" ");
        }

    }
}
