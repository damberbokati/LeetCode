package product;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import person.Customer;

public class Order {
    public Order() {
        this.servings = new ArrayList<>();
    }

    public Order(BufferedReader br) throws IOException {
        this.servings = new ArrayList<>();
        int numServings = Integer.parseInt(br.readLine());
        while (numServings-- > 0)
            servings.add(new Serving(br));
    }

    public void save(BufferedWriter bw) throws IOException {
        bw.write("" + servings.size() + '\n');
        for (Serving s : servings)
            s.save(bw);
    }

    public Customer getCustomer() {

        return customer;

    }

    public ArrayList<Serving> servings() {

        return this.servings();

    }

    public int price() {

        int sum = 0;
        for (Serving a : servings) {

            sum = sum + a.price();
        }

        return sum;

    }

    public void addServing(Serving serving) {
        servings.add(serving);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String separator = "";
        if (servings.size() > 0) {
            for (Serving s : servings) {
                result.append(separator + s.toString());
                separator = "<br/>";
            }
        }
        return result.toString();
    }

    private ArrayList<Serving> servings;
    private Customer customer;
}