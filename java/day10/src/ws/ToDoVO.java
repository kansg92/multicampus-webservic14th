package ws;

public class ToDoVO {
	private String id;
	private String when;
	private String what;
	private boolean done;
	public ToDoVO() {
	}
	
	public ToDoVO(String id, String when, String what) {
		this.id = id;
		this.when = when;
		this.what = what;
		this.done = false;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}
	public String getWhat() {
		return what;
	}
	public void setWhat(String what) {
		this.what = what;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "ToDoVO [id=" + id + ", when=" + when + ", what=" + what + ", done=" + done + "]";
	}

	
	

}
