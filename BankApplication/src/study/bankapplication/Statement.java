package study.bankapplication;

import java.util.Date;

public class Statement {

	private Date date;
	private long availablebalance;
	/**
	 * @param date
	 * @param availablebalance
	 */
	public Statement(Date date, long availablebalance) {
		this.date = date;
		this.availablebalance = availablebalance;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the availablebalance
	 */
	public long getAvailablebalance() {
		return availablebalance;
	}
	/**
	 * @param availablebalance the availablebalance to set
	 */
	public void setAvailablebalance(long availablebalance) {
		this.availablebalance = availablebalance;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Statement [date=" + date + ", availablebalance=" + availablebalance + "]";
	}
	
	
	
	
}
