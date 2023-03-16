package seb2;

import felixstuff.Lookup;
import org.apache.commons.io.FileUtils;

import java.util.Map;

public class LookupImpl implements Lookup {

    private final Map<String, String> lookupMap = Map.of("key", "bundleTwo",
            "seb", "dev2");

    @Override
    public Object lookup(String s) {
        try {
            FileUtils utils = null;
        } catch (Exception e) {
            System.out.println("Failed to create a new FileUtils from commons io library");
        }
        return lookupMap.get(s);
    }
}
