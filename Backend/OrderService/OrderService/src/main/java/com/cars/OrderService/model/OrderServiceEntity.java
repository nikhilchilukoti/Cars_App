package com.cars.OrderService.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Table(name="order_seriesmodel_details")
public class OrderServiceEntity  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="series_id")
	private int seriesId;
	
	@Column(name="model_id")
	private int modelId;
	
	@Column(name="price")
	private long price;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name ="order_id")
	private List<AccessoryModel> accessoryModel;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name ="order_id")
    private List<ColorModel> colorModel;

	

	public List<AccessoryModel> getAccessoryModel() {
		return accessoryModel;
	}



	public void setAccessoryModel(List<AccessoryModel> accessoryModel) {
		this.accessoryModel = accessoryModel;
	}



	public List<ColorModel> getColorModel() {
		return colorModel;
	}



	public void setColorModel(List<ColorModel> colorModel) {
		this.colorModel = colorModel;
	}



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public int getSeriesId() {
		return seriesId;
	}



	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}



	public int getModelId() {
		return modelId;
	}



	public void setModelId(int modelId) {
		this.modelId = modelId;
	}



	public long getPrice() {
		return price;
	}



	public void setPrice(long price) {
		this.price = price;
	}



	public OrderServiceEntity(int seriesId, int modelId, long price) {
		super();
		this.seriesId = seriesId;
		this.modelId = modelId;
		this.price = price;
	}




    
	

	

	

	
	
	
	
	

}
