package interfaceJava;

interface Playable {

    void play();
}

class Song implements Playable{
    private String title;
    private String artist;

    public Song(String title, String artist){
        this.title=title;
        this.artist=artist;
    }

    public void play(){
        System.out.println("playing song: " + title + " by " + artist);
    }
}
class Podcast implements Playable{
    private String host;
    private String episodeName;

    public Podcast(String host, String episodeName){
        this.host=host;
        this.episodeName=episodeName;
    }

    public void play(){
        System.out.println("playing podcast: " + episodeName  + " hosted by " +host );
    }
}
class Play{
    public static void main(String[] args){
        Song song = new Song("Shape of you","Ed Sheeran");
        song.play();

        Podcast podcast = new Podcast("Navin Reddy" , "Tech Show");
        podcast.play();
    }
}