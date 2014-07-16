package org.GW2Mon.lib;

public class DefaultMutableTreeNode extends
		javax.swing.tree.DefaultMutableTreeNode {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object MainObject;

	public DefaultMutableTreeNode(org.GW2Mon.pojo.Recipe recipe) {
		super(recipe.getNameGer());
		setMainObject(recipe);
	}

	public DefaultMutableTreeNode(org.GW2Mon.pojo.Item item) {
		super(item.getNameGer());
		setMainObject(item);
	}

	public DefaultMutableTreeNode(String string) {
		super(string);
	}

	public Object getMainObject() {
		return MainObject;
	}

	public void setMainObject(Object mainObject) {
		MainObject = mainObject;
	}

}
