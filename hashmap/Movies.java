package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Movies {
    public static void main(String[] args) {
        
    HashMap <String, ArrayList<String>> library = new HashMap<>();

    ArrayList<String> fiction = new ArrayList<>();
    fiction.add("Harry potter");
    fiction.add("Uncharted");
    library.put("fiction", fiction);

    ArrayList<String> action = new ArrayList<>();
    action.add("The Assasins");
    action.add("Shadow");
    library.put("Action", action);

    ArrayList<String> comedy = new ArrayList<>();
    comedy.add("Lucky Key");
    comedy.add("Hangover");
    library.put("Comedy", comedy);

    library.get("Comedy").add("Tag");
    
    for (String subject : library.keySet()){
        System.out.println("Categories: " + subject  );
    
    ArrayList<String> movies = library.get(subject);
    for (String movie : movies){
        System.out.println("Movies: " + movie);
    }
}

    String searchMovie = "Hangover";
    boolean found = false;

    for (String subject : library.keySet()){
        ArrayList<String> movies = library.get(subject);
        for(String movie : movies){
            if (movie.contains(searchMovie)){
                System.out.println("The movie found in category: "+ subject);
                found=true;
                break;
            }
        }
    }
        if (!found) {
            System.out.println("The movie not found in any category");
        }
        }
    }

