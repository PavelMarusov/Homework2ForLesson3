public class Main {



    public static void main(String[] args) {

        String [] people = {"Pasha", "Sasha", "Masha"};
        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[2]);

        for (int i = 0; i < people.length ; i++) {
            switch (i){
                case 0:
                    System.out.println("good morning," + people[0]);
                    break;
                case 1:
                    System.out.println("good day," + people[1]);
                    break;
                case 2:
                    System.out.println("good evening," + people[2]);
                    break;


        }


        }

    }
}
