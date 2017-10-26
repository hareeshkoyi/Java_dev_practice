package com.ha.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "TASK", uniqueConstraints = { @UniqueConstraint(columnNames = {
		"TITLE", "ASSIGNED" }) })
public class Task {
	@Id
	@Column(name = "TASK_ID")
	private int taskID;
	@Column(nullable = false)
	private String title;
	@Column(name = "DESCR", nullable = false)
	private String description;
	@Column(name = "EST_HOURS")
	private int estimatedHours;
	private String assigned;
	@Basic
	private String status;

	@Override
	public String toString() {
		return "Task [taskID=" + taskID + ", title=" + title + ", description="
				+ description + ", estimatedHours=" + estimatedHours
				+ ", assigned=" + assigned + ", status=" + status + "]";
	}

}
