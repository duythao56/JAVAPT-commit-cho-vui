// default package
// Generated Nov 2, 2017 9:14:07 PM by Hibernate Tools 5.2.5.Final
package com.jds.jds.customerapp.Model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DateCost generated by hbm2java
 */
@Entity
@Table(name = "date_cost", catalog = "restaurant")
public class DateCost {

	private DateCostId id;
	private String typeOfCost;
	private long price;
	private String note;
	private Boolean flags;

	public DateCost() {
	}

	public DateCost(DateCostId id, long price) {
		this.id = id;
		this.price = price;
	}

	public DateCost(DateCostId id, String typeOfCost, long price, String note, Boolean flags) {
		this.id = id;
		this.typeOfCost = typeOfCost;
		this.price = price;
		this.note = note;
		this.flags = flags;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "departmentId", column = @Column(name = "departmentID", nullable = false)),
			@AttributeOverride(name = "dateOfCost", column = @Column(name = "dateOfCost", nullable = false, length = 10)) })
	public DateCostId getId() {
		return this.id;
	}

	public void setId(DateCostId id) {
		this.id = id;
	}

	@Column(name = "typeOfCost", length = 60)
	public String getTypeOfCost() {
		return this.typeOfCost;
	}

	public void setTypeOfCost(String typeOfCost) {
		this.typeOfCost = typeOfCost;
	}

	@Column(name = "price", nullable = false)
	public long getPrice() {
		return this.price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Column(name = "note", length = 300)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "flags")
	public Boolean getFlags() {
		return this.flags;
	}

	public void setFlags(Boolean flags) {
		this.flags = flags;
	}

}