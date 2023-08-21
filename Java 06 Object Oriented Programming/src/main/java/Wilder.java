public class Wilder {

    private String firstName;
    private boolean isPresent;


    public Wilder(){}

    public Wilder(String firstName) {
        this.firstName = firstName;
    }
    public Wilder(String firstName, boolean isPresent) {
        this.firstName = firstName;
        this.isPresent = isPresent;
    }


    public String whoAmI(boolean isPresent){
        if(isPresent){
        return "Hi, My name is "+firstName+" and I am present";

        }else{
            return "Hi, My name is "+firstName+" and I am not present";
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
