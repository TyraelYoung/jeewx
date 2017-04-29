package wang.tyrael.wiki.json;
import java.util.List;
public class Page {
    private List<Links> links ;

    private String id;

    private String fullName;

    private String wiki;

    private String space;

    private String name;

    private String title;

    private String parent;

    private String parentId;

    private String version;

    private String author;

    private String authorName;

    private String xwikiRelativeUrl;

    private String xwikiAbsoluteUrl;

//    private Translations translations;

    private String syntax;

    private String language;

    private int majorVersion;

    private int minorVersion;

    private boolean hidden;

    private int created;

    private String creator;

    private String creatorName;

    private int modified;

    private String modifier;

    private String modifierName;

    private String comment;

    private String content;

    private String clazz;

    private String objects;

    private String attachments;

    public void setLinks(List<Links> links){
        this.links = links;
    }
    public List<Links> getLinks(){
        return this.links;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return this.fullName;
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
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setParent(String parent){
        this.parent = parent;
    }
    public String getParent(){
        return this.parent;
    }
    public void setParentId(String parentId){
        this.parentId = parentId;
    }
    public String getParentId(){
        return this.parentId;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public String getVersion(){
        return this.version;
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
    public void setXwikiRelativeUrl(String xwikiRelativeUrl){
        this.xwikiRelativeUrl = xwikiRelativeUrl;
    }
    public String getXwikiRelativeUrl(){
        return this.xwikiRelativeUrl;
    }
    public void setXwikiAbsoluteUrl(String xwikiAbsoluteUrl){
        this.xwikiAbsoluteUrl = xwikiAbsoluteUrl;
    }
    public String getXwikiAbsoluteUrl(){
        return this.xwikiAbsoluteUrl;
    }
//    public void setTranslations(Translations translations){
//        this.translations = translations;
//    }
//    public Translations getTranslations(){
//        return this.translations;
//    }
    public void setSyntax(String syntax){
        this.syntax = syntax;
    }
    public String getSyntax(){
        return this.syntax;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return this.language;
    }
    public void setMajorVersion(int majorVersion){
        this.majorVersion = majorVersion;
    }
    public int getMajorVersion(){
        return this.majorVersion;
    }
    public void setMinorVersion(int minorVersion){
        this.minorVersion = minorVersion;
    }
    public int getMinorVersion(){
        return this.minorVersion;
    }
    public void setHidden(boolean hidden){
        this.hidden = hidden;
    }
    public boolean getHidden(){
        return this.hidden;
    }
    public void setCreated(int created){
        this.created = created;
    }
    public int getCreated(){
        return this.created;
    }
    public void setCreator(String creator){
        this.creator = creator;
    }
    public String getCreator(){
        return this.creator;
    }
    public void setCreatorName(String creatorName){
        this.creatorName = creatorName;
    }
    public String getCreatorName(){
        return this.creatorName;
    }
    public void setModified(int modified){
        this.modified = modified;
    }
    public int getModified(){
        return this.modified;
    }
    public void setModifier(String modifier){
        this.modifier = modifier;
    }
    public String getModifier(){
        return this.modifier;
    }
    public void setModifierName(String modifierName){
        this.modifierName = modifierName;
    }
    public String getModifierName(){
        return this.modifierName;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    public String getComment(){
        return this.comment;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
    public void setClazz(String clazz){
        this.clazz = clazz;
    }
    public String getClazz(){
        return this.clazz;
    }
    public void setObjects(String objects){
        this.objects = objects;
    }
    public String getObjects(){
        return this.objects;
    }
    public void setAttachments(String attachments){
        this.attachments = attachments;
    }
    public String getAttachments(){
        return this.attachments;
    }

}