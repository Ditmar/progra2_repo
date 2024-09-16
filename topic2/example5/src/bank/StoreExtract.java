package bank;

import java.util.ArrayList;

public class StoreExtract {
    private ArrayList<ItemStore> listExtract;
    public StoreExtract() {
        listExtract = new ArrayList<>();
    }
    public void register(Double quantity, String type) {
        ItemStore item = new ItemStore(quantity, type);
        listExtract.add(item);
    }
    public void printStore() {
        for (ItemStore item : this.listExtract) {
            item.print();
        }
    }
}
