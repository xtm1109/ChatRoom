/**
 *
 * The controller portion of the MVC pattern.
 */

import java.awt.event.ActionEvent;

public class ChatController implements PropertyChangeListener {
	private ChatView view;
	private ChatModel model;
	public static void main(String[] args) {
		
		controller.view.setSendListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final String message1 = controller.view.getSendText();
			}
		});
		controller.view.setExitListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		controller.view.setSendKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent arg0) {
				/** not implemented */
			}
			public void keyPressed(KeyEvent arg0) {
	            if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
	            }
			}
			public void keyReleased(KeyEvent arg0) {
				/** not implemented */
			}
		});
	}
}