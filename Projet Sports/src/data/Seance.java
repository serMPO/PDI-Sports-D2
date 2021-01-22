package data;

import java.util.Date;

public abstract class Seance 
{
	private int id;
	private Date date;
	private int duree;
	
	
	public Seance() {	}
	
	public Seance(Date date, int duree) 
	{
		this.date = date;
		this.duree = duree;
	}
	
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public Date getDate() 
	{
		return date;
	}
	
	public void setDate(Date date) 
	{
		this.date = date;
	}
	
	public int getDuree() 
	{
		return duree;
	}
	
	public void setDuree(int duree) 
	{
		this.duree = duree;
	}


	public String toString()
	{
		return "Date : " + date + "  -  Durée : " + duree + " min";
	}

	
	
		

}
