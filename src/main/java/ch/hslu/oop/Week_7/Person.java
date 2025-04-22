package ch.hslu.oop.Week_7;

import java.util.Objects;

public class Person {
    final long id;
    String nickname;
    String name;

    public Person (long id, String name, String nickname){
        this.id = id;
        this.name = name;
        this.nickname = nickname;

    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getNickname(){
        return nickname;
    }

    @Override
    public String toString(){
        return String.format("%s aka %s, Id: %d", name, nickname, id);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        } else if (obj == null ) {
            return false;
        }else if(!(obj instanceof Person)) {
            return false;
        }else if(this.id == ((Person) obj).id){
            return true;
        }else{
            return false;
        } 
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id);
    }
    public static void main(String[] args) {
        Person person = new Person(0, "Sven", "Swini");
        System.out.println(person.toString());
    }
}
