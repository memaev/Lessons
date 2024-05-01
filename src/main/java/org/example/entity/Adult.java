package org.example.entity;

public class Adult extends Person {
    private String workplace;

    public Adult(String workplace) {
        super("John", 34, 80, 180);
        this.workplace = workplace;
    }

    public Adult(Person person, String workplace) {
        super(person.getName(), person.getAge(), person.getWeight(), person.getHeight());
        this.workplace = workplace;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
}
