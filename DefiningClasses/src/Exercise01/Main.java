package Exercise01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr =  new PrintWriter(new OutputStreamWriter(System.out));

        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] personDetails = br.readLine().split("\\s+");
            String name = personDetails[0];
            int age = Integer.parseInt(personDetails[1]);
            people.add(new Person(name, age));
        }

        people.stream().filter(e -> e.getAge() > 30).sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).forEach(e -> pr.println(e));
        pr.close();
    }
}
