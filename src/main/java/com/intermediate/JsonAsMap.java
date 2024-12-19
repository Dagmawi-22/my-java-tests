
package com.intermediate;

import java.util.HashMap;
import java.util.Map;

public class JsonAsMap {
    public static void main(String[] args) {

        Map<String, Object> personMap = new HashMap<>();
        personMap.put("name", "John Doe");
        personMap.put("age", 30);
        personMap.put("email", "john.doe@example.com");

        String mapAsJson = "{'name':" + "'" + personMap.get("name") + "'" + ", 'age':" + "'" + personMap.get("age")
                + "'" + ", 'email':"
                + "'" + personMap.get("email") + "'" + "}";
        System.out.println(mapAsJson);

        System.out.println("Name: " + personMap.get("name"));
        System.out.println("Age: " + personMap.get("age"));
        System.out.println("Email: " + personMap.get("email"));
    }
}
