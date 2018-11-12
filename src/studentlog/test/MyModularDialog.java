package studentlog.test;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class MyModularDialog extends Dialog {

    public MyModularDialog(Shell parentShell) {
        super(parentShell);
        setShellStyle(SWT.CLOSE | SWT.APPLICATION_MODAL | SWT.BORDER | SWT.TITLE);
        setBlockOnOpen(false);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        Button button = new Button(container, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
        button.setText("Press");
        button.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event e) {
              switch (e.type) {
              case SWT.Selection:
                System.out.println("Button pressed");
                MyNonModularDialog dialog = new MyNonModularDialog(parent.getShell());
                dialog.create();
                dialog.open();
                break;
              }
            }
          });
        return container;
    }

    @Override
    protected Point getInitialSize() {
        return new Point(450, 300);
    }
}