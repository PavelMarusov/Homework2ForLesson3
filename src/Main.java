public class Main {



    public static void main(String[] args) {

        String [] people = {"Pasha", "Sasha", "Masha"};
        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[2]);

        for (int i = 0; i < people.length ; i++) {
            switch (i){
                case 0:
                    System.out.println("good morning, Pasha");
                    break;
                case 1:
                    System.out.println("good day, Sasha");
                    break;
                case 2:
                    System.out.println("good evening, Masha");
                    break;


        }


        }

    }
}
