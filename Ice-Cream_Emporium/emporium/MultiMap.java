package emporium;

import product.*;
import person.*;
import java.util.HashMap;
import java.util.HashSet;

import javax.xml.crypto.KeySelector.Purpose;

public class MultiMap {

    public void put(Customer K, Serving V) {

        if (map.get(K).equals(null)) {

            HashSet<Serving> listOfServing = new HashSet<Serving>();
            listOfServing.add(V);
            map.put(K, listOfServing);

        }

        else {

            HashSet<Serving> listOfServing = map.get(K);
            listOfServing.add(V);
            map.put(K, listOfServing);
        }
    }

    public Object[] get(Customer K) {

        if (map.get(K).equals(null)) {

            return null;

        }

        else {

            HashSet<Serving> listOfServing = map.get(K);
            return listOfServing.toArray();

        }

    }

    private HashMap<Customer, HashSet<Serving>> map;

    public MultiMap() {

    }

}
