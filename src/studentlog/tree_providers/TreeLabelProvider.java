package studentlog.tree_providers;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import studentlog.Const;
import studentlog.ImageKeys;
import studentlog.model.ITreeItem;
import studentlog.model.StudentsEntry;

public class TreeLabelProvider extends ColumnLabelProvider {

    private Image folderImg;
    private Image studentIconImg;

    public TreeLabelProvider() {
        folderImg = AbstractUIPlugin
                .imageDescriptorFromPlugin(Const.BUNDLE_ID.getValue(), ImageKeys.CLOSED_FOLDER.getFilePath())
                .createImage();
        studentIconImg = AbstractUIPlugin
                .imageDescriptorFromPlugin(Const.BUNDLE_ID.getValue(), ImageKeys.STUDENT_ICON.getFilePath())
                .createImage();
    }

    @Override
    public Image getImage(Object element) {
        if (element instanceof StudentsEntry) {
            return studentIconImg;
        }
        return folderImg;
    }

    @Override
    public String getText(Object element) {
        return ((ITreeItem) element).getName();
    }

}
