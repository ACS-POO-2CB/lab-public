/**
 * DO NOT MODIFY THIS FILE
 */
package inner_class.anonymous;

import java.util.ArrayList;

public interface IDatabase {
    void connect();
    void disconnect();

    void insert(Object object);
    void update(Object object, Object newObject);
    void delete(Object object);

    ArrayList<Object> getAll();
}

