public class LabActivity1 {
    public static void main(String[] args) {
 
        Movie movie1 = new Movie();
        movie1.title = "John Wick";
        movie1.genre = "Action";
        movie1.duration = 101;
 
        Movie movie2 = new Movie();
        movie2.title = "Kingsman: The Secret Service";
        movie2.genre = "Action";
        movie2.duration = 129;
 
        Movie movie3 = new Movie();
        movie3.title = "The Matrix";
        movie3.genre = "Sci-Fi";
        movie3.duration = 136;
 
        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}