package RecorderRadio;
class Recording {

    private String title;
    private String artist;
    private int seconds;
    
    public Recording()
    {
        title="";
        artist="";
        seconds=0;
    }
    
    public void setTitle(String title)
    {
        this.title=title;
    }
    
    //Set artist name
    public void setArtist(String artist)
    {
        this.artist=artist;
    }
    
    //Set seconds
    public void setSeconds(int seconds)
    {
        this.seconds=seconds;
    }
    
    //Return title
    
    public String getTitle()
    {
        return title;
    }
    
    //Return artist
    
     	public String getArtist()
        {
            return artist;
        }
        
        //Return title
        
        public int getSeconds()
        {
            return seconds;
        }
        
}

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
