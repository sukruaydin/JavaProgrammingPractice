package day37_Inheritance_SuperKeyword.ScrumTeamTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Kuzzat",38,'M',1,250_000,company);

        BusinessAnalyst ba = new BusinessAnalyst("Asya",37,'F',2,230_000,company);

        ScrumMaster sm = new ScrumMaster("Şükrü",29,'M',3,200_000,company);

        Tester tester1 = new Tester("Oğuz",31,'M',11,"QA Lead",155_000,company);
        Tester tester2 = new Tester("Kavak",30,'M',12,"QA",145_000,company);
        Tester tester3 = new Tester("Pişgin",32,'M',13,"QA",135_000,company);
        Tester[] testers = {tester1,tester2,tester3};

        Developer developer1 = new Developer("Hatice",25,'F',21,"Dev Lead",165_000,company);
        Developer developer2 = new Developer("Ahmet",26,'M',22,"Developer",140_000,company);
        Developer developer3 = new Developer("Behcet",21,'M',23,"Developer",120_000,company);
        Developer developer4 = new Developer("Cevat",19,'M',24,"Developer",100_000,company);
        Developer[] developers = {developer1,developer2,developer3,developer4};

        ScrumTeam scrumTeam1 = new ScrumTeam(po,ba,sm);

        System.out.println("scrumTeam1 = " + scrumTeam1);

        scrumTeam1.addTester(testers);
        scrumTeam1.addDeveloper(developers);

        System.out.println("scrumTeam1 = " + scrumTeam1);

        System.out.println("------------------------------------------------------------");

        //print all the testers' names and salary
        for (Tester tester : scrumTeam1.testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }

        System.out.println("------------------------------------------------------------");

        //print all the testers' names and salary
        for (Developer developer : scrumTeam1.developers) {
            System.out.println(developer.name + " : " + developer.salary);
        }


    }

}
