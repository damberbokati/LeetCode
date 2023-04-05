package person;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import product.Item;
import product.IceCreamFlavor;
import product.MixInFlavor;
import product.MixInAmount;
import product.MixIn;
import product.Container;
import product.Order;

import javax.swing.text.DefaultEditorKit.CutAction;

public class Customer extends Person {

    public Customer(String name, String phone) {

        super(name, phone);
    }

    public Customer(BufferedReader br) throws IOException {

        super(br);
    }

    public void save(BufferedWriter bw) throws IOException {
        bw.write(name + '\n');
        bw.write(phone + '\n');
    }

}
