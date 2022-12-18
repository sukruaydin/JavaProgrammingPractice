package day31_CustomClass_Constructors.Tasks;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA","Shining","Thriller","1980","Stanley Kubrik");

        String name1 = "Jack Nicholson";
        String name2 = "Shelley Duvall";
        String name3 = "Danny Lloyd";
        String name4 = "Scatman Crothers";
        String name5 = "Barry Nelson";

        String[] names = {name1,name2,name3,name4,name5};

        movie1.addCasts(names);

        System.out.println("movie1 = " + movie1);


    }

}

/*
 3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */
