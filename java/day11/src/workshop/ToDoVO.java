package workshop;

public class ToDoVO {
	private String order;
	private String when;
	private String what;
	private boolean done;
	public ToDoVO() {
	}
	public ToDoVO(String order, String when, String what) {
		this.order = order;
		this.when = when;
		this.what = what;
		this.done = false;			
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
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
		return "ToDoVO [order=" + order + ", when=" + when + ", what=" + what + ", done=" + done + "]";
	}


	
}
