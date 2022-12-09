package comm.crickett.scorrer.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Getter
@Setter
@ToString 

public class Score {
	
	@Id 
	private long id;
	@Column
	private int teamnumber;
	@Column
	private String teamname;
	@Column
	private int run;
	@Column
	private int wickets;
	@Column
	private String description;
	
		

}