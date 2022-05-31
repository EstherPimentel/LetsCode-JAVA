package Aula01InterfacesExemplo1MediaPlayer;

public interface IPlayer {

    void play(int id);
    void pause();
    void stop();
    void restart();
    void skip();
    void forwards(int seconds);
    void backwards(int seconds);
    void loop();

}
