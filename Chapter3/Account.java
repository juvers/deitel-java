package Chapter3;

public class Account {
    // public String name; // instance variable
    private String name;

    // constructor initializes name with parameter name
    public Account(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}