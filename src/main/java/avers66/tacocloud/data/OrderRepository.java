package avers66.tacocloud.data;

import avers66.tacocloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * OrderRepository
 *
 * @Author Tretyakov Alexandr
 */

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
