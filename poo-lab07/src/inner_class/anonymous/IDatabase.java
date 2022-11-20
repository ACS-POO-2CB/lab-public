/**
 * UPB, ACS, POO CB 2022-2023
 * @author Gabriel Gutu-Robu
 *
 * DO NOT MODIFY THIS FILE
 */
package inner_class.anonymous;

public interface IDatabase {
    void connect();
    void disconnect();

    void insert(Object object);
    void update(Object object);
    void delete(Object object);
}
