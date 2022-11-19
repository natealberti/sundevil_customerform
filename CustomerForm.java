import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CustomerForm {
    private String fname;
    private String lname;
    private String CID;
    private String phone;
    private String savingsnum;
    private String checkingnum;

    public CustomerForm(String fname, String lname, String CID, String phone, String savingsnum, String checkingnum) {
        this.fname = fname;
        this.lname = lname;
        this.CID = CID;
        this.phone = phone;
        this.savingsnum = savingsnum;
        this.checkingnum = checkingnum;
    }

    public void writeToDatabase() {
        boolean alreadyExists = true;
        for(int i = 0; alreadyExists; i++) {
            try {
                String fileName = "CustomerForm" + i + ".txt";
                File file = new File(fileName);
                if(file.createNewFile()) {
                    alreadyExists = false;
                    System.out.println("New file create: " + fileName);

                    FileWriter myWriter = new FileWriter(fileName);
                    myWriter.write("First Name: " + fname + "\n");
                    myWriter.write("Last Name: " + lname + "\n");
                    myWriter.write("Customer ID: " + CID + "\n");
                    myWriter.write("Phone Number: " + phone + "\n");
                    myWriter.write("Savings Account Number: " + savingsnum + "\n");
                    myWriter.write("Checking Account Number: " + checkingnum + "\n");
                    myWriter.close();

                }
            }
            catch (IOException e) {
                System.out.println("An error occurred: ");
                e.getStackTrace();
            }
        }
    }
}