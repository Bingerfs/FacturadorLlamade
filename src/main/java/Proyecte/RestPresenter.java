package Proyecte;

public class RestPresenter implements RestBoundaryOut {
    private JsonUtil json = new JsonUtil();
    @Override
    public Object onRestRetrieval(Object o) {
        return json.dataToJson(o);
    }
    
    
}