public class ConfirmExit extends SingleFrameApplication {
    private JButton exitButton;

    @Override
    protected void startup() {
        getMainFrame().setTitle("ConfirmExit");
        exitButton = new JButton("Exit Application");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exit(e);
            }

        });
        addExitListener(new ExitListener() {
            public boolean canExit(EventObject e) {
                boolean bOkToExit = false;
                Component source = (Component) e.getSource();
                bOkToExit = JOptionPane.showConfirmDialog(source,
                                "Do you really want to exit?") ==
                                JOptionPane.YES_OPTION;
                return bOkToExit;
            }
            public void willExit(EventObject event) {

            }
        });
        show(exitButton);
    }

    @Override
    protected void shutdown() {
        // The default shutdown saves session window state.
        super.shutdown();
        // Now perform any other shutdown tasks you need.
        // ...
    }

    /**
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Application.launch(ConfirmExit.class, args);
    }

}