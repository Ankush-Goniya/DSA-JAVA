public class LogicalOperator {

        public static void main(String[] args) {
            int a = 20, b= 10, c = 5;

            // && operator
            System.out.println((a>b) && (a>c)); //true
            System.out.println((a>b) && (a<c)); //false

            // || operator
            System.out.println((c<b) || (a>b)); //true
            System.out.println((a>b) || (b>c)); //true
            System.out.println((a<c) || (b<c)); //false

            // ! operator
            System.out.println(!(a == b)); //true
            System.out.println(!(a>b)); //false


        }

}
