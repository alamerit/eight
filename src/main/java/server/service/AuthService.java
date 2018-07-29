package server.service;

/**
 * @author Shafikov A. & help Evgenii Chentsov
 */
public interface AuthService {

    void start();

    void stop();

    String getNickByLoginPass(String login, String password);

}
