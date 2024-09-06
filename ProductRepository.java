package item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

public interface DefectiveItemRepository extends JpaRepository<DefectiveItem, Long> {
}



