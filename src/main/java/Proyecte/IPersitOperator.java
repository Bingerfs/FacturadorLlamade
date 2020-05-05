package Proyecte;

import java.util.List;

public interface IPersitOperator {
    void add(Object object);
    List<Object> getAll(Object object);
    Object getById();

}