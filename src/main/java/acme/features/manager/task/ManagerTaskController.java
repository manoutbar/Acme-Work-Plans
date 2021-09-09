package acme.features.manager.task;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.tasks.Task;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Manager;

@Controller
@RequestMapping("/manager/task/")
public class ManagerTaskController extends AbstractController<Manager, Task> {

	// Internal state ---------------------------------------------------------

	@Autowired
	protected ManagerTaskListMineService	listMineService;

	@Autowired
	protected ManagerTaskShowService		showService;
	
	@Autowired
	protected ManagerTaskCreateService		createService;
	
	@Autowired
	protected ManagerTaskUpdateService		updateService;
	
	@Autowired
	protected ManagerTaskDeleteService		deleteService;


	@PostConstruct
	protected void initialise() {
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		super.addBasicCommand(BasicCommand.UPDATE, this.updateService);
		super.addBasicCommand(BasicCommand.DELETE, this.deleteService);
		super.addBasicCommand(BasicCommand.LIST, this.listMineService);
		
	}
}
