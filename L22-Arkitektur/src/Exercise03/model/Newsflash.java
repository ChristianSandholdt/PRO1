package Exercise03.model;

public class Newsflash {

    private String header;
    private String content;
    private int version;

    public Newsflash(String header, String content){
        this.header = header;
        this.content = content;
        this.version = version;
    }

    public int getVersion(){
        return version;
    }

    public String getHeader(){
        return header;
    }

    public String getContent(){
        return content;
    }

    public void setContent(){
        this.content = content;
    }

    public void setHeader(){
        this.header = header;
    }

    public String toString(){
        return header + " " + version;
    }
}
