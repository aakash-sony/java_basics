public class Student 
{
    private String stName;
    private int stMarks;
    
    public Student(String stName, int stMarks)
    {
    	this.stName = stName;
    	this.stMarks = stMarks;
    }

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getStMarks() {
		return stMarks;
	}

	public void setStMarks(int stMarks) {
		this.stMarks = stMarks;
	}

	@Override
	public String toString() {
		return this.stName;
	}
    
    
}
