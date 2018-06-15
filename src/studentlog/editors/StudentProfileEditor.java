package studentlog.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import studentlog.model.StudentsEntry;
import studentlog.ui.StudentProfileEditorPanel;

public class StudentProfileEditor extends EditorPart {
	public static String ID = "studentlog.editors.studentprofile";

	private StudentProfileEditorPanel panel;

	public StudentProfileEditor() {

	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
		setPartName(getUser());
	}

	@Override
	public void createPartControl(Composite parent) {
		panel = new StudentProfileEditorPanel(parent, SWT.NONE);
	}

	public void fillEditorArea(StudentsEntry entry) {
		panel.fillPanelArea(entry);

	}

	public StudentProfileEditorPanel getPanel() {
		return panel;
	}

	@Override
	public void setFocus() {
		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getUser() {
		return ((StudentProfileEditorInput) getEditorInput()).getName();
	}

}
