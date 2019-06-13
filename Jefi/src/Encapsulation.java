class Main{
	//private variables declared
	//these can be accessed by public methods of class
    private int serialnum;
    private String name;
    private int age;
    //getter method
    public int getEmpserialnum(){
        return serialnum;
    }
    public String getEmpName(){
        return name;
    }
    public int getEmpAge(){
        return age;
    }
    //setter method
    public void setEmpAge(int newValue){
        age = newValue;
    }
    public void setEmpName(String newValue){
        name = newValue;
    }
    public void setEmpSSN(int newValue){
        serialnum = newValue;
    }
}
public class Encapsulation {
	 public static void main(String args[]){
	        Main obj = new Main();
	        //setting values to the variables
	        obj.setEmpName("Bennet");
	        obj.setEmpAge(25);
	        obj.setEmpSSN(4234198);
	        //displaying values of the variables
	        System.out.println("Employee Name: " + obj.getEmpName());
	        System.out.println("Employee Serial number: " + obj.getEmpserialnum());
	        System.out.println("Employee Age: " + obj.getEmpAge());
	    } 

}
