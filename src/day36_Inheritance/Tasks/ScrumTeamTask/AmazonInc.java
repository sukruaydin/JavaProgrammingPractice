package day36_Inheritance.Tasks.ScrumTeamTask;

public class AmazonInc {

    public static void main(String[] args) {

        ProductOwner productOwner1 = new ProductOwner();
        productOwner1.setInfo("Kuzzat",35,'M',12345,"PO",250_000,15);

        BusinessAnalyst businessAnalyst1 = new BusinessAnalyst();
        businessAnalyst1.setInfo("Asya",32,'F',12346,"BA", 195_000,true);

        ScrumMaster scrumMaster1 = new ScrumMaster();
        scrumMaster1.setInfo("Oğuz",32,'M',123457,"Scrum Master",155_000);

        Tester tester1 = new Tester();
        tester1.setInfo("şükrü",29,'M',11,"QA",120_000,true);
        Tester tester2 = new Tester();
        tester1.setInfo("Hale",25,'F',12,"QA",100_000,false);
        Tester[] testers = {tester1,tester2};

        Developer developer1 = new Developer();
        developer1.setInfo("Bekir",55,'M',21,"Developer",165_000,"Java");
        Developer developer2 = new Developer();
        developer1.setInfo("Hülya",49,'F',22,"Developer",155_000,"Java");
        Developer developer3 = new Developer();
        developer1.setInfo("Hatice",25,'F',23,"Developer",145_000,"Python");
        Developer[] developers = {developer1,developer2,developer3};

       // ScrumTeam scrumTeam1 = new









    }

}
