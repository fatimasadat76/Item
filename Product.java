package item;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "products")
	public class Product<Long> {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "item")
	    private String item;

	    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
	    private DefectiveItem defectiveItem;

	    
	}

	@Entity
	@Table(name = "defective_items")
	public class DefectiveItem<String, Long> {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "item")
	    private String item;

	    @Column(name = "reason")
	    private String reason;

	    @OneToOne
	    @JoinColumn(name = "product_id")
	    private Product product;

	   
	}


