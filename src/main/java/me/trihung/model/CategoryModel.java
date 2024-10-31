package me.trihung.model;

import java.io.Serializable;


import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter

public class CategoryModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	@NotEmpty(message="Không rỗng")
	private String name;
	private String images;
	private int status;
	private Boolean isEdit=false;
}
