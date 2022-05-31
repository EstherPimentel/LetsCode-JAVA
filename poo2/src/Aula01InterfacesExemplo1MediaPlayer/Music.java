package Aula01InterfacesExemplo1MediaPlayer;

public class Music implements IMedia{

    private int id;
    private String name;
    String[] artists;
    String[] label;
    double time;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

}
