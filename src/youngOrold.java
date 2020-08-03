public class youngOrold {


        // Boolean operators
        // >,  < , == , >= , <= , !=
        // &&, ||

        static final int BATA = 19;
        static final int ADULTO = 30;

        public static void main(String[] args) {
            int edadNiJan = 21;
            boolean bataSiJan = edadNiJan <= BATA;
            System.out.println("Bata ba si Jan? " + bataSiJan);

            int edadNiRussel = 26;
            System.out.println("Matanda ba si Russel? " + (edadNiRussel > BATA) );

            System.out.println("Young adult ba si Russel? " + (edadNiRussel > BATA && edadNiRussel < ADULTO) );


    }

}
