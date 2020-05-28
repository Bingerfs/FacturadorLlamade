package Proyecte;

import java.util.List;
import static spark.Spark.*;

public class SparkUI implements UIService {


    @Override
    public void showCallRecords(List<String> callRecordList,String extra){
        get("/hello", (req, res) -> "<html><body></body></html>");

    }


}
