public class Album {
    String title,artist;
    Song[] tracklist;
    public Album(String t,String a,Song []track){
        title=t;
        artist=a;
        int n=track.length;
        tracklist=new Song[n];
        for(int i=0;i<n;i++)
        {
            tracklist[i]=track[i];
        }
    }
    public int getNumTracks(){
        return this.tracklist.length;
    }
    public Song getTrack(int n){
        if(n<this.tracklist.length)
            return tracklist[n];
        else
            return null;
    }
    public boolean comesBefore(Album a){
        if(this.artist.compareToIgnoreCase(a.artist)<0)
        {
            return true;
        }
        else if (this.artist.equalsIgnoreCase(a.artist))
        {
            if(this.title.compareToIgnoreCase(a.title)<0)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public void displayAlbum(){
        System.out.print(title+" - "+artist+" ("+tracklist.length);
        if(tracklist.length==1)
            System.out.println("track)");
        else
            System.out.println("tracks)");
    }
    public void displayTrackList(){
        int n=tracklist.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(i+" ");
            tracklist[i].display();
        }
    }
}