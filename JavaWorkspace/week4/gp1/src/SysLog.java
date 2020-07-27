

public class SysLog {
    private Object error;
    public SysLog(Exception ex) {
        this.error = ex;
	}
    public Object getError (){
        return this.error;
    }
    public void printError() {
        System.out.print(this.getError());
    }
}
