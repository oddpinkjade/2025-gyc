package hw_250926.delivery;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class ItemService {

    private final ItemDao itemDao;
    //private Long nextId;
    private AtomicLong nextId;

    public ItemService(ItemDao itemDao) {
        this.itemDao = itemDao;
        //this.nextId = getMaxExistingId() + 1;
        this.nextId = new AtomicLong(getMaxExistingId() + 1);
    }

    private Long getMaxExistingId() {
        return itemDao.findAll().stream()
                .mapToLong(Item::getId)
                .max()
                .orElse(0L);
    }

    public void addItem(String name, int price, int orderLimit, int stock) {
        //Item item = new Item(nextId++, name, price, orderLimit, stock);
        long id = nextId.getAndIncrement();
        Item item = new Item(id, name, price, orderLimit, stock);
        itemDao.save(item);
    }

    public Item getItemById(Long id) {
        return itemDao.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 ID의 상품이 존재하지 않습니다: " + id));
    }

    public List<Item> getAllItems() {
        return itemDao.findAll();
    }

    public void updateItem(Long id, String newName, int newPrice, int newOrderLimit, int newStock) {
        if (!itemDao.existsById(id)) {
            throw new IllegalArgumentException("해당 ID의 상품이 존재하지 않아 업데이트할 수 없습니다: " + id);
        }
        itemDao.update(id, newName, newPrice, newOrderLimit, newStock);
    }

    public void deleteItem(Long id) {
        boolean deleted = itemDao.delete(id);
        if (!deleted) {
            throw new IllegalArgumentException("해당 ID의 상품이 존재하지 않습니다: " + id);
        }
    }

    public int getTotalItemCount() {
        return itemDao.count();
    }

    public int getSumTotalPrice() {
        return itemDao.sumTotalPrice();
    }
}
