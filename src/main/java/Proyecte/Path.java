package Proyecte;
import lombok.*;

public class Path {
    public static class Web {
        @Getter public static final String CALLRECORDS = "/callrecords/";
        @Getter public static final String INDEX = "/";
    }

    public static class Template {
        public final static String CALLRECORDS_ALL = "/velocity/callrecords.vm";
        public final static String INDEX = "/velocity/index.vm";

        //public static final String NOT_FOUND = "/velocity/notFound.vm";
    }

}
