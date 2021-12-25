package jottero.rocks.walterapi;

public class waltermodel {
    private final long id;
    private final String walter;

    public waltermodel(long id, String walter) {
        this.id = id;
        this.walter = walter;
    }

    public long getId() {
        return id;
    }

    public String getWalter() {
        return walter;
    }

}
