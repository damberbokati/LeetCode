package person;

import product.Item;
import product.IceCreamFlavor;
import product.MixInFlavor;
import product.MixInAmount;
import product.MixIn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import product.Container;
import product.Order;

import emporium.Emporium;

public class Person {

    public Person(String name, String phone) {

        this.name = name;
        this.phone = phone;

    }

    public Person(BufferedReader br) throws IOException {

        this.name = br.readLine();
        this.phone = br.readLine();
    }

    public void save(BufferedWriter bw) throws IOException {

        bw.write(name + '\n');
        bw.write(phone + '\n');

    }

    public String toString() {

        return name + phone;

    }

    @Override
    public boolean equals(Object rhs) {

        if (rhs == this) {
            return true;
        }
        if (rhs.getClass() != this.getClass()) {
            return false;
        }

        Person p = (Person) rhs;

        return p.name.equals(this.name);
    }

    @Override
    public int hashCode() {

        return this.name.hashCode() * this.phone.hashCode();

    }

    protected String name;
    protected String phone;

}
