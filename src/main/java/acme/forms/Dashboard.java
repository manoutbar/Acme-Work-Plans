/*
 * Dashboard.java
 *
 * Copyright (C) 2012-2021 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.forms;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard implements Serializable {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Double						averageNumberOfJobsPerEmployer;
	Double						averageNumberOfApplicationsPerWorker;
	Double						averageNumberOfApplicationsPerEmployer;
	Double						ratioOfPendingApplications;
	Double						ratioOfAcceptedApplications;
	Double						ratioOfRejectedApplications;
	Double						totalNumberOfPublicTasks;
	Double						totalNumberOfPrivateTasks;
	Double						totalNumberOfFinishedTasks;
	Double						totalNumberOfUnfinishedTasks;
	Double						averageNumberOfTasksExecutionPeriod;
	Double						deviationNumberOfTasksExecutionPeriod;
	Double						minimumTaskExecutionPeriod;
	Double						maximumTaskExecutionPeriod;
	Double						averageNumberOfTasksWorkload;
	Double						deviationNumberOfTasksWorkload;
	Double						minimumTasksWorkload;
	Double						maximumTasksWorkload;
	Double						totalNumberOfWorkPlans;
	Double						totalNumberOfPublishedWorkPlans;
	Double						totalNumberOfPublicWorkPlans;
	Double						totalNumberOfPrivateWorkPlans;
	Double						totalNumberOfFinishedWorkPlans;
	Double						totalNumberOfNonFinishedWorkPlans;
	Double						averageNumberOfWorkPlansExecutionPeriod;
	Double						deviationSumOfWorkPlansExecutionPeriod;
	Double						minimumWorkPlansExecutionPeriod;
	Double						maximumWorkPlansExecutionPeriod;
	Double						averageNumberOfWorkPlansWorkloads;
	Double						deviationNumberOfWorkPlansWorkloads;
	Double						minimumWorkPlanWorkload;
	Double						maximumWorkPlanWorkload;


	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
