public class Author {
    private String name;
    private String lastName;
    private String patronymic;

    public Author(String name, String patronymic, String lastName) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String authorNameFull() {
        return name + " " + patronymic + " " + lastName;
    }
}
