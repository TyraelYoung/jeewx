package wang.tyrael.wiki.json;
import java.util.List;
public class SearchResults {
    private List<Links> links ;

    private String type;

    private String id;

    private String pageFullName;

    private String title;

    private String wiki;

    private String space;

    private String pageName;

    public long modified;

    private String author;

    private String authorName;

    private String version;

    private String language;

    private String className;

    private String objectNumber;

    private String filename;

    private double score;

    private String object;

    /**
     * 返回第一个的url
     * @return
     */
    public String getFirst(){
        if(links == null || links.isEmpty()){
            return null;
        }else{
            return links.get(0).getHref();
        }

    }

    public void setLinks(List<Links> links){
        this.links = links;
    }
    public List<Links> getLinks(){
        return this.links;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setPageFullName(String pageFullName){
        this.pageFullName = pageFullName;
    }
    public String getPageFullName(){
        return this.pageFullName;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setWiki(String wiki){
        this.wiki = wiki;
    }
    public String getWiki(){
        return this.wiki;
    }
    public void setSpace(String space){
        this.space = space;
    }
    public String getSpace(){
        return this.space;
    }
    public void setPageName(String pageName){
        this.pageName = pageName;
    }
    public String getPageName(){
        return this.pageName;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public String getVersion(){
        return this.version;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return this.language;
    }
    public void setClassName(String className){
        this.className = className;
    }
    public String getClassName(){
        return this.className;
    }
    public void setObjectNumber(String objectNumber){
        this.objectNumber = objectNumber;
    }
    public String getObjectNumber(){
        return this.objectNumber;
    }
    public void setFilename(String filename){
        this.filename = filename;
    }
    public String getFilename(){
        return this.filename;
    }
    public void setScore(double score){
        this.score = score;
    }
    public double getScore(){
        return this.score;
    }
    public void setObject(String object){
        this.object = object;
    }
    public String getObject(){
        return this.object;
    }

}