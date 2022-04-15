import java.util.*;

public class Lab07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int iterations = Integer.parseInt(scan.nextLine());
        Map<String, Map<String, List<String>>> continentsAndCountries = new LinkedHashMap<>();

        for (int i = 0; i < iterations; i++) {
            String[] input = scan.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            continentsAndCountries.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> citiesOfCountry = continentsAndCountries.get(continent);
            citiesOfCountry.putIfAbsent(country, new ArrayList<>());
            List<String> cities = citiesOfCountry.get(country);
            cities.add(city);

            citiesOfCountry.put(country, cities);
            continentsAndCountries.put(continent, citiesOfCountry);
        }

        for (Map.Entry<String, Map<String, List<String>>> entry : continentsAndCountries.entrySet()) {
            System.out.println(entry.getKey() + ":");
            Map<String, List<String>> countries = continentsAndCountries.get(entry.getKey());
            for (Map.Entry<String, List<String>> country : countries.entrySet()) {
                System.out.printf("%s -> ", country.getKey());
                System.out.println(country.getValue().toString().replaceAll("[\\[\\]]", ""));
            }
        }
    }
}
