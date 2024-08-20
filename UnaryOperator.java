public class UnaryOperator {

        public static void main(String[] args) {
            int a = 5, b = 6;

            System.out.println(a++); //5
            System.out.println(a); // 6

            System.out.println(++b); // 7
            System.out.println(b); // 7

            int x = a++;
            int y = ++b;

            System.out.println(x); //6
            System.out.println(y); // 8

            System.out.println(a); // 7
            System.out.println(b); // 8

        }

}
