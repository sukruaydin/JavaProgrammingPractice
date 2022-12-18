package day35_OOP_Encapsulation.Tasks.ScrumTask;



public class MyScrumTeam {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Oğuz",11,"QA",110_00);
        Tester tester2 = new Tester("Kavak",12,"QA",100_00);
        Tester tester3 = new Tester("Pişgin",13,"QA",95_000);
        Tester tester4 = new Tester("Şükrü",14,"QA",75_000);
        Tester[] testers = {tester1,tester2,tester3,tester4};


        Developer developer1 = new Developer("Bekir",21,"Developer",155_000);
        Developer developer2 = new Developer("Hülya",22,"Developer",145_000);
        Developer developer3 = new Developer("Hale",23,"Developer",185_000);
        Developer developer4 = new Developer("Nur",24,"Developer",115_000);
        Developer developer5 = new Developer("Aydın",25,"Developer",195_000);
        Developer[] developers = {developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrumTeam1 = new ScrumTeam("Kuzzat","Asya","Taş",14);
        scrumTeam1.addTester(testers);
        scrumTeam1.addDeveloper(developers);

        System.out.println("scrumTeam1 = " + scrumTeam1);

        System.out.println("------------------------------------------");

        //print all the testers' names and salaries
        for (Tester tester : scrumTeam1.getTestersList()) {
            System.out.println(tester.getName() + " : " + tester.getSalary());
        }

        System.out.println("------------------------------------------");

        //print all the developers' names and salaries
        for (Developer developer : scrumTeam1.getDevopsList()) {
            System.out.println(developer.getName() + " : " + developer.getSalary());
        }

        System.out.println("------------------------------------------");

        //remove the tester --> ID : 14
        scrumTeam1.getTestersList().removeIf( p -> p.getEmployeeID() == 14); //şükrü is fired
        //remove the developer --> ID : 25
        scrumTeam1.getDevopsList().removeIf( p -> p.getEmployeeID() == 25); //aydın is fired

        System.out.println("scrumTeam1 = " + scrumTeam1);



    }

}
