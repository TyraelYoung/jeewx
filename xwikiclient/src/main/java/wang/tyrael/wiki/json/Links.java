package wang.tyrael.wiki.json;
public class Links {
    private String href;

    private String rel;

    private String type;

    private String hrefLang;

    public void setHref(String href){
        this.href = href;
    }
    public String getHref(){
        return this.href;
    }
    public void setRel(String rel){
        this.rel = rel;
    }
    public String getRel(){
        return this.rel;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setHrefLang(String hrefLang){
        this.hrefLang = hrefLang;
    }
    public String getHrefLang(){
        return this.hrefLang;
    }

}