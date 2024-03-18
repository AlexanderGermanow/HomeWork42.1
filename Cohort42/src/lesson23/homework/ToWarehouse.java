package lesson23.homework;

import java.util.List;

public class ToWarehouse extends BaseDocument {

    public ToWarehouse(int id) {
        super(id);
    }

    public void toWarehouse(Warehouse warehouse) {
        warehouse.addAll(products);
    }
}
