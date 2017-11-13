package com.github.kaurrohumae.app;

import com.github.kaurrohumae.app.domain.model.ItemType;
import com.github.kaurrohumae.app.domain.model.StockItem;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}
