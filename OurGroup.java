import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Ekkasith"); //PUT YOUR NAME HERE
	groupMembers.add("Chaiwat");
	groupMembers.add("Weerin");
	groupMembers.add("Thitdanai");
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
