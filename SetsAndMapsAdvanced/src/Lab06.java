import java.util.*;

public class Lab06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        Map<String, Map<String, Double>> shopsAndProducts = new TreeMap<>();

        while(!"Revision".equals(input[0])){
            String shop = input[0];
            String product = input[1];
            double price = Double.parseDouble(input[2]);
            shopsAndProducts.putIfAbsent(shop, new LinkedHashMap<String, Double>());
            Map<String, Double> listOfProducts = shopsAndProducts.get(shop);
            listOfProducts.put(product, price);
            shopsAndProducts.put(shop, listOfProducts);

            input = scan.nextLine().split(", ");
        }

        for (Map.Entry<String, Map<String, Double>> entry : shopsAndProducts.entrySet()) {
            System.out.println(entry.getKey() + "->");
            Map<String, Double> listOfProducts = shopsAndProducts.get(entry.getKey());
            for (Map.Entry<String, Double> product : listOfProducts.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n", product.getKey(), product.getValue());
            }
        }
    }
}
