package day32_CustomClass_Constructor2;

import day31_CustomClass_Constructors.Class.ScrumTask.Developer;
import day31_CustomClass_Constructors.Class.ScrumTask.ScrumTeam;
import day31_CustomClass_Constructors.Class.ScrumTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class FurkanObjects {

    public static void main(String[] args) {


        FurkanFriends furkan1 = new FurkanFriends("şükrü",29);
        FurkanFriends furkan2 = new FurkanFriends("ahmet",21);
        FurkanFriends furkan3 = new FurkanFriends("musa",35);
        FurkanFriends[] arr = {furkan1,furkan2,furkan3};

        ArrayList<FurkanFriends> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        //print all the names of furkan friends
        for (FurkanFriends furkanFriend : list) {
            System.out.println(furkanFriend.name + " : " + furkanFriend.age);
        }

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

        ScrumTeam st1 = new ScrumTeam("A","B","C",14);
        st1.addTesters(testers);
        st1.addDevelopers(developers);

        ScrumTeam st2 = new ScrumTeam("R","E","H",28);



        ArrayList<ScrumTeam> a = new ArrayList<>(Arrays.asList(st1,st2));
        System.out.println(a.get(0).testersList.get(0).name);







    }
}
