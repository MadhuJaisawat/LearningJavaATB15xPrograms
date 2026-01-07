package ex_14_Functions;

public class ex4_ReturnType2 {
    public static void main(String[] args) {

        String response = return_type();
        System.out.println(response);
        int num= return_typeInt();
        System.out.println(num);
    }
        static String return_type(){
            System.out.println("Return string");
            return "Test String";
            // we can't make another function inside a function . we can call but not create
        }
        static int return_typeInt() {
            System.out.println("returns Integer");
            return 100;
        }

        static boolean boolean_type() {
            System.out.println("return boolean");
            return true;
        }
        static float return_float() {
            System.out.println("return float");
            return 3.14f;
        }
        static byte return_byte() {
            System.out.println("return byte");
            return 100;
        }
        static long return_long() {
            return 111555l;
        }


    }

