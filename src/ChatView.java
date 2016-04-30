/**
 * The View component of the MVC pattern.
 */
import java.awt.Font;
public class ChatView {
	private JButton sendButton;
	private JButton exitButton;
	private JTextField sendText;
	private JTextArea displayArea;
	private JFrame frame;
	public ChatView() {
		frame = new JFrame("GUI Demo");
		/** anonymous inner class to handle window closing events */
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
		/**
		 * a panel used for placing components
		 */
		JPanel p = new JPanel();
		Border etched = BorderFactory.createEtchedBorder();
	    Border titled = BorderFactory.createTitledBorder(etched, "Enter Message Here ...");
	    p.setBorder(titled);

		/**
		 * set up all the components
		 */
		sendText = new JTextField("/i ", 30);
		sendButton = new JButton("Send");
		exitButton = new JButton("Exit");	
		 * add the components to the panel
		 */
		p.add(sendText);
		p.add(sendButton);
		p.add(exitButton);
		/**
		 * add the panel to the "south" end of the container
		 */
		frame.getContentPane().add(p,"South");
		/**
		 * add the text area for displaying output. Associate
		 * a scrollbar with this text area. Note we add the scrollpane
		 * to the container, not the text area
		 */
		displayArea = new JTextArea(15, 40);
		displayArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(displayArea);
		frame.getContentPane().add(scrollPane,"Center");
	
		/**
		 * set the title and size of the frame
		 */
		frame.pack();
		frame.setVisible(true);
		sendText.requestFocus();
	}
	
	public String getSendText() {
		return sendText.getText().trim();
	}
	public void setDisplayArea(String message) {
		displayArea.append(message);		   
		sendText.setText("/a "); // Default option is send a general message
		sendText.requestFocus();
	}
	 public void setSendListener(ActionListener al){
		 sendButton.addActionListener(al);
	 }
	 public void setExitListener(ActionListener al){
		 exitButton.addActionListener(al);
	 }
	 public void setSendKeyListener(KeyListener kl) {
		 sendText.addKeyListener(kl);
	 }
}