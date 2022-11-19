import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class ContentPanel extends JPanel {

    private JLabel titleT, fnameText, lnameText, CIDtext, phonetext, savingstext, checkingtext;
    private JTextArea fnamePrompt, lnamePrompt, CIDprompt, phoneprompt, savingsprompt, checkingprompt;
    private JPanel title, firstName, lastName, CID, phone, savings, checking, saveB, cancelB;
    private JButton save, cancel;
    private Color yellow = new Color(255, 198, 39);
    private Color red = new Color(140, 29, 64);

    public ContentPanel(JFrame frame) { 

        // title text
        title = new JPanel();
		title.setSize(500, 50);
		title.setLocation(130, 0);
		title.setBackground(red);

        titleT = new JLabel("Customer Form: SunDevil Bank");
        titleT.setFont(new Font("Arial", Font.BOLD, 30));
        titleT.setLocation(0, 0);

        // first name
        firstName = new JPanel();
		firstName.setSize(250, 50);
		firstName.setLocation(20, 70);
		firstName.setBackground(yellow);

        fnameText = new JLabel("First Name: ");
        fnameText.setFont(new Font("Arial", Font.PLAIN, 20));
        fnameText.setLocation(0, 0);

        fnamePrompt = new JTextArea(1, 5);

        // last name
        lastName = new JPanel();
		lastName.setSize(250, 50);
		lastName.setLocation(500, 70);
		lastName.setBackground(yellow);

        lnameText = new JLabel("Last Name: ");
        lnameText.setFont(new Font("Arial", Font.PLAIN, 20));
        lnameText.setBackground(yellow);

        lnamePrompt = new JTextArea(1, 5);

        // customer ID
        CID = new JPanel();
		CID.setSize(250, 50);
		CID.setLocation(20, 140);
        CID.setBackground(yellow);

        CIDtext = new JLabel("Customer ID: ");
        CIDtext.setFont(new Font("Arial", Font.PLAIN, 20));

        CIDprompt = new JTextArea(1, 5);

        // phone number
        phone = new JPanel();
		phone.setSize(250, 50);
		phone.setLocation(500, 140);
		phone.setBackground(yellow);

        phonetext = new JLabel("Phone number: ");
        phonetext.setFont(new Font("Arial", Font.PLAIN, 20));
        phonetext.setLocation(0, 0);

        phoneprompt = new JTextArea(1, 5);

        // savings acc
        savings = new JPanel();
		savings.setSize(250, 50);
		savings.setLocation(20, 300);
		savings.setBackground(yellow);

        savingstext = new JLabel("Savings account #: ");
        savingstext.setFont(new Font("Arial", Font.PLAIN, 20));
        savingstext.setLocation(0, 0);

        savingsprompt = new JTextArea(1, 5);

        // checking acc
        checking = new JPanel();
		checking.setSize(250, 50);
		checking.setLocation(500, 300);
		checking.setBackground(yellow);

        checkingtext = new JLabel("Checking account #: ");
        checkingtext.setFont(new Font("Arial", Font.PLAIN, 20));
        checkingtext.setLocation(0, 0);

        checkingprompt = new JTextArea(1, 5);


        // cancel button
        cancelB = new JPanel();
		cancelB.setSize(85, 50);
		cancelB.setLocation(30, 400);
        cancelB.setBackground(yellow);

        cancel = new JButton("Cancel");
        cancel.setPreferredSize(new Dimension(75, 40));
        cancel.addActionListener(new CancelButtonListener(frame));

        // save button
        saveB = new JPanel();
		saveB.setSize(85, 50);
		saveB.setLocation(550, 400);
        saveB.setBackground(yellow);

        save = new JButton("Save");
        save.setPreferredSize(new Dimension(75, 40));
        save.addActionListener(new ButtonListener(frame));


        title.add(titleT);

        firstName.add(fnameText);
        firstName.add(fnamePrompt);

        lastName.add(lnameText);
        lastName.add(lnamePrompt);

        CID.add(CIDtext);
        CID.add(CIDprompt);

        phone.add(phonetext);
        phone.add(phoneprompt);

        savings.add(savingstext);
        savings.add(savingsprompt);

        checking.add(checkingtext);
        checking.add(checkingprompt);

        cancelB.add(cancel);

        saveB.add(save);

        frame.add(firstName);
        frame.add(lastName);
        frame.add(CID);
        frame.add(phone);
        frame.add(savings);
        frame.add(checking);
        frame.add(cancelB);
        frame.add(saveB);
        frame.add(title);

    }

    public class ButtonListener implements ActionListener {
    	public ButtonListener(JFrame frame) {
    	}

        @Override
        public void actionPerformed(ActionEvent event) {

        	String fname = fnamePrompt.getText();
			String lname = lnamePrompt.getText();
			String CID = CIDprompt.getText();
            String phone = phoneprompt.getText();
            String savings = savingsprompt.getText();
            String checking = checkingprompt.getText();
			CustomerForm c = new CustomerForm(fname, lname, CID, phone, savings, checking);

			c.writeToDatabase();
        }
    }

    public class CancelButtonListener implements ActionListener {
    	public CancelButtonListener(JFrame frame) {
    	}

        @Override
        public void actionPerformed(ActionEvent event) {

        	fnamePrompt.setText("");
			lnamePrompt.setText("");
			CIDprompt.setText("");
            phoneprompt.setText("");
            savingsprompt.setText("");
            checkingprompt.setText("");
        }
    }

}
