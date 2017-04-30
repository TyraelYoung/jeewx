package wang.tyrael.wiki.json;
import java.util.List;
public class SearchResult {
    private List<Links> links ;

    private List<SearchResults> searchResults ;

    private String template;

    /**
     * 返回第一个的url
     * @return
     */
    public String getFirst(){
        if(searchResults == null || searchResults.isEmpty()){
            return null;
        }else{
            return searchResults.get(0).getFirst();
        }

    }

    public void setLinks(List<Links> links){
        this.links = links;
    }
    public List<Links> getLinks(){
        return this.links;
    }
    public void setSearchResults(List<SearchResults> searchResults){
        this.searchResults = searchResults;
    }
    public List<SearchResults> getSearchResults(){
        return this.searchResults;
    }
    public void setTemplate(String template){
        this.template = template;
    }
    public String getTemplate(){
        return this.template;
    }

}