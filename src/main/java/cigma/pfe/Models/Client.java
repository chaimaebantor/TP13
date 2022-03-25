package cigma.pfe.Models;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Client {
    private long id;
    private String name;



    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }
}
