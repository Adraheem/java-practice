package David;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
//        for(int count = 1; count <= 10; count ++){
//            for(int star = 0; star < count; star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int count = 0; count < 10; count++){
            for (int i = 0; i < count; i++) {
                System.out.print("  ");
            }
            for(int star = 10; star > count; star--){
                System.out.print(" *");
            }
//                System.out.printf("%20s", "*".repeat(count));
            System.out.println();
        }
    }
}
