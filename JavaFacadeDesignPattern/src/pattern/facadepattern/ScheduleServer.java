package pattern.facadepattern;

public class ScheduleServer {
	public void startBooting(){
		System.out.println("Server Start Booting...");
	}
	
	public void readSystemConfigFile(){
		System.out.println("Read System Config File....");
	}
	
	public void init(){
		System.out.println("Init Server....");
	}
	
	public void initializeContext(){
		System.out.println("Initialize Context....");
	}
	
	public void initializeListeners(){
		System.out.println("Initialize Listen...");
	}
	
	public void createSystemObject(){
		System.out.println("Create System Object....");
	}
	
	public void realeaseProcesses(){
		System.out.println("Realease Processes...");
	}
	
	public void destroy(){
		System.out.println("Destroy...");
	}
	
	public void destroySystemObjects(){
		System.out.println("Destroy System Object....");
	}
	
	public void destroyListener(){
		System.out.println("Destroy Listener...");
	}
	
	public void destroyContext(){
		System.out.println("Destroy Context...");
	}
	
	public void shutdown(){
		System.out.println("Shut down....");
	}
}
