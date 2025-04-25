package ch.hslu.oop.Week_7;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person>, Comparator<Person>{
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

    @Override
    public int compareTo(Person p){
        if (this.id == p.id) {
            return 0;
        }else if (this.id > p.id) {
            return 1;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Person person = new Person(0, "Sven", "Swini");
        System.out.println(person.toString());
    }

    @Override
    public int compare(Person o1, Person o2) {
        int i = 0;
        int j = 0;
    
        if (o2.id > o1.id) {
            return -1;
        } else if (o1.id > o2.id) {
            return 1;
        } else {
            // Compare names character by character
            char[] name1 = o1.name.toCharArray();
            char[] name2 = o2.name.toCharArray();
    
            while (j < name1.length && j < name2.length) {
                if (name1[j] == name2[j]) {
                    j++;
                } else if (name1[j] > name2[j]) {
                    return 1;
                } else {
                    return -1;
                }
            }
            // Handle case where names are different lengths
            if (name1.length > name2.length) {
                return 1;
            } else if (name1.length < name2.length) {
                return -1;
            }
    
            // Compare nicknames character by character
            char[] nickname1 = o1.nickname.toCharArray();
            char[] nickname2 = o2.nickname.toCharArray();
            int l = 0;
    
            while (l < nickname1.length && l < nickname2.length) {
                if (nickname1[l] == nickname2[l]) {
                    l++;
                } else if (nickname1[l] > nickname2[l]) {
                    return 1;
                } else {
                    return -1;
                }
            }
            // Handle case where nicknames are different lengths
            if (nickname1.length > nickname2.length) {
                return 1;
            } else if (nickname1.length < nickname2.length) {
                return -1;
            }
    
            // All fields are equal
            return 0;
        }
    }

}