import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Player {
	private String name;
	private Date dateOfBirth;
	private String skill;
	private int noOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	public Player(String name, Date dateOfBirth, String skill, int noOfMatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.noOfMatches = noOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, name, nationality, noOfMatches, powerRating, runs, skill, wickets);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(name, other.name)
				&& Objects.equals(nationality, other.nationality) && noOfMatches == other.noOfMatches
				&& Double.doubleToLongBits(powerRating) == Double.doubleToLongBits(other.powerRating)
				&& runs == other.runs && Objects.equals(skill, other.skill) && wickets == other.wickets;
	}
	
	
	public static Player createPlayer(String detail) {
		
		SimpleDateFormat sdft=new SimpleDateFormat("dd-MM-yyyy");
		try {
			Player player = new Player(detail.split(",")[0],sdft.parse(detail.split(",")[1]),detail.split(",")[2],
					                  Integer.parseInt(detail.split(",")[3]),Integer.parseInt(detail.split(",")[4]),
					                  Integer.parseInt(detail.split(",")[5]),detail.split(",")[6],Double.parseDouble(detail.split(",")[7]));
		
			return player;
		} catch (NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}




	
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
