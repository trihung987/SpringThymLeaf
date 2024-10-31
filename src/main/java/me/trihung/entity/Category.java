package me.trihung.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
@Table(name="categories")
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="categoryid")
	private Long id;
	@Column(name="categoryname",columnDefinition="nvarchar(50)")
	@NotEmpty(message = "không được bỏ trống")
	private String name;
	@Column(name="images",columnDefinition = "nvarchar(500)")
	private String images;
	private int status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
