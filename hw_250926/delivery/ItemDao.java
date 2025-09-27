package hw_250926.delivery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ItemDao {

    private final String fileName;
    private final List<Item> items;

    public ItemDao(String fileName) {
        this.fileName = fileName;
        this.items = loadCsv(fileName);
    }

    private List<Item> loadCsv(String fileName) {
        List<Item> items = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine(); // 첫 줄 스킵

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                Long id = Long.parseLong(parts[0].trim());
                String name = parts[1].trim();
                int price = Integer.parseInt(parts[2].trim());
                int orderLimit = Integer.parseInt(parts[3].trim());
                int stock = Integer.parseInt(parts[4].trim());
                items.add(new Item(id, name, price, orderLimit, stock));
            }

        } catch (IOException e) { // TODO: 에러 처리 더 구체적으로
            System.out.println("파일 읽기 실패: " + e.getMessage());
        }

        return items;
    }

    public void save(Item item) {
        items.add(item);
        writeCsv();
    }

    private void writeCsv() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("id,name,price,orderLimit,stock");
            for (Item item : items) {
                pw.printf("%d, %s, %d, %d, %d\n",
                        item.getId(), item.getName(), item.getPrice(), item.getOrderLimit(), item.getStock());
            }

        } catch (IOException e) {
            System.out.println("파일 저장 실패: " + e.getMessage());
        }
    }

    public Optional<Item> findById(Long id) {
        return items.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst();
    }

    public List<Item> findAll() {
        return Collections.unmodifiableList(items);
    }

    public void update(Long id, String newName, int newPrice, int newOrderLimit, int newStock) {
        items.stream()
                .filter(i -> i.getId().equals(id))
                .forEach(i -> {
                    i.setName(newName);
                    i.setPrice(newPrice);
                    i.setOrderLimit(newOrderLimit);
                    i.setStock(newStock);
                });
    }

    public boolean delete(Long id) {
        boolean removed = items.removeIf(i -> i.getId().equals(id));
        if (removed) {
            writeCsv();
        }
        return removed;
    }

    public int count() {
        return items.size();
    }

    public int sumTotalPrice() {
        return items.stream().mapToInt(Item::getTotalPrice).sum();
    }

    public boolean existsById(Long id) {
        return items.stream().anyMatch(i -> i.getId().equals(id));
    }
}
