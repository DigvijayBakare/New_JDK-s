package Java17;

import java.io.*;
import java.util.*;

public class DeserializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        byte[] data = serialize(Arrays.asList("Java", "17"));

        // Set deserialization filter
//        ObjectInputFilter filter = ObjectInputFilter.Config.createFilter("java.util.List;java.util.ArrayList;java.lang.String;!*");
        ObjectInputFilter filter = ObjectInputFilter.Config.createFilter("java.base/*;!*");
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data))) {
            in.setObjectInputFilter(filter);
            List<String> list = (List<String>) in.readObject();     // Deserialization happens here
            System.out.println("Deserialized List: " + list);
        }
    }

    private static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(out)) {
            oos.writeObject(obj);
        }
        return out.toByteArray();
    }
}