/*
 * AnonymousJobShowService.java
 *
 * Copyright (C) 2012-2021 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.anonymous.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.stereotype.Service;

import acme.entities.tasks.Task;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractShowService;

@Service
public class AnonymousTaskShowService implements AbstractShowService<Anonymous, Task> {

	// Internal state ---------------------------------------------------------

	@Autowired
	protected AnonymousTaskRepository repository;


	@Override
	public boolean authorise(final Request<Task> request) {
		assert request != null;

		boolean result;
		int id;
		Task task;
		
		if (!request.getModel().hasAttribute("id")) {
			return false;
		}
		
		try {
			id = request.getModel().getInteger("id");
		} catch (final ConversionFailedException e) {
			return false;
		}
		task = this.repository.findOneTaskById(id);
		result = task != null && task.getIsPublic();

		return result;
	}

	// AbstractShowService<Anonymous, Task> interface --------------------------

	@Override
	public void unbind(final Request<Task> request, final Task entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "isPublic", "executionStart", "executionEnd");
		request.unbind(entity, model, "workload", "link", "description");
	}

	@Override
	public Task findOne(final Request<Task> request) {
		assert request != null;

		Task result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneTaskById(id);

		return result;
	}

}
