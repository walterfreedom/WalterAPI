package jottero.rocks.walterapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("waltermodel")
public class waltermodel {
    @Id
    public String id;

    @Override
    public String toString() {
        return "waltermodel{" +
                "id=" + id +
                ", walter='" + walter + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public void setWalter(String walter) {
        this.walter = walter;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String walter;
    public String text;

    public waltermodel(String walter, String text) {
        this.walter = walter;
        this.text=text;
    }

    public String getId() {
        return id;
    }

    public String getWalter() {
        return walter;
    }

}
