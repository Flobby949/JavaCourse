package com.java.lavaclone.study.strange;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author Flobby
 * @version :1.0
 * @date :2020/4/12
 * @ClassName :犬hash类
 */

public class Dog {
    String name;
    String Tel;

    public Dog(String name, String tel) {
        this.name = name;
        Tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(Tel, dog.Tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Tel);
    }

    @Override
    public String toString() {
        return name+"的主人的电话号码是："+Tel;
    }

    public static void main(String[] args) {
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog("欧迪","111111111"));
        dogs.add(new Dog("小宝","222222222"));
        dogs.add(new Dog("大黄","333333333"));
        dogs.add(new Dog("伊利丹","444444444"));
        dogs.add(new Dog("欧迪","111111111"));

        for (Dog dog : dogs){
            System.out.println(dog);
        }
        
    }
}
