package product;

import java.util.ArrayList;

import javax.xml.transform.Source;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Scoop {
    public Scoop(IceCreamFlavor flavor) {
        this.flavor = flavor;
        this.mixins = new ArrayList<>();
    }

    public Scoop(BufferedReader br) throws IOException {
        this.flavor = new IceCreamFlavor(br);
        this.mixins = new ArrayList<>();
        int numMixIns = Integer.parseInt(br.readLine());
        while (numMixIns-- > 0)
            mixins.add(new MixIn(br));
    }

    public void save(BufferedWriter bw) throws IOException {
        flavor.save(bw);
        bw.write("" + mixins.size() + '\n');
        for (MixIn mi : mixins)
            mi.save(bw);
    }

    public void addMixIn(MixIn mixin) {
        mixins.add(mixin);
    }

    public int price() {

        // MixIn mixin = new MixIn();

        // mixin aeraylist <mixin1 , mixin2 , mixin3>
        // flavour
        int sum = 0;
        for (MixIn a : mixins) {

            sum = sum + a.price();
        }

        int flavorPrice = this.flavor.price();

        return sum + flavorPrice;

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(flavor.toString());
        if (mixins.size() > 0) {
            String separator = " with ";
            for (MixIn m : mixins) {
                result.append(separator + m.toString());
                separator = ", ";
            }
        }
        return result.toString();
    }

    private IceCreamFlavor flavor;
    private ArrayList<MixIn> mixins;;
}