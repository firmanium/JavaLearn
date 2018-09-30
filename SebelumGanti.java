// SebelumGanti.java

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

class SebelumGanti {
	private static void gantiIcon() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f = new JFrame("Icon Belum Terganti");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400); f.setVisible(true);
	}

public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			gantiIcon();
		}
	});
}

}

