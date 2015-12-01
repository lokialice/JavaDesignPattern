package pattern.facadepattern;

public class ScheduleServerFacade {
	private final ScheduleServer scheduleServer;
	
	public ScheduleServerFacade(ScheduleServer scheduleServer){
		this.scheduleServer = scheduleServer;
	}
	public void startServer(){
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObject();
	}
	
	public void stopServer(){
		scheduleServer.realeaseProcesses();
		scheduleServer.destroy();
		scheduleServer.destroySystemObjects();
		scheduleServer.destroyListener();
		scheduleServer.destroyContext();
		scheduleServer.shutdown();
	}
}
